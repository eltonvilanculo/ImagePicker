package com.example.imagepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ModeloAdapter extends RecyclerView.Adapter<ModeloAdapter.ViewHolder> {

    private List<ObjectoModelo> listModelo;
    private LayoutInflater inflater;

    public ModeloAdapter(Context context, List<ObjectoModelo> listModelo) {
       inflater=LayoutInflater.from(context);
        this.listModelo = listModelo;

    }

    @NonNull
    @Override


    public ModeloAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.contactas_card_view, parent, false);
       ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ModeloAdapter.ViewHolder holder, int position) {
        ObjectoModelo objectoActual =listModelo.get(position);
        holder.setData(objectoActual,position);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txtNome;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view_id);
            txtNome = itemView.findViewById(R.id.txtNome);
        }

        public void setData(ObjectoModelo objectoActual, int position) {

            this.imageView.setImageResource(objectoActual.getImageSrc());
            this.txtNome.setText(objectoActual.getNome());




        }
    }
}
