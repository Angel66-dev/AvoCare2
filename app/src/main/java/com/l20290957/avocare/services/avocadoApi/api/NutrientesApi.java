package com.l20290957.avocare.services.avocadoApi.api;

import com.l20290957.avocare.services.avocadoApi.models.Nutrientes.Nutrientes;
import com.l20290957.avocare.services.avocadoApi.models.Nutrientes.responses.CreateNutrientes;
import com.l20290957.avocare.services.avocadoApi.models.Nutrientes.responses.NutrientesIdResponse;
import com.l20290957.avocare.services.avocadoApi.models.Nutrientes.responses.NutrientesListResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface NutrientesApi {
    @GET("nutrientes")
    Observable<NutrientesListResponse> getNutrientesList (@Header("Authorization")String token);

    @GET("nutrientes/{id}")
    Observable<NutrientesIdResponse> getNutrientesInfo (@Header("Authorization")String token,
                                                        @Path("id")String idNutrientes);

    @POST("nutrientes")
    Observable<Nutrientes> createNutrientes (@Header("Authorization")String token,
                                             @Body CreateNutrientes createNutrientes);

    @PATCH("nutrientes/{id}")
    Observable<NutrientesIdResponse> editNutrientes (@Header("Authorization")String token,
                                                     @Path("id")String idNutrientes,
                                                     @Body Nutrientes editNutrientes);

    @DELETE("nutrientes/{id}")
    Observable<NutrientesIdResponse> deleteNutrientes (@Header("Authorization")String token,
                                                       @Path("id")String idNutrientes);
}
