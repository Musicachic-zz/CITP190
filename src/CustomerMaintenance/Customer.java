package CustomerMaintenance;

public class Customer
{
    private String emailAddr;
    private String firstName;
    private String lastName;

    public Customer(String emailAddr, String firstName, String lastName)
    {
        this.emailAddr = emailAddr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmailAddr()
    {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr)
    {
        this.emailAddr = emailAddr;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
}
