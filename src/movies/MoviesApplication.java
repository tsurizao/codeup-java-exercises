package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        // FINAL variables to frame output, easier to read output
        final String UPPER_FRAME = "=======================\nHere are your movies\n=======================";
        final String LOWER_FRAME = "=======================";
        Movie[] moviesArr = MoviesArray.findAll();

        //Loop breaks only when choosing option "0" to exit
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("0 - Exit");
            System.out.println("1 - View all movies");
            System.out.println("2 - View movies in the animated category");
            System.out.println("3 - View movies in the drama category");
            System.out.println("4 - View movies in the horror category");
            System.out.println("5 - View movies in the sci-fi category");
            System.out.println("6 - Add a movie to the list");
            int input = new Input().getInt();
            if (input == 0) {
                System.out.println("Have a great day!");
                break;
            } else if (input == 1) {
                System.out.println(UPPER_FRAME);
                for (Movie movie : moviesArr) {
                    System.out.println(movie.getName());
                }
                System.out.println(LOWER_FRAME);
            } else if (input == 2) {
                System.out.println(UPPER_FRAME);
                for (Movie movie : moviesArr) {
                    if (movie.category.equals("animated")) {
                        System.out.println(movie.name);
                    }
                }
                System.out.println(LOWER_FRAME);
            } else if (input == 3) {
                System.out.println(UPPER_FRAME);
                for (Movie movie : moviesArr) {
                    if (movie.category.equals("drama")) {
                        System.out.println(movie.name);
                    }
                }
                System.out.println(LOWER_FRAME);
            } else if (input == 4) {
                System.out.println(UPPER_FRAME);
                for (Movie movie : moviesArr) {
                    if (movie.category.equals("horror")) {
                        System.out.println(movie.name);
                    }
                }
                System.out.println(LOWER_FRAME);
            } else if (input == 5) {
                System.out.println(UPPER_FRAME);
                for (Movie movie : moviesArr) {
                    if (movie.category.equals("scifi")) {
                        System.out.println(movie.name);
                    }
                }
                // The following else-if prompts user for a movie title and category then calls the addMovie
                // method to create a new array with the new movie in it.
            } else if (input == 6) {
                System.out.println("Please enter the movie title: ");
                String newMovieTitle = new Input().getString();
                System.out.println("Please enter the movie category / genre: ");
                String newMovieCategory = new Input().getString();
                moviesArr = addMovie(moviesArr, newMovieTitle, newMovieCategory);
            } else {
                System.out.println("Please choose an option.");
            }
        }
    }
    // This function takes the original movie array and creates a new array plus an additional movie
    public static Movie[] addMovie(Movie[] arr, String name, String category) {
        Movie[] newMovies = Arrays.copyOf(arr, arr.length);
        newMovies[newMovies.length - 1].name = name;
        newMovies[newMovies.length - 1].category = category;
        return newMovies;
    }
}
