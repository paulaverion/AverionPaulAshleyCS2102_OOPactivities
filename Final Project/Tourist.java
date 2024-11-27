public class Tourist {
    private int id;
    private double totalCarbonFootprint;

    public Tourist(int id, double totalCarbonFootprint) {
        this.id = id;
        this.totalCarbonFootprint = totalCarbonFootprint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalCarbonFootprint() {
        return totalCarbonFootprint;
    }

    public void setTotalCarbonFootprint(double totalCarbonFootprint) {
        this.totalCarbonFootprint = totalCarbonFootprint;
    }

    public void displayTouristInfo() {
        System.out.println("Tourist ID: " + id);
        System.out.println("Total Carbon Footprint: " + totalCarbonFootprint + " kg CO2");
    }
}
