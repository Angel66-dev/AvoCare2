package com.l20290957.avocare.services.avocadoApi.api;

import com.l20290957.avocare.services.avocadoApi.models.Huertos.Huertos;
import com.l20290957.avocare.services.avocadoApi.models.Huertos.responses.CreateHuertos;
import com.l20290957.avocare.services.avocadoApi.models.Huertos.responses.HuertosIdResponse;
import com.l20290957.avocare.services.avocadoApi.models.Huertos.responses.HuertosListResponse;
import com.l20290957.avocare.services.avocadoApi.models.Huertos.responses.HuertosUserListResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface HuertosApi {
    @GET("nutrientes")
    Observable<HuertosListResponse> getHuertosList (@Header("Authorization")String token);

    @GET("nutrientes/{id}")
    Observable<HuertosIdResponse> getHuertosInfo (@Header("Authorization")String token,
                                                  @Path("id")String idHuertos);
    @GET("huertos/byuserid/{id}")
    Observable<HuertosUserListResponse> getUserHuertosInfo (@Header("Authorization")String token,
                                                            @Path("id")String idUsuario);

    @POST("nutrientes")
    Observable<HuertosIdResponse> createHuertos (@Header("Authorization")String token,
                                       @Body CreateHuertos createHuertos);

    @PATCH("nutrientes/{id}")
    Observable<HuertosIdResponse> editHuertos (@Header("Authorization")String token,
                                             @Path("id")String idHuertos,
                                             @Body Huertos editHuertos);

    @DELETE("nutrientes/{id}")
    Observable<HuertosIdResponse> deleteHuertos (@Header("Authorization")String token,
                                               @Path("id")String idHuertos);
}
