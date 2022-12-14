package com.example.lessonnumder.lovemodel

import com.google.gson.annotations.SerializedName
import java.io.Serializable

//fname:"John"
//sname:"Alice"
//percentage:"46"
//result:"Can choose someone better."

data class LoveModel (

        @SerializedName("fname")
        var firstname: String,
        @SerializedName("sname")
        var secondname: String,
        var persentage: String,
        var result: String,

        ) : Serializable


