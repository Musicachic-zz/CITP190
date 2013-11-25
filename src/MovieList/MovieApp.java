/*            *             ====================================================                                                                                                            ***                      ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: MovieApp.java
*            ***            # Project Name: Workbook Assignment 12-1
*             *             # Description: Here is my Movie List program.
*                           ====================================================
*      *              *
*     ***            ***
*   *******        *******
*    *****          *****
*     ***            ***
*      *              *
*
*
*/

package MovieList;

import java.util.*;

public class MovieApp {

    public static void main (String args[])
    {
        System.out.println("Welcome to the Movie List Application.");
        System.out.println("There are 100 movies on the list.");


        Scanner sc = new Scanner(System.in);

        String choice = "y";

        ArrayList<Movie> myListOfMovies = createArrayList();

        System.out.println(myListOfMovies.size());


        while (choice.equalsIgnoreCase("y"))
        {
            System.out.println("There are four categories: animated, drama, horror, and scifi");
            System.out.println();

            String personMovieCategory = Validator.getRequiredString(sc, "What category are you interested in? ");

            Collection<Movie> matchedMovies = new TreeSet<>();
            for(Movie movie : myListOfMovies) {
                if (personMovieCategory.equalsIgnoreCase(movie.getGenre()))
                {
                    matchedMovies.add(movie);
                }
            }
            for (Movie movie : matchedMovies)
            {
                System.out.println(movie.getTitle());
            }

            choice = Validator.getRequiredString(sc, "Continue? (y/n): ");
            System.out.println();

        }
    }

    public static ArrayList<Movie> createArrayList()
    {
        Movie m;
        ArrayList<Movie> creatingArrayList = new ArrayList<>();
        for (int i = 0; i <= 100; i++ )
        {
            m = MovieIO.getMovie(i);

            creatingArrayList.add(m);
        }
        return creatingArrayList;

    }
}
