package pl.coderslab;

public interface CustomerRepository {
    void addClient(int id, Customer customer);
    void deleteClient(int id);
    void printListOfClients();

}
