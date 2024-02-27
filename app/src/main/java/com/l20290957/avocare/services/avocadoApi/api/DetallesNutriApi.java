package com.l20290957.avocare.services.avocadoApi.api;

import com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.DetallesNutri;
import com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.responses.CreateDetallesNutri;
import com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.responses.DetallesNutriIdHuertoResponse;
import com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.responses.DetallesNutriIdNutrienteResponse;
import com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.responses.DetallesNutriIdResponse;
import com.l20290957.avocare.services.avocadoApi.models.DetallesNutri.responses.DetallesNutriListResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface DetallesNutriApi {
    @GET("detalles-nutrimentales")
    Observable<DetallesNutriListResponse> getDetallesNutriList (@Header("Authorization")String token);

    @GET("detalles-nutrimentales/{id}")
    Observable<DetallesNutriIdResponse> getDetallesNutriInfo (@Header("Authorization")String token,
                                                      @Path("id")String idDetallesNutri);
    @GET("detalles-nutrimentales/byhuertoid/{id}")
    Observable<DetallesNutriIdHuertoResponse> getDetallesNutriHuertoInfo (@Header("Authorization")String token,
                                                                          @Path("id")String idHuerto);

    @GET("detalles-nutrimentales/byenfermedadid/{id}")
    Observable<DetallesNutriIdNutrienteResponse> getDetallesNutriNutrienteList(@Header("Authorization") String token,
                                                                               @Path("id") String idNutriente);

    @POST("detalles-nutrimentales")
    Observable<DetallesNutri> createDetallesNutri (@Header("Authorization")String token,
                                           @Body CreateDetallesNutri createDetallesNutri);

    @PATCH("detalles-nutrimentales/{id}")
    Observable<DetallesNutriIdResponse> editDetallesNutri (@Header("Authorization")String token,
                                                   @Path("id")String idDetallesNutri,
                                                   @Body DetallesNutri editDetallesNutri);

    @DELETE("detalles-nutrimentales/{id}")
    Observable<DetallesNutriIdResponse> deleteDetallesNutri (@Header("Authorization")String token,
                                                             @Path("id")String idDetallesNutri);
}
