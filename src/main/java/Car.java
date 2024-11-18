public class Car {
    protected static String BRAND_NAME = "машина";
    protected int year;
    protected String transmission;  // коробка передач
    protected String nameModel;
    protected String color;      // мощьность двигателя в лс
    protected int mileage;   // объем двигателя в литрах
    protected double fuelConsumption;  // расход топлива

    public Car() {

    }


    public Car(int year, String transmission, String nameModel, String color, int mileage, double fuelConsumption) {
        this.year = year;
        this.transmission = transmission;
        this.nameModel = nameModel;
        this.color = color;
        this.mileage = mileage;
        this.fuelConsumption = fuelConsumption;
    }

    public void carInfo() {
        System.out.println(
                "модель автомобиля: " + this.nameModel + " " +
                        "год выпуска: " + this.year + " " +
                        "коробка передач: " + this.transmission + " " +
                        "цвет: " + this.color + " " +
                        "пробег: " + this.mileage + " " +
                        "расход топлива: " + this.fuelConsumption
        );
    }

    public void move(int distance) {
        this.mileage = this.mileage + distance;
        System.out.println("Пробег увеличился на " + distance + " км.");
    }

    public void repaint(String newColor) {
        this.color = newColor;
        System.out.println("Машина перекрашена в " + this.color + " цвет.");
    }

    public String getTransmission() {
        return transmission;
    }

    public String getNameModel() {
        return nameModel;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
