import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Calculate total seating capacity
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)     // extract capacity
                .reduce(0, Integer::sum); // sum all values

        // Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Show original list unchanged
        System.out.println("\nBogie Details:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}