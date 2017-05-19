package JavaII;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {

        Input input = new Input();
        Movie[] list = MoviesArray.findAll();
        Movie movie;
        do {

            System.out.println("\nWhat would you like to do? \n\n 0 - exit\n 1 - view all movies \n 2 - view movies in the animated category\n 3 - view movies in the drama category\n 4 - view movies in the horror category\n 5 - view movies in the scifi category\n 6 - view movies in the musical category\n 7 - view movies in the comedy category\n 8 - Add a Movie\n");

            int option = input.getInt("Choose your option:", 0, 8);
            input.removeEnter();


            switch (option) {
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
                    printByCategory(list, "animated");
                    break;
                case 3:
                    printByCategory(list, "drama");
                    break;
                case 4:
                    printByCategory(list, "horror");
                    break;
                case 5:
                    printByCategory(list, "scifi");
                    break;
                case 6:
                    printByCategory(list, "musical");
                    break;
                case 7:
                    printByCategory(list, "comedy");
                    break;
                case 8:
                    list = addMovie(input, list);
                    break;
            }
        } while (true);
    }

    public static void printByCategory(Movie[] movies, String category){
        for (Movie m : movies) {
            if (m.getCategory().equalsIgnoreCase(category)) {
                System.out.println(m.getMovieInfo());
            }
        }
    }

    public static Movie[] addMovie(Input input, Movie[] list) {
        String movieTitle = input.getString("Title of the movie:");
        String category = input.getString("Category of the movie:");

        Movie newMovie = new Movie(movieTitle, category);

        list = Arrays.copyOf(list, list.length + 1);

        list[list.length - 1] = newMovie;

        return list;
    }
}
