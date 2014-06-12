package CustomerMaintenance;

import java.util.ArrayList;

public class DAOFactory
{
    public static CustomerTextFile getCustomerDAO()
    {
        CustomerTextFile ctfDAO = new CustomerTextFile();
        return ctfDAO;
    }
}
