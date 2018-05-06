package com.jetbrains.internship.checkio;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Page {
    @SerializedName("meta")
    @Expose
    public Meta meta;
    @SerializedName("courses")
    @Expose
    public List<Course> courses = null;
    @SerializedName("enrollments")
    @Expose
    public List<Object> enrollments = null;

}
