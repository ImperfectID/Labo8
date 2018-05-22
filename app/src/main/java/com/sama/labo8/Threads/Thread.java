package com.sama.labo8.Threads;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;

import com.sama.labo8.Activites.Movie;
import com.sama.labo8.Adapter.MoviesAdapter;

import java.util.List;

/**
 * Created by uca on 05-22-18.
 */

public class Thread extends AsyncTask {
    private List<Movie> movies;
    private RecyclerView rv;
    private MoviesAdapter adapter;
    private AppDatabase db;


   public Thread(List<Movie> movies,RecyclerView rv,MoviesAdapter adapter,AppDatabase db){
       this.movies = movies;
       this.rv = rv;
       this.adapter = adapter;
       this.db = db;


   }
    @Override
    protected Object doInBackground(Object[] objects) {
       addMovie(movies);
       adapter=new MoviesAdapter(movies);
       rv.setAdapter(adapter);

       return null;

    }
    public void addMovie(List<Movie> movies){
       movies.add(new Movie("Valerian","Sci-fi","Madhouse"));
       movies.add(new Movie("mama mia","Drama","IDK"));


    }
}
