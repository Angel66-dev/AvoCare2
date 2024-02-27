package com.l20290957.avocare.services.avocadoApi.api;

import com.l20290957.avocare.services.avocadoApi.models.Plagas.Plagas;
import com.l20290957.avocare.services.avocadoApi.models.Plagas.responses.CreatePlagas;
import com.l20290957.avocare.services.avocadoApi.models.Plagas.responses.PlagasIdResponse;
import com.l20290957.avocare.services.avocadoApi.models.Plagas.responses.PlagasListResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PlagasApi {
    @GET("plagas")
    Observable<PlagasListResponse> getPlagasList (@Header("Authorization")String token);

    @GET("plagas/{id}")
    Observable<PlagasIdResponse> getPlagasInfo (@Header("Authorization")String token,
                                                @Path("id")String idPlagas);

    @POST("plagas")
    Observable<Plagas> createPlagas (@Header("Authorization")String token,
                                     @Body CreatePlagas createPlagas);

    @PATCH("plagas/{id}")
    Observable<PlagasIdResponse> editPlagas (@Header("Authorization")String token,
                                             @Path("id")String idPlagas,
                                             @Body Plagas editPlagas);

    @DELETE("plagas/{id}")
    Observable<PlagasIdResponse> deletePlagas (@Header("Authorization")String token,
                                               @Path("id")String idPlagas);
}
