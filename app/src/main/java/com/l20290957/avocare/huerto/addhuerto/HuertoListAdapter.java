package com.l20290957.avocare.huerto.addhuerto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.l20290957.avocare.R;
import com.l20290957.avocare.services.avocadoApi.models.Huertos.Huertos;

import java.util.List;

public class HuertoListAdapter extends ArrayAdapter<Huertos> {
    public HuertoListAdapter(@NonNull Context context, List<Huertos> huertos) {
        super(context, R.layout.huertoitem, huertos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        Huertos huertos = getItem(position);


        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.huertoitem
                    , parent, false);
        }


        TextView
                tvHuertoName = view.findViewById(R.id.mishuertosTvNomHuerto),
                tvHuertoUbi = view.findViewById(R.id.mishuertosTvUbicacion),
                tvHuertoTemperatura = view.findViewById(R.id.mishuertosTvTemperatura),
                tvHuertoHumedad = view.findViewById(R.id.mishuertosTvHumedad),
                tvHuertoAlertasActuales = view.findViewById(R.id.mishuertosTvNumAlertas),
                tvHuertoPronostico = view.findViewById(R.id.mishuertosTvNumPronosticos);

        return view;

    }
}
