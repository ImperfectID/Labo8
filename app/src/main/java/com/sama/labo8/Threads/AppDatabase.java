package com.sama.labo8.Threads;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.sama.labo8.Activites.Movie;
import com.sama.labo8.Interfaces.MoviesDAO;

/**
 * Created by uca on 05-22-18.
 */



@Database(entities = {Movie.class},version = 1)
public abstract class AppDatabase extends RoomDatabase{

    private static AppDatabase INSTANCE;
    public abstract MoviesDAO moviesDAO();

    public static AppDatabase getAppDatabase(Context context){
        if(INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"movies-database")
                    .allowMainThreadQueries()
                    .build();



        }

        return INSTANCE;
    }

}
