package com.l20290957.avocare.services.avocadoApi.api;

import com.l20290957.avocare.services.avocadoApi.models.AlertaPlaga.AlertaPlaga;
import com.l20290957.avocare.services.avocadoApi.models.AlertaPlaga.responses.AlertaPlagaIdPlagaResponse;
import com.l20290957.avocare.services.avocadoApi.models.AlertaPlaga.responses.AlertaPlagaIdResponse;
import com.l20290957.avocare.services.avocadoApi.models.AlertaPlaga.responses.AlertaPlagaListResponse;
import com.l20290957.avocare.services.avocadoApi.models.AlertaPlaga.responses.CreateAlertaPlaga;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AlertaPlagaApi {
    @GET("alertas-plagas")
    Observable<AlertaPlagaListResponse> getAlertaPlagaList (@Header("Authorization")String token);

    @GET("alertas-plagas/{id}")
    Observable<AlertaPlagaIdResponse> getAlertaPlagaInfo (@Header("Authorization")String token,
                                                          @Path("id")String idAlertaPlaga);

    @GET("alertas-plagas/byplagaid/{id}")
    Observable<AlertaPlagaIdPlagaResponse> getAlertaPlagaPlagaInfo (@Header("Authorization")String token,
                                                                    @Path("id")String idPlagas);

    @POST("alertas-plagas")
    Observable<AlertaPlaga> createAlertaPlaga (@Header("Authorization")String token,
                                               @Body CreateAlertaPlaga createAlertaPlaga);

    @PATCH("alertas-plagas/{id}")
    Observable<AlertaPlagaIdResponse> editAlertaPlaga (@Header("Authorization")String token,
                                                     @Path("id")String idAlertaPlaga,
                                                     @Body AlertaPlaga editAlertaPlaga);

    @DELETE("alertas-plagas/{id}")
    Observable<AlertaPlagaIdResponse> deleteAlertaPlaga (@Header("Authorization")String token,
                                                       @Path("id")String idAlertaPlaga);
}
