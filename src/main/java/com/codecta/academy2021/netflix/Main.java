package com.codecta.academy2021.netflix;

import com.codecta.academy2021.netflix.animations.ComedyMovieAnimation;
import com.codecta.academy2021.netflix.animations.DramaMovieAnimation;
import com.codecta.academy2021.netflix.animations.MovieAnimation;
import com.codecta.academy2021.netflix.animations.RomanceMovieAnimation;
import com.codecta.academy2021.netflix.movies.Comedy;
import com.codecta.academy2021.netflix.movies.Drama;
import com.codecta.academy2021.netflix.movies.Movie;
import com.codecta.academy2021.netflix.movies.Romance;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome guest. This is Netflix movie network. Feel free to check our movie library. Please enter your name: ");
        String visitorName = scanner.next();
        RomanceMovieAnimation Titanic = new RomanceMovieAnimation("Titanic", "Leonardo di Caprio","titanic.jpg");
        ComedyMovieAnimation Shrek = new ComedyMovieAnimation("Shrek", "Eddie Murphy","shrek.jpg");
        ComedyMovieAnimation MrBean = new ComedyMovieAnimation("Mr.Bean", "Rowan Attkinson","mrbean.png");
        DramaMovieAnimation TaxiDriver = new DramaMovieAnimation("Taxi driver", "Robert de Niro", "taxidriver.png");

        List<Movie> movies = new ArrayList<>();
        List<MovieAnimation> animations = new ArrayList<>();
        List<MovieAnimation> comedyAnimations = new ArrayList<>();
        List<MovieAnimation> dramaAnimations = new ArrayList<>();
        List<MovieAnimation> romanceAnimations = new ArrayList<>();
        Map<Movie, List<MovieAnimation>> mapMovies = new HashMap<>();
        animations.add(Titanic);
        animations.add(Shrek);
        animations.add(MrBean);
        animations.add(TaxiDriver);
        movies.add(new Comedy());
        movies.add(new Drama());
        movies.add(new Romance());
        for (MovieAnimation animation : animations){
                if (animation instanceof ComedyMovieAnimation){
                    comedyAnimations.add( animation);
                }
                else if(animation instanceof DramaMovieAnimation){
                    dramaAnimations.add(animation);
                }
                else if(animation instanceof RomanceMovieAnimation){
                    romanceAnimations.add(animation);
                }
        }
        mapMovies.put(movies.get(0), comedyAnimations);
        mapMovies.put(movies.get(1), dramaAnimations);
        mapMovies.put(movies.get(2), romanceAnimations);
        boolean loopState = true;
        do {
            System.out.println("Dear " + visitorName + ", enter the desired instruction: \n"
            + "1 - if you want to see comedy movies \n" +
            "2 - if you want to see drama movies \n" +
            "3 - if you want to see romance movies \n" +
            "0 - if you want to leave the library");
            int option = scanner.nextInt();
            if(option != 0 ) {
                System.out.println("You chose " + movies.get(option - 1).getName()
                        + " and the genre description is: \n" + movies.get(option - 1).getDescription());
                System.out.println("Our " + movies.get(option - 1).getName() + " library has following titles: ");
                for (MovieAnimation animation : animations) {
                    if (option == 1 && animation instanceof ComedyMovieAnimation)
                        System.out.println("Title : " + animation.getMovieName() + "\n" + animation.picture());
                    else if (option == 2 && animation instanceof DramaMovieAnimation)
                        System.out.println("Title : " + animation.getMovieName() + "\n" + animation.picture());
                    else if (option == 3 && animation instanceof RomanceMovieAnimation)
                        System.out.println("Title : " + animation.getMovieName() + "\n" + animation.picture());
                }
            }
            else loopState  = false;
        } while(loopState);
    }
}
