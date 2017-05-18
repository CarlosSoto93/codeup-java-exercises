package JavaII;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {

        Input input = new Input();
        Movie[] list = MoviesArray.findAll();
        Movie movie;
        do {

            System.out.println("\nWhat would you like to do? \n 0 - exit\n 1 - view all movies \n 2 - view movies in the animated category\n 3 - view movies in the drama category\n 4 - view movies in the horror category\n 5 - view movies in the scifi category\n");

            switch (input.getInt("Enter your choice:", 0, 5)) {
                case 0:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;
                case 1:
                    for (Movie m : list) {
                        System.out.println(m.getMovieInfo());
                    }
                    break;
                case 2:
                    for (Movie m : list) {
                        if (m.getCategory().equalsIgnoreCase("animated")) {
                            System.out.println(m.getMovieInfo());
                        }
                    }
                    break;
                case 3:
                    for (Movie m : list) {
                        if (m.getCategory().equalsIgnoreCase("drama")) {
                            System.out.println(m.getMovieInfo());
                        }
                    }
                    break;
                case 4:
                    for (Movie m : list) {
                        if (m.getCategory().equalsIgnoreCase("horror")) {
                            System.out.println(m.getMovieInfo());
                        }
                    }
                    break;
                case 5:
                    for (Movie m : list) {
                        if (m.getCategory().equalsIgnoreCase("scifi")) {
                            System.out.println(m.getMovieInfo());
                        }
                    }
                    break;
            }
        } while (true);
    }
}
