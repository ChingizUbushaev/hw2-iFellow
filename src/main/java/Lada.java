public class Lada extends Car {
    protected static String BRAND_NAME = "Lada";

    public Lada() {
    }

    public Lada(int year, String transmission, String nameModel, String color, int mileage, double fuelConsumption) {
        super(year, transmission, nameModel, color, mileage, fuelConsumption);
    }
}
