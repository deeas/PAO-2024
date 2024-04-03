package compare.comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Movie forceAwakens = new Movie("Force Awakens" , "SF", 2015, 10);
        Movie starWars = new Movie("Star Wars", "SF", 1977, 10);
        Movie upsideDown = new Movie("Upside Down", "Animation", 1980, 10);

        Movie[] movies  = {forceAwakens, starWars, upsideDown};
        Arrays.sort(movies);

        for (Movie movie: movies) {
            System.out.println(movie.getName() + " - " + movie.getYear());
        }
    }
}
