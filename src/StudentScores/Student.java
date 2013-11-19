/*            *             ====================================================                                                                                                            ***                      ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: Student.java
*            ***            # Project Name: Workbook Assignment 11-2
*             *             # Description: Here is my Student Scores program.
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

package StudentScores;

public class Student implements Comparable
{
    private String lastName;
    private String firstName;
    private int score;

    protected Student(String lastName, String firstName, int score)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.score = score;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    @Override
    public int compareTo(Object o)
    {
        Student s = (Student) o;
        int lastNameCompare = this.getLastName().compareTo(s.getLastName());
        if (lastNameCompare != 0)
            return lastNameCompare;
        else
            return (this.getFirstName().compareTo(s.getFirstName()));
    }
}
