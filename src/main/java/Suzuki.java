public class Suzuki extends Car {
    protected static String BRAND_NAME = "Suzuki";

    public Suzuki() {
    }

    public Suzuki(int year, String transmission, String nameModel, String color, int mileage, double fuelConsumption) {
        super(year, transmission, nameModel, color, mileage, fuelConsumption);
    }
}
