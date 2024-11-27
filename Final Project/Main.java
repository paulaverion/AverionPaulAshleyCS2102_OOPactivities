import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, String> userDatabase = new HashMap<>();
    private static HashMap<String, Tourist> touristDatabase = new HashMap<>();
    private static HashMap<Integer, CarbonFootprintCalculator> carbonCalculatorDatabase = new HashMap<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Carbon Footprint Calculator");
            System.out.println("-------------------------------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void register(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.next();

        if (userDatabase.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different username.");
            return;
        }

        System.out.print("Enter your password: ");
        String password = scanner.next();

        int id = nextId++;

        Tourist newTourist = new Tourist(id, 0.0);

        CarbonFootprintCalculator carbonCalculator = new CarbonFootprintCalculator(id);

        userDatabase.put(username, password);

        touristDatabase.put(username, newTourist);
        carbonCalculatorDatabase.put(id, carbonCalculator);

        System.out.println("Registration successful! Your ID is: " + id);
    }

    public static void login(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.next();

        System.out.print("Enter your password: ");
        String password = scanner.next();

        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            System.out.println("Login successful! Welcome, " + username + "!");
            
            Tourist tourist = touristDatabase.get(username);
            System.out.println("Your Tourist Details:");
            tourist.displayTouristInfo();

            manageCarbonFootprint(scanner, tourist.getId());

            CarbonFootprintCalculator carbonCalculator = carbonCalculatorDatabase.get(tourist.getId());
            tourist.setTotalCarbonFootprint(carbonCalculator.getTotalCarbonFootprint());
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    public static void manageCarbonFootprint(Scanner scanner, int id) {
        CarbonFootprintCalculator carbonCalculator = carbonCalculatorDatabase.get(id);

        while (true) {
            System.out.println("\nManage Carbon Footprint");
            System.out.println("-------------------------------");
            System.out.println("1. Add Electricity Usage");
            System.out.println("2. Add Vehicle Travel");
            System.out.println("3. Add Air Travel");
            System.out.println("4. Add Waste");
            System.out.println("5. Display Total Carbon Footprint");
            System.out.println("6. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter electricity usage in kWh: ");
                    double kWh = scanner.nextDouble();
                    carbonCalculator.addElectricityUsage(kWh);
                    break;
                case 2:
                    System.out.print("Enter liters of fuel used: ");
                    double liters = scanner.nextDouble();
                    carbonCalculator.addVehicleTravel(liters);
                    break;
                case 3:
                    System.out.print("Enter air travel distance in km: ");
                    double distance = scanner.nextDouble();
                    carbonCalculator.addAirTravel(distance);
                    break;
                case 4:
                    System.out.print("Enter waste in kg: ");
                    double waste = scanner.nextDouble();
                    carbonCalculator.addWaste(waste);
                    break;
                case 5:
                    carbonCalculator.displayTotalCarbonFootprint();
                    break;
                case 6:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}