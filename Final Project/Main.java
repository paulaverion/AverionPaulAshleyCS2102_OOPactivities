import java.util.*;

public class Main {
    private static Map<String, String> userDatabase = new HashMap<>();
    private static Map<String, Tourist> touristDatabase = new HashMap<>();
    private static Map<Integer, CarbonFootprintCalculator> calculatorDatabase = new HashMap<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCarbon Footprint Calculator");
            System.out.println("-------------------------------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
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
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    private static void register(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.next();

        if (userDatabase.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different username.");
            return;
        }

        System.out.print("Enter your password: ");
        String password = scanner.next();

        int id = nextId++;
        Tourist newTourist = new Tourist(id, username);
        CarbonFootprintCalculator calculator = new CarbonFootprintCalculator();

        userDatabase.put(username, password);
        touristDatabase.put(username, newTourist);
        calculatorDatabase.put(id, calculator);

        System.out.println("Registration successful! Your ID is: " + id);
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.next();

        System.out.print("Enter your password: ");
        String password = scanner.next();

        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            Tourist tourist = touristDatabase.get(username);
            System.out.println("Login successful! Welcome, " + username + "!");
            tourist.displayInfo();

            manageCarbonFootprint(scanner, tourist.getId());

            CarbonFootprintCalculator calculator = calculatorDatabase.get(tourist.getId());
            tourist.setTotalCarbonFootprint(calculator.getTotalCarbonFootprint());
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static void manageCarbonFootprint(Scanner scanner, int id) {
        CarbonFootprintCalculator calculator = calculatorDatabase.get(id);

        while (true) {
            System.out.println("\nManage Carbon Footprint");
            System.out.println("-------------------------------");
            System.out.println("1. Add Electricity Usage");
            System.out.println("2. Add Vehicle Travel");
            System.out.println("3. Add Air Travel");
            System.out.println("4. Add Waste");
            System.out.println("5. Display Total Carbon Footprint");
            System.out.println("6. Display All Entries");
            System.out.println("7. Logout");
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addElectricity(scanner, calculator);
                        break;
                    case 2:
                        addVehicle(scanner, calculator);
                        break;
                    case 3:
                        addAirTravel(scanner, calculator);
                        break;
                    case 4:
                        addWaste(scanner, calculator);
                        break;
                    case 5:
                        calculator.displayTotalCarbonFootprint();
                        break;
                    case 6:
                        calculator.displayEntryDetails();
                        break;
                    case 7:
                        System.out.println("Logging out...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    private static void addElectricity(Scanner scanner, CarbonFootprintCalculator calculator) {
        System.out.print("Enter electricity usage in kWh: ");
        if (scanner.hasNextDouble()) {
            double kWh = scanner.nextDouble();
            if (kWh >= 0) {
                calculator.addElectricityUsage(kWh);
            } else {
                System.out.println("Electricity usage cannot be negative.");
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next();
        }
    }

    private static void addVehicle(Scanner scanner, CarbonFootprintCalculator calculator) {
        System.out.print("Enter liters of fuel used: ");
        if (scanner.hasNextDouble()) {
            double liters = scanner.nextDouble();
            if (liters >= 0) {
                calculator.addVehicleTravel(liters);
            } else {
                System.out.println("Fuel usage cannot be negative.");
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next();
        }
    }

    private static void addAirTravel(Scanner scanner, CarbonFootprintCalculator calculator) {
        System.out.print("Enter air travel distance in km: ");
        if (scanner.hasNextDouble()) {
            double distance = scanner.nextDouble();
            if (distance >= 0) {
                calculator.addAirTravel(distance);
            } else {
                System.out.println("Distance cannot be negative.");
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next();
        }
    }

    private static void addWaste(Scanner scanner, CarbonFootprintCalculator calculator) {
        System.out.print("Enter waste in kg: ");
        if (scanner.hasNextDouble()) {
            double waste = scanner.nextDouble();
            if (waste >= 0) {
                calculator.addWaste(waste);
            } else {
                System.out.println("Waste cannot be negative.");
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next();
        }
    }
}