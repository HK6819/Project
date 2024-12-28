
import java.io.IOException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {
            Manager manager = new Manager();
            manager.readParcelsFromFile("C:\\Users\\PMLS\\IdeaProjects\\CLIBASED\\out\\production\\Project\\src\\Parcels.txt");
            manager.readCustomersFromFile("C:\\Users\\PMLS\\IdeaProjects\\CLIBASED\\out\\production\\Project\\src\\Customer.txt");
            manager.processCustomers();
            manager.generateReport("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
