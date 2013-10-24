package PersonTester;


public class Customer extends Person
{
    private String custNum;

    public Customer(String firstName, String lastName, String email)
    {
        super(firstName, lastName, email);
        custNum = "";
    }

    public String getCustNum()
    {
        return custNum;
    }

    public void setCustNum(String custNum)
    {
        this.custNum = custNum;
    }

    @Override
    public String getDisplayText()
    {
        return super.toString() +
            "Customer Number: " + custNum + "\n";
    }
}
