import java.text.DecimalFormat;

public class CarbonFootprintCalculator implements CarbonFootprintEntry {
    private double totalCarbonFootprint;
    private StringBuilder entries;
    private DecimalFormat df;

    public CarbonFootprintCalculator() {
        this.totalCarbonFootprint = 0.0;
        this.entries = new StringBuilder();
        this.df = new DecimalFormat("#.00");
    }

    public void addEntry(double value) {
        totalCarbonFootprint += value;
    }

    public void addElectricityUsage(double kWh) {
        double footprint = kWh * 0.233;
        totalCarbonFootprint += footprint;
        entries.append("Electricity Usage: ").append(kWh).append(" kWh, Carbon Footprint: ")
               .append(df.format(footprint)).append(" kg CO2\n");
    }

    public void addVehicleTravel(double liters) {
        double footprint = liters * 2.31;
        totalCarbonFootprint += footprint;
        entries.append("Vehicle Travel: ").append(liters).append(" liters, Carbon Footprint: ")
               .append(df.format(footprint)).append(" kg CO2\n");
    }

    public void addAirTravel(double distance) {
        double footprint = distance * 0.09;
        totalCarbonFootprint += footprint;
        entries.append("Air Travel: ").append(distance).append(" km, Carbon Footprint: ")
               .append(df.format(footprint)).append(" kg CO2\n");
    }

    public void addWaste(double waste) {
        double footprint = waste * 1.9;
        totalCarbonFootprint += footprint;
        entries.append("Waste: ").append(waste).append(" kg, Carbon Footprint: ")
               .append(df.format(footprint)).append(" kg CO2\n");
    }

    public double getTotalCarbonFootprint() {
        return totalCarbonFootprint;
    }

    @Override
    public void displayEntryDetails() {
        System.out.println("All Carbon Footprint Entries:");
        System.out.println(entries.length() > 0 ? entries.toString() : "No entries available.");
    }

    public void displayTotalCarbonFootprint() {
        System.out.println("Total Carbon Footprint: " + df.format(totalCarbonFootprint) + " kg CO2");
    }
}