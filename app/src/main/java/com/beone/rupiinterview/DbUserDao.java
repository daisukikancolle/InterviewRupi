package com.beone.rupiinterview;

import androidx.room.Dao;
import androidx.room.Query;
@Dao
public interface DbUserDao {

    @Query("SELECT * FROM UserModel")
    public UserModel[] loadAllUsers();

}
