import java.io.*;
import java.util.*;

public class FileHandler {
    private static final String FILE_NAME = "carbon_footprint_data.txt";

    public static void saveData(int userId, String entryDetails, double totalCarbonFootprint) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write("User ID: " + userId);
            writer.newLine();
            writer.write(entryDetails);
            writer.write("Total Carbon Footprint: " + String.format("%.2f", totalCarbonFootprint) + " kg CO2");
            writer.newLine();
            writer.write("------------------------------------------------------------");
            writer.newLine();
            System.out.println("Data saved successfully!");
        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }

    // Method to read and display all saved data
    public static void readData() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No data file found.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\nStored Data:");
            System.out.println("------------------------------------------------------------");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading data: " + e.getMessage());
        }
    }
}