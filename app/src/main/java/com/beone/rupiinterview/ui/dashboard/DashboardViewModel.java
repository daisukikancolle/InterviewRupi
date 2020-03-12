package com.beone.rupiinterview.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class DashboardViewModel extends ViewModel {

  private MutableLiveData<List<String>> mText;

  public DashboardViewModel() {
    mText = new MutableLiveData<>();
    mText.postValue(new DataDummy().datadum());
  }

  public LiveData<List<String>> getDatat() {
    return mText;
  }
}