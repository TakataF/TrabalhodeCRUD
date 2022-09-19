package com.takata.trabalhodecrud.adapters;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.takata.trabalhodecrud.entities.Supplier;

import java.util.ArrayList;

public class SupplierAdapter extends RecyclerView.Adapter<SupplierAdapter.ViewHolder> {
    ArrayList<Supplier> list;

    public SupplierAdapter(ArrayList<Supplier> lista) {
        this.list = lista;
    }

    @NonNull
    @Override
    public SupplierAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SupplierAdapter.ViewHolder viewHolder, @SuppressLint("RecyclerView") int position) {
        viewHolder.id.setText(list.get(position).ID);
        viewHolder.nome(list.get(position).nome);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetalhesIntegrantes.class);
                intent.putExtra("image", Integer.toString(list.get(position).image));
                intent.putExtra("name", list.get(position).name);
                intent.putExtra("RA", list.get(position).RA);
                intent.putExtra("github", list.get(position).github);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView image;
        TextView RA;
        TextView github;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.name);
            this.image = itemView.findViewById(R.id.image);
            this.RA = itemView.findViewById(R.id.RA);
        }
    }
}
