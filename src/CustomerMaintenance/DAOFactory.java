package CustomerMaintenance;

public class DAOFactory
{
    public static CustomerTextFile getCustomerDAO()
    {
        CustomerTextFile ctfDAO = new MyCustomer();
        return ctfDAO;
    }
}
