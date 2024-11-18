public class Toyota extends Car {
    protected static String BRAND_NAME = "Toyota";

    public Toyota() {
    }

    public Toyota(int year, String transmission, String nameModel, String color, int mileage, double fuelConsumption) {
        super(year, transmission, nameModel, color, mileage, fuelConsumption);
    }
}
