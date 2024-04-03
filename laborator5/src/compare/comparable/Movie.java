package compare.comparable;

public class Movie implements Comparable<Movie> {

    private String name;
    private String type;
    private int year;
    private double rating;
    @Override
    public int compareTo(Movie movie) {
        /*
        * positive integer. if current object is greater than specified object
        * negative integer. if current object is less the specified object
        * zero, if are equal
         */
        return this.year - movie.year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Movie(String name, String type, int year, double rating) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.rating = rating;
    }
}
