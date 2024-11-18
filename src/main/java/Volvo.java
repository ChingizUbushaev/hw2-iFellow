public class Volvo extends Car {
    protected static String BRAND_NAME = "Volvo";

    public Volvo() {
    }

    public Volvo(int year, String transmission, String nameModel, String color, int mileage, double fuelConsumption) {
        super(year, transmission, nameModel, color, mileage, fuelConsumption);
    }
}
