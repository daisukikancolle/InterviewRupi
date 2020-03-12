package com.beone.rupiinterview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class Preferences {

    protected final String KEY_USERID = "userid";
    protected final String KEY_JABATANID = "jabatanid";
    protected final String KEY_NAMA = "nama";
    protected final String KEY_STATUSLOGIN ="statuslogin";

    private Context context;
    private SharedPreferences sharedPreferences;

    @RequiresApi(api = Build.VERSION_CODES.Q)
    public Preferences(Context context) {
      this.context = context;
      sharedPreferences = context.getSharedPreferences(context.getOpPackageName(),Context.MODE_PRIVATE);
    }

    public void setKEY_STATUSLOGIN(Boolean statuslogin){
      sharedPreferences.edit().putBoolean(KEY_STATUSLOGIN,statuslogin).apply();
    }

    public Boolean getKEY_STATUSLOGIN(){
      return sharedPreferences.getBoolean(KEY_STATUSLOGIN,false);
    }


    public void setKeyUserid(String userid){
      sharedPreferences.edit().putString(KEY_USERID,userid).apply();
    }

    public String getKeyUserid(){
      return sharedPreferences.getString(KEY_USERID,"");
    }

    public void cleargetuserid(){
      sharedPreferences.edit().remove(KEY_USERID).apply();
    }

    public void setjabatanid(String jabatanid){
      sharedPreferences.edit().putString(KEY_JABATANID,jabatanid).apply();
    }

    public String getKeyJabatanid(){
      return sharedPreferences.getString(KEY_JABATANID,"");
    }

    public void clearjabatanid(){
      sharedPreferences.edit().remove(KEY_JABATANID).apply();
    }

    public void setKeyNama(String nama){
      sharedPreferences.edit().putString(KEY_NAMA,nama).apply();
    }

    public String getKeyNama(){
      return sharedPreferences.getString(KEY_NAMA,"");
    }

    public void clearkeynama(){
      sharedPreferences.edit().remove(KEY_NAMA).apply();
    }

    @SuppressLint("CommitPrefEdits")
    public void clearallpreference(){
      sharedPreferences.edit().clear();

    }


}
