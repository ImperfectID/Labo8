package com.sama.labo8.Interfaces;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.sama.labo8.Activites.Movie;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by uca on 05-22-18.
 */
@Dao
public interface MoviesDAO {
@Query("SELECT * FROM MOVIE")
    List<Movie> getAll();

@Insert (onConflict =   REPLACE)
    void insertMovie(Movie movie);


}
