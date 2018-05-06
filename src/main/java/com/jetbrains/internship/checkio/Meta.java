package com.jetbrains.internship.checkio;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Meta {

    @SerializedName("page")
    @Expose
    public Integer page;
    @SerializedName("has_next")
    @Expose
    public Boolean hasNext;
    @SerializedName("has_previous")
    @Expose
    public Boolean hasPrevious;
}
