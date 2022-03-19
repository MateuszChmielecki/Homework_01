package pl.coderslab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MemoryCustomerRepository implements CustomerRepository{
    HashMap<Integer, Customer> customerHashMap = new HashMap<>();
    private final CustomerLogger customerLogger;

    public MemoryCustomerRepository(CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    @Override
    public void addClient(int id, Customer customer) {
        customerHashMap.put(id,customer);
        customerLogger.log();

    }

    @Override
    public void deleteClient(int id) {
        customerHashMap.remove(id);
        customerLogger.log();

    }

    @Override
    public void printListOfClients() {
        Set<Map.Entry<Integer,Customer>> entrySet = customerHashMap.entrySet();
        for(Map.Entry<Integer, Customer> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        customerLogger.log();

    }
}
