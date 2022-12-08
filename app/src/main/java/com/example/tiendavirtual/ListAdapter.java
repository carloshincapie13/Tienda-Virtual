package com.example.tiendavirtual;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private List<ListaElementos> mData;
    private LayoutInflater mInflater;
    private Context context;

    public  ListAdapter(List<ListaElementos> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount() { return mData.size(); }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
        holder.binData(mData.get(position));
        holder.position=holder.getBindingAdapterPosition(); //aqui************************
    }

    public void setItems(List<ListaElementos> items) { mData = items; }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, gender, status;
        private int position;

        ViewHolder(View itemView){
            super(itemView);


            name = itemView.findViewById(R.id.nameTextView);
            gender = itemView.findViewById(R.id.descriptionTextview);
            status = itemView.findViewById(R.id.StatusTextView);
            iconImage = itemView.findViewById(R.id.iconImageView);

//7 aqui ***************************************
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), ActivityTienda.class);

                    intent.putExtra("nombre",mData.get(position).getName());
                    intent.putExtra("genero",mData.get(position).getGender());

                    intent.putExtra("estado",mData.get(position).getStatus());
                    intent.putExtra("idImagen",mData.get(position).geticonImage());

                    view.getContext().startActivity(intent);
                }
            });

        }

        void binData(final ListaElementos item){

            name.setText(item.getName());
            gender.setText(item.getGender());
            status.setText(item.getStatus());
            iconImage.setImageResource(item.geticonImage());

            //aqui

        }

    }

}
