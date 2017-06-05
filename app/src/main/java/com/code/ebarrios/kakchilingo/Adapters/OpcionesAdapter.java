package com.code.ebarrios.kakchilingo.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.code.ebarrios.kakchilingo.Models.Opciones;
import com.code.ebarrios.kakchilingo.R;

import java.util.ArrayList;

/**
 * Created by Ebarrios on 05/06/2017.
 */

public class OpcionesAdapter extends RecyclerView.Adapter<OpcionesAdapter.OpcionesViewHolder> implements View.OnClickListener{
    private ArrayList<Opciones> item;

    public OpcionesAdapter(ArrayList<Opciones> item) {
        this.item = item;
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
/*
        holder.imgCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                //Toast.makeText(v.getContext(),"click img cardview "+item.get(position),Toast.LENGTH_SHORT).show();
                AlertDialog.Builder ventana = new AlertDialog.Builder(view.getContext());
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

                ventana.show();
            }
        });
        holder.stringOpcion.setOnClickListener(this); */
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    @Override
    public void onClick(View v) {
        /*if(v.getId() == R.id.imgCard || v.getId() == R.id.txtOpcion)
        {
            Toast.makeText(v.getContext(),"click img cardview",Toast.LENGTH_SHORT).show();
        }*/
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
