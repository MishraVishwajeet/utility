package com.hashedin.utility.services
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*
interface OTP {
    @FormUrlEncoded
    @POST("/api/v1/generate-otp/")
    fun generate_OTP(@Field("type")type:String,@Field("username")username:String):Call<Void>

    @FormUrlEncoded
    @POST("/api/v1/verify-otp/")
    fun verify_OTP(@Field("otp")otp:String,@Field("username")username:String):Call<JsonObject>

    @FormUrlEncoded
    @POST("/api/v1/signup/")
    fun signUp(@Field("username")username:String,@Field("first_name")first_name:String,@Field("password")password:String,@Field("isServiceProvider")isServiceProvider:Boolean,@Field("verifiedToken")verifiedToken:String):Call<JsonObject>
}