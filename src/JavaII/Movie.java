package JavaII;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getMovieInfo(){
        return name + ", " + category;
    }

    public String getCategory(){
        return category;
    }
}
