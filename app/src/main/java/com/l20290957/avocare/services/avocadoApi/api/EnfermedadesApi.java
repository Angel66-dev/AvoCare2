package com.l20290957.avocare.services.avocadoApi.api;

import com.l20290957.avocare.services.avocadoApi.models.Enfermedades.Enfermedades;
import com.l20290957.avocare.services.avocadoApi.models.Enfermedades.responses.CreateEnfermedad;
import com.l20290957.avocare.services.avocadoApi.models.Enfermedades.responses.EnfermedadesIdResponse;
import com.l20290957.avocare.services.avocadoApi.models.Enfermedades.responses.EnfermedadesListResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface EnfermedadesApi {
    @GET("enfermedades")
    Observable<EnfermedadesListResponse> getEnfermedadesList (@Header("Authorization")String token);

    @GET("enfermedades/{id}")
    Observable<EnfermedadesIdResponse> getEnfermedadesInfo (@Header("Authorization")String token,
                                                            @Path("id")String idEnfermedad);

    @POST("enfermedades")
    Observable<Enfermedades> createEnfermedad (@Header("Authorization")String token,
                                               @Body CreateEnfermedad createEnfermedad);

    @PATCH("enfermedades/{id}")
    Observable<EnfermedadesIdResponse> editEnfermedad (@Header("Authorization")String token,
                                                       @Path("id")String idEnfermedad,
                                                       @Body Enfermedades editEnfermedad);

    @DELETE("enfermedades/{id}")
    Observable<EnfermedadesIdResponse> deleteEnfermedad (@Header("Authorization")String token,
                                                         @Path("id")String idEnfermedad);
}
