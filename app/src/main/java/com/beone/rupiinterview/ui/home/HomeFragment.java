package com.beone.rupiinterview.ui.home;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.beone.rupiinterview.Preferences;
import com.beone.rupiinterview.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class HomeFragment extends Fragment {

  @BindView(R.id.namauser)
  TextView namauser;
  @BindView(R.id.email)
  TextView email;
  private HomeViewModel homeViewModel;
  private Unbinder unbinder;
  private Preferences preferences;

  @RequiresApi(api = Build.VERSION_CODES.Q)
  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {
    homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel.class);
    View root = inflater.inflate(R.layout.fragment_home, container, false);
//    final TextView textView = root.findViewById(R.id.text_home);
//    homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//      @Override
//      public void onChanged(@Nullable String s) {
//        textView.setText(s);
//      }
//    });
    preferences = new Preferences(getContext());


    unbinder = ButterKnife.bind(this, root);

    namauser.setText( preferences.getKeyNama());
    email.setText(preferences.getKeyJabatanid());
    return root;
  }


  @Override
  public void onDestroyView() {
    super.onDestroyView();
    unbinder.unbind();
  }
}
