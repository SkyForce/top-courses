package com.jetbrains.internship.checkio;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
