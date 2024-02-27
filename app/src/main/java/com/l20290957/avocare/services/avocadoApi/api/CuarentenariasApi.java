package com.l20290957.avocare.services.avocadoApi.api;

import com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.Cuarentenarias;
import com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.responses.CreateCuarentenarias;
import com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.responses.CuarentenariasIdHuertoResponse;
import com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.responses.CuarentenariasIdPlagaResponse;
import com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.responses.CuarentenariasIdResponse;
import com.l20290957.avocare.services.avocadoApi.models.Cuarentenarias.responses.CuarentenariasListResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface CuarentenariasApi {
    @GET("plagas-cuarentenarias")
    Observable<CuarentenariasListResponse> getCuarentenariasList (@Header("Authorization")String token);

    @GET("plagas-cuarentenarias/{id}")
    Observable<CuarentenariasIdResponse> getCuarentenariasInfo (@Header("Authorization")String token,
                                                                @Path("id")String idCuarentenarias);
    @GET("plagas-cuarentenarias/byplagaid/{id}")
    Observable<CuarentenariasIdPlagaResponse> getCuarentenariasPlagaInfo (@Header("Authorization")String token,
                                                                          @Path("id")String idPlagas);

    @GET("plagas-cuarentenarias/byhuertoid/{id}")
    Observable<CuarentenariasIdHuertoResponse> getCuarentenariasHuertoList(@Header("Authorization") String token,
                                                                                   @Path("id") String idHuerto);

    @POST("plagas-cuarentenarias")
    Observable<Cuarentenarias> createCuarentenarias (@Header("Authorization")String token,
                                                     @Body CreateCuarentenarias createCuarentenarias);

    @PATCH("plagas-cuarentenarias/{id}")
    Observable<CuarentenariasIdResponse> editCuarentenarias (@Header("Authorization")String token,
                                                             @Path("id")String idCuarentenarias,
                                                             @Body Cuarentenarias editCuarentenarias);

    @DELETE("plagas-cuarentenarias/{id}")
    Observable<CuarentenariasIdResponse> deleteCuarentenarias (@Header("Authorization")String token,
                                                               @Path("id")String idCuarentenarias);
}
