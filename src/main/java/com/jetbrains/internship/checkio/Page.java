package com.jetbrains.internship.checkio;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
