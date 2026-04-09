import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Original bogie list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");

        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        // Show original list unchanged
        System.out.println("\nOriginal Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}