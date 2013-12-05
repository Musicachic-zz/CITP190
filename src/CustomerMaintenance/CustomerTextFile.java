package CustomerMaintenance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public abstract class CustomerTextFile implements CustomerDAO
{
    private ArrayList<Customer> customers = null;
    private Path customersPath = null;
    private File customersFile = null;

    private final String FIELD_SEP = "\t";

    public CustomerTextFile()
    {
        customersPath = Paths.get("customers.txt");
        customersFile = customersPath.toFile();
        customers = this.getCustomer();
    }
    public ArrayList<Customer> getCustomer()
    {
        if (customers != null)
            return customers;

        customers = new ArrayList<>();

        if (Files.exists(customersPath))
        {
            try (BufferedReader in =
                    new BufferedReader(
                    new FileReader(customersFile)))
            {
                String line = in.readLine();
                while (line != null)
                {
                    System.out.println(line);
                    line = in.readLine();
                }
            }
            catch (IOException e)
            {
                System.out.println(e);
                return null;
            }
        }
        return customers;
    }
}
