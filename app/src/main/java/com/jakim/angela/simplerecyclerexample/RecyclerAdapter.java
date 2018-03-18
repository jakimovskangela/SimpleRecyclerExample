package com.jakim.angela.simplerecyclerexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private int itemLayout;
    private ArrayList<RecyclerItem> itemList;

    public RecyclerAdapter(int itemLayout, ArrayList<RecyclerItem> itemList) {
        this.itemLayout = itemLayout;
        this.itemList = itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(itemLayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TextView txtTitle = holder.txtTitle;
        RecyclerItem item = itemList.get(position);
        txtTitle.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return itemList == null ? 0 : itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
        }
    }
}
