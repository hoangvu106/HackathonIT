/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apihelpers;

import models.BaseResult;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 *
 * @author Hau
 */
public interface APIUser {
    @FormUrlEncoded
    @POST("/login")
    Call<BaseResult> login(@Field("account") String account, @Field("password") String password);
}
