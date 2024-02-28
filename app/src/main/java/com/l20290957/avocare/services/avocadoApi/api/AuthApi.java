package com.l20290957.avocare.services.avocadoApi.api;

import com.l20290957.avocare.services.avocadoApi.models.auth.User;
import com.l20290957.avocare.services.avocadoApi.models.auth.responses.CreateUser;
import com.l20290957.avocare.services.avocadoApi.models.auth.responses.LoginUser;
import com.l20290957.avocare.services.avocadoApi.models.auth.responses.UserListResponse;
import com.l20290957.avocare.services.avocadoApi.models.auth.responses.UserResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AuthApi {

    @GET("auth")
    Observable<UserListResponse> getUserList(@Header("Authorization")String token);

    @GET("auth/{id}")
    Observable<UserResponse>getUserInfo(@Header("Authorization")String token,
                                        @Path("id")String idUsuario);

    @POST("auth/login")
    Observable<UserResponse>login(@Body LoginUser login);

    @POST("auth/register")
    Observable<User>register(@Body CreateUser createUser);

    @PATCH("auth/{id}")
    Observable<UserResponse> editUser (@Header("Authorization")String token,
                                       @Path("id")String idUsuario,
                                       @Body User editUser);

    @DELETE("auth/{id}")
    Observable<UserResponse>deleteUser(@Header("Authorization")String token,
                                       @Path("id")String idUsuario);




}
