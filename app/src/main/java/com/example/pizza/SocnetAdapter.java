package com.example.pizza;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SocnetAdapter extends RecyclerView.Adapter<SocnetAdapter.ViewHolder> {
    private String[] dataSource;

    public SocnetAdapter(String[] dataSource) {
        this.dataSource = dataSource;
    }

    @NonNull
    @Override
    public SocnetAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_theme, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SocnetAdapter.ViewHolder viewHolder, int i) {
        viewHolder.getView().setText(dataSource[i]);
    }

    @Override
    public int getItemCount() {
        return dataSource.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tView = (TextView) itemView;
        }

        public TextView getView() {
            return tView;
        }
    }
}
