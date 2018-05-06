package com.jetbrains.internship.checkio;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StepikService {
    @GET("api/courses")
    Call<Page> getPage(@Query("page") int pageId);
}
