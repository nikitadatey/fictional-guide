package com.example.virus.test;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RViewAdapter extends RecyclerView.Adapter<RViewAdapter.DataObjectHolder> {

    private Context context;
    private ArrayList<Coche> listaCoches;

    public RViewAdapter(Context context, ArrayList<Coche> listaCoches) {
        this.context = context;
        this.listaCoches = listaCoches;
    }

    @NonNull
    @Override
    public DataObjectHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(


                R.layout.card_view,viewGroup,false);
        return new DataObjectHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DataObjectHolder holder, int position) {

        holder.txtNumber.setText(listaCoches.get(position).getNumber());

        Glide.with(context).load(listaCoches.get(position).getImg()).into(holder.img);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                if (holder.getAdapterPosition()== 0) {
                    Intent intent = new Intent(context, placeview1.class);
                    context.startActivity(intent);
                }
                else if (holder.getAdapterPosition()== 1){
                    Intent intent = new Intent(context, placeview2.class);
                    context.startActivity(intent);
                }
                else if (holder.getAdapterPosition()== 2) {
                    Intent intent = new Intent(context, placeview3.class);
                    context.startActivity(intent);
                }
                else if (holder.getAdapterPosition()== 3) {
                    Intent intent = new Intent(context, placeview4.class);
                    context.startActivity(intent);
                }
                else if (holder.getAdapterPosition()== 4) {
                    Intent intent = new Intent(context, placeview5.class);
                    context.startActivity(intent);
                }
                else if (holder.getAdapterPosition()== 5) {
                    Intent intent = new Intent(context, placeview6.class);
                    context.startActivity(intent);
                }
                else if (holder.getAdapterPosition()== 6) {
                    Intent intent = new Intent(context, placeview7.class);
                    context.startActivity(intent);
                }
                else if (holder.getAdapterPosition()== 7) {
                    Intent intent = new Intent(context, placeview8.class);
                    context.startActivity(intent);
                }
                else if (holder.getAdapterPosition()== 8) {
                    Intent intent = new Intent(context, placeview9.class);
                    context.startActivity(intent);
                }
                else if (holder.getAdapterPosition()== 9) {
                    Intent intent = new Intent(context, placeview10.class);
                    context.startActivity(intent);
                }
            }
        });

    }


    @Override
    public int getItemCount() {
        return listaCoches.size();
    }

    public class DataObjectHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView txtNumber;

        public DataObjectHolder(@NonNull View itemView) {
            super(itemView);
            this.img = itemView.findViewById(R.id.img);
            this.txtNumber = itemView.findViewById(R.id.txtNumber);
        }
    }
}
