package com.beone.rupiinterview;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

  @BindView(R.id.tvName)
  EditText tvName;
  @BindView(R.id.tvEmail)
  EditText tvEmail;
  @BindView(R.id.tvPassword)
  EditText tvPassword;
  @BindView(R.id.btnRegisters)
  Button btnRegisters;
  private Unbinder unbinder;

  Preferences preferences;
  public RegisterFragment() {
    // Required empty public constructor
  }


  @RequiresApi(api = Build.VERSION_CODES.Q)
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View v = inflater.inflate(R.layout.fragment_register, container, false);
    unbinder = ButterKnife.bind(this, v);
    preferences = new Preferences(getContext());
    btnRegisters.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (!tvName.getText().toString().equals("")&&!tvEmail.getText().toString().equals("")&&!tvPassword.getText().toString().equals("")){
          preferences.setKeyNama(tvName.getText().toString());
          preferences.setjabatanid(tvEmail.getText().toString());
          preferences.setKeyUserid(tvPassword.getText().toString());
          Toast.makeText(getContext(),"Ok",Toast.LENGTH_SHORT).show();
          Intent intent = new Intent(getActivity(),ButtomNavigationActvity.class);
          startActivity(intent);
        }
      }
    });






    return v;
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    unbinder.unbind();
  }
}
