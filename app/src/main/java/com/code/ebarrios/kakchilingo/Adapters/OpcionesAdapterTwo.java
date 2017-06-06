package com.code.ebarrios.kakchilingo.Adapters;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.code.ebarrios.kakchilingo.LessonThreeActivity;
import com.code.ebarrios.kakchilingo.Models.Opciones;
import com.code.ebarrios.kakchilingo.R;

import java.util.ArrayList;

/**
 * Created by Ebarrios on 06/06/2017.
 */

public class OpcionesAdapterTwo extends RecyclerView.Adapter<OpcionesAdapterTwo.OpcionesTwoViewHolder> {
    private ArrayList<Opciones> item;
    Activity activity;
    private String R2 = "Ak’wal";

    public OpcionesAdapterTwo(ArrayList<Opciones> item, Activity activity) {
        this.item = item;
        this.activity = activity;
    }

    @Override
    public OpcionesTwoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_picture,parent,false);
        OpcionesAdapterTwo.OpcionesTwoViewHolder opcionesTwo = new OpcionesAdapterTwo.OpcionesTwoViewHolder(v);
        return opcionesTwo;
    }

    @Override
    public void onBindViewHolder(OpcionesTwoViewHolder holder, final int position) {
        holder.stringOpcion.setText(item.get(position).getOpcion());
        holder.imgCard.setImageResource(item.get(position).getImagen());

        holder.imgCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(item.get(position).getOpcion().equals(R2))
                {
                    AlertDialog.Builder ventana = new AlertDialog.Builder(v.getContext());
                    ventana.setMessage("Tú respuesta es correcta, "+R2+" significa Niño en kaqchiquel");
                    ventana.setTitle("LECCIÓN 2")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    //Toast.makeText(view.getContext(),"Felicidades",Toast.LENGTH_SHORT).show();
                                    activity.startActivity(new Intent(activity,LessonThreeActivity.class));
                                }
                            });
                    ventana.show();
                }
                else
                {
                    Toast.makeText(v.getContext(),"Incorrecto sigue intentando y aprende",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class OpcionesTwoViewHolder extends RecyclerView.ViewHolder {
        TextView stringOpcion;
        ImageView imgCard;

        public OpcionesTwoViewHolder(View itemView) {
            super(itemView);

            stringOpcion = (TextView)itemView.findViewById(R.id.txtOpcion);
            imgCard = (ImageView)itemView.findViewById(R.id.imgCard);
        }
    }
}
