package com.codecta.academy2021.netflix;

import com.codecta.academy2021.netflix.animations.MovieAnimation;
import com.codecta.academy2021.netflix.animations.RomanceMovieAnimation;
import com.codecta.academy2021.netflix.movies.Movie;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RomanceMovieAnimation movieTitanic = new RomanceMovieAnimation("Titanic", "Leonardo di Caprio","dicaprio.jpg");
        System.out.println(movieTitanic.picture());
        List<Movie> movies = new ArrayList<>();
        System.out.println("Hello world");
    }
}
