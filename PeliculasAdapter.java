package com.devevp.fragments.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import com.devevp.fragments.R;
import com.devevp.fragments.PeliculasVo.PeliculasVo;


public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.PeliculasViewHolder>{

    ArrayList<PeliculasVo> listaPeliculas;
    private View.OnClickListener listener;

    public PeliculasAdapter(ArrayList<PeliculasVo> listaPeliculas) {
        this.listaPeliculas=listaPeliculas;
    }

    @Override
    public PeliculasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fila,null,false);
        return new PeliculasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PeliculasViewHolder holder, int position) {
        holder.txtNombre.setText(listaPeliculas.get(position).getNombre());
        holder.txtInformacion.setText(listaPeliculas.get(position).getInfo());
        holder.foto.setImageResource(listaPeliculas.get(position).getImagenId());
    }

    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    public class PeliculasViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre,txtInformacion;
        ImageView foto;

        public PeliculasViewHolder(View itemView) {
            super(itemView);
            txtNombre= (TextView) itemView.findViewById(R.id.idNombre);
            txtInformacion= (TextView) itemView.findViewById(R.id.idInfo);
            foto= (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}