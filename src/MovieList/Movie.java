/*            *             ====================================================                                                                                                            ***                      ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: Movie.java
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

public class Movie implements Comparable
{
    private String title;
    private String genre;


    public Movie(String title, String genre)
    {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    @Override
    public int compareTo(Object o)
    {
        Movie m = (Movie) o;
        int titleCompare = this.getTitle().compareTo(m.getTitle());
        if (titleCompare != 0)
            return titleCompare;
        else
            return(this.getTitle().compareToIgnoreCase(m.getTitle()));
    }
}


