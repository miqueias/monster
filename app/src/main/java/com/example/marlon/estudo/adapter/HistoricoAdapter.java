package com.example.marlon.estudo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marlon.estudo.R;



public class HistoricoAdapter extends RecyclerView.Adapter<HistoricoAdapter.PersonViewHolder> {

    public Context context;

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView tvData;

        PersonViewHolder(View itemView) {
            super(itemView);
            itemView.setClickable(true);
            tvData = (TextView) itemView.findViewById(R.id.tvData);

        }
    }

    public HistoricoAdapter(Context context) {
        this.context = context;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_historico, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int position) {
        personViewHolder.tvData.setText("1 de abril 2016");


    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
