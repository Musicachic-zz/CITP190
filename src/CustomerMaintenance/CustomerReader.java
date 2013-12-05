package CustomerMaintenance;

import java.util.ArrayList;

public interface CustomerReader
{
    Customer getCustomer(String emailAddress);
    ArrayList<Customer> getCustomers();
}
