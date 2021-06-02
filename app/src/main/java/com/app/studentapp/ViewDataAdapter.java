package com.app.studentapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewDataAdapter extends RecyclerView.Adapter<ViewDataAdapter.ViewHolder> {
    public ViewDataAdapter(Context context) {
    }

    @NonNull

    @Override
    public ViewDataAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.view_data_recycler_adapter_layout, parent, false);
        ViewDataAdapter.ViewHolder viewHolder = new ViewDataAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull  ViewDataAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        public ViewHolder( View itemView) {
            super(itemView);


        }
    }
}
