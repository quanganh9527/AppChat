package com.ntu.quanganh.appchat;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListComent extends RecyclerView.Adapter<ListComent.ViewHolder> {
    Context context;
    ArrayList<ItemComent> arrayList;

    public ListComent(Context context, ArrayList<ItemComent> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_listcoment,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.t1.setText(arrayList.get(position).getTennguoibenh());
        holder.t2.setText(arrayList.get(position).getThongtinnguoibenh());
        holder.t3.setText(arrayList.get(position).getTenbenh());
        holder.t4.setText(arrayList.get(position).getMotabenh());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView t1,t2,t3,t4;
        ImageView imageView;
        public ViewHolder(final View itemView) {
            super(itemView);
            t1= (TextView)itemView.findViewById(R.id.tennguoibenh);
            t2 = (TextView)itemView.findViewById(R.id.thongtinnguoibenh);
            t3 = (TextView)itemView.findViewById(R.id.tenbenh);
            t4 = (TextView)itemView.findViewById(R.id.motabenh);
            imageView = (ImageView) itemView.findViewById(R.id.imageeee);
            t1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(),detialperson.class);
                    intent.getAction();
                    itemView.getContext().startActivity(intent);
                }
            });
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(),detialperson.class);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
