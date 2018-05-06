package com.jetbrains.internship.checkio;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static final String BASE_URL = "https://stepik.org";
    public static final int pageCount = 300;

    public static void main(String... args) throws IOException {
        System.out.print("Enter number of top courses: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 1) {
            throw new IOException("The number must be positive");
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        StepikService stepikService = retrofit.create(StepikService.class);

        PriorityBlockingQueue<Course> queue = new PriorityBlockingQueue<Course>(2500, new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o2.learnersCount - o1.learnersCount;
            }
        });

        Callback<Page> callback = new Callback<Page>() {
            int count = 0;
            @Override
            public void onResponse(Call<Page> call, retrofit2.Response<Page> response) {
                if(response.body() != null) {
                    for (Course x : response.body().courses) {
                        if (x != null) {
                            queue.add(x);
                        }
                    }
                }
                checkCount();
            }

            @Override
            public void onFailure(Call<Page> call, Throwable t) {
                checkCount();
            }

            synchronized void checkCount() {
                count++;
                if (count == pageCount) {
                    for(int i = 0; i < N && !queue.isEmpty(); i++) {
                        Course course = queue.poll();
                        System.out.println(course.title + " " + course.learnersCount);
                    }
                }
            }
        };

        for(int i = 1; i <= pageCount; i++) {
            Call<Page> resp = stepikService.getPage(i);
            resp.enqueue(callback);
        }

    }


}
