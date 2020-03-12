package com.beone.rupiinterview.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.beone.rupiinterview.R;
import com.beone.rupiinterview.adapter.CustomRecylerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashboardFragment extends Fragment {

  @BindView(R.id.rcv)
  RecyclerView rcv;
  private DashboardViewModel dashboardViewModel;
  private CustomRecylerViewAdapter adapter;

  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {
    dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel.class);
    View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
    ButterKnife.bind(this, root);


  adapter =  new CustomRecylerViewAdapter(new ArrayList<String>());

    dashboardViewModel.getDatat().observe(getViewLifecycleOwner(), new Observer<List<String>>() {
      @Override
      public void onChanged(List<String> strings) {
        adapter.updatedata(strings);
        rcv.setAdapter(adapter);
      }
    });


    return root;
  }
}
