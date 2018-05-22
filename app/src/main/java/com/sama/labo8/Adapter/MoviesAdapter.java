package com.sama.labo8.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.sama.labo8.Activites.Movie;

import java.util.List;

/**
 * Created by uca on 05-22-18.
 */

public class MoviesAdapter extends RecyclerView.Adapter {
    RecyclerView rv;
    MoviesAdapter adapter;
    List<Movie> movies;

    public MoviesAdapter(RecyclerView rv, MoviesAdapter adapter, List<Movie> movies) {
        this.rv = rv;
        this.adapter = adapter;
        this.movies = movies;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
