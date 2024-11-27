public class CarbonFootprintCalculator {
    private int id;
    private double totalCarbonFootprint;

    private static final double ELECTRICITY_EMISSION_FACTOR = 0.9;
    private static final double GASOLINE_EMISSION_FACTOR = 2.31;
    private static final double AIR_TRAVEL_EMISSION_FACTOR = 0.15;
    private static final double WASTE_EMISSION_FACTOR = 1.2;

    public CarbonFootprintCalculator(int id) {
        this.id = id;
        this.totalCarbonFootprint = 0.0;
    }

    public void addElectricityUsage(double kWh) {
        double carbon = kWh * ELECTRICITY_EMISSION_FACTOR;
        totalCarbonFootprint += carbon;
        System.out.println("Electricity usage added: " + carbon + " kg CO2");
    }

    public void addVehicleTravel(double litersOfFuel) {
        double carbon = litersOfFuel * GASOLINE_EMISSION_FACTOR;
        totalCarbonFootprint += carbon;
        System.out.println("Vehicle travel added: " + carbon + " kg CO2");
    }

    public void addAirTravel(double distanceKm) {
        double carbon = distanceKm * AIR_TRAVEL_EMISSION_FACTOR;
        totalCarbonFootprint += carbon;
        System.out.println("Air travel added: " + carbon + " kg CO2");
    }

    public void addWaste(double kgOfWaste) {
        double carbon = kgOfWaste * WASTE_EMISSION_FACTOR;
        totalCarbonFootprint += carbon;
        System.out.println("Waste disposal added: " + carbon + " kg CO2");
    }

    public double getTotalCarbonFootprint() {
        return totalCarbonFootprint;
    }

    public void displayTotalCarbonFootprint() {
        System.out.println("Total Carbon Footprint for ID " + id + ": " + totalCarbonFootprint + " kg CO2");
    }
}