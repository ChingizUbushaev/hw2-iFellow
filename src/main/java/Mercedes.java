public class Mercedes extends Car {
    protected static String BRAND_NAME = "Mercedes";

    public Mercedes() {
    }

    public Mercedes(int year, String transmission, String nameModel, String color, int mileage, double fuelConsumption) {
        super(year, transmission, nameModel, color, mileage, fuelConsumption);
    }
}
