package com.beone.rupiinterview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.beone.rupiinterview.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomRecylerViewAdapter extends RecyclerView.Adapter<CustomRecylerViewAdapter.ViewHolder> {

  private List<String> data;

  public CustomRecylerViewAdapter(List<String> data) {
    this.data = data;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.onBindss(data.get(position));
  }

  @Override
  public int getItemCount() {
    //harus kasih if else
    return data.size();
  }

  public void updatedata(List<String> data){
    this.data.addAll(data);
    notifyDataSetChanged();
  }


  public class ViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tvBarang)
    TextView tvBarang;
    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
    }

    public void onBindss(String a) {
      tvBarang.setText(a);
    }
  }
}
