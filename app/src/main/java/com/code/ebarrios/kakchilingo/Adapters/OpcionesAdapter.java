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

import com.code.ebarrios.kakchilingo.LessonTwoActivity;
import com.code.ebarrios.kakchilingo.Models.Opciones;
import com.code.ebarrios.kakchilingo.R;

import java.util.ArrayList;

/**
 * Created by Ebarrios on 05/06/2017.
 */

public class OpcionesAdapter extends RecyclerView.Adapter<OpcionesAdapter.OpcionesViewHolder>{
    private ArrayList<Opciones> item;
    Activity activity;

    private String R1 = "Ixöq";

    public OpcionesAdapter(ArrayList<Opciones> item, Activity activity) {
        this.item = item;
        this.activity = activity;
    }

    @Override
    public OpcionesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_picture,parent,false);
        OpcionesViewHolder opciones = new OpcionesViewHolder(v);
        return opciones;
    }

    @Override
    public void onBindViewHolder(OpcionesViewHolder holder, final int position) {
        holder.stringOpcion.setText(item.get(position).getOpcion());
        holder.imgCard.setImageResource(item.get(position).getImagen());

        holder.imgCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                //Toast.makeText(view.getContext(),"click en "+item.get(position).getOpcion(),Toast.LENGTH_SHORT).show();
                if(item.get(position).getOpcion().equals(R1))
                {
                    //Toast.makeText(view.getContext(),"Correcto", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder ventana = new AlertDialog.Builder(view.getContext());
                    ventana.setMessage("Tú respuesta es correcta,  "+R1+" significa Mujer en kaqchiquel");
                    ventana.setTitle("LECCIÓN 1")
                            .setPositiveButton("AVANZAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    //Toast.makeText(view.getContext(),"Felicidades",Toast.LENGTH_SHORT).show();
                                    activity.startActivity(new Intent(activity, LessonTwoActivity.class));
                                }
                            });
                    ventana.show();
                }
                else
                {
                    Toast.makeText(view.getContext(),"Incorrecto sigue intentando y aprende",Toast.LENGTH_SHORT).show();
                }
                /*AlertDialog.Builder ventana = new AlertDialog.Builder(view.getContext());
                ventana.setMessage("Este es tu primer Alert dialog");
                ventana.setTitle("App de kakchiquel")
                        .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(view.getContext(),"Felicidades",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(view.getContext(),"Me pela pendejo",Toast.LENGTH_SHORT).show();
                            }
                        });

                ventana.show(); */
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class OpcionesViewHolder extends RecyclerView.ViewHolder{
        TextView stringOpcion;
        ImageView imgCard;

        public OpcionesViewHolder(View itemView) {
            super(itemView);

            stringOpcion = (TextView)itemView.findViewById(R.id.txtOpcion);
            imgCard = (ImageView)itemView.findViewById(R.id.imgCard);
        }
    }
}
