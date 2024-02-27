package com.l20290957.avocare.services.avocadoApi.api;

import com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.AlertaEnf;
import com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.responses.AlertaEnfIdEnfermedadResponse;
import com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.responses.AlertaEnfIdHuertoResponse;
import com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.responses.AlertaEnfIdResponse;
import com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.responses.AlertaEnfListResponse;
import com.l20290957.avocare.services.avocadoApi.models.AlertaEnfermedad.responses.CreateAlertaEnf;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AlertaEnfApi {
    @GET("alertas-enfermedades")
    Observable<AlertaEnfListResponse> getAlertaEnfList (@Header("Authorization")String token);

    @GET("alertas-enfermedades/{id}")
    Observable<AlertaEnfIdResponse> getAlertaEnfInfo (@Header("Authorization")String token,
                                                      @Path("id")String idAlertaEnf);
    @GET("alertas-enfermedades/byhuertoid/{id}")
    Observable<AlertaEnfIdHuertoResponse> getAlertaEnfHuertoInfo (@Header("Authorization")String token,
                                                                  @Path("id")String idHuerto);

    @GET("alertas-enfermedades/byenfermedadid/{id}")
    Observable<AlertaEnfIdEnfermedadResponse> getAlertaEnfEnfermedadList(@Header("Authorization") String token,
                                                                         @Path("id") String idEnfermedades);

    @POST("alertas-enfermedades")
    Observable<AlertaEnf> createAlertaEnf (@Header("Authorization")String token,
                                           @Body CreateAlertaEnf createAlertaEnf);

    @PATCH("alertas-enfermedades/{id}")
    Observable<AlertaEnfIdResponse> editAlertaEnf (@Header("Authorization")String token,
                                                             @Path("id")String idAlertaEnf,
                                                             @Body AlertaEnf editAlertaEnf);

    @DELETE("alertas-enfermedades/{id}")
    Observable<AlertaEnfIdResponse> deleteAlertaEnf (@Header("Authorization")String token,
                                                               @Path("id")String idAlertaEnf);
}
