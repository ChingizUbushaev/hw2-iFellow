import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Suzuki(2009, "механика", "SX4", "зелёный", 105960, 9.5));
        cars.add(new Suzuki(2015, "автомат", "Swift", "серый", 54600, 7.1));
        cars.add(new Toyota(2004, "механика", "Corolla", "черный", 120455, 8.9));
        cars.add(new Toyota(2010, "автомат", "Camry", "синий", 84320, 7.3));
        cars.add(new Lada(2012, "механика", "Priora", "черный", 81342, 8.3));
        cars.add(new Lada(2016, "автомат", "Vesta", "белый", 92442, 8.5));
        cars.add(new Mercedes(2001, "механика", "S-class", "черный", 140250, 9.3));
        cars.add(new Mercedes(2017, "автомат", "E-class", "белый", 73342, 8.8));
        cars.add(new Volvo(2012, "механика", "XC60", "зелёный", 89342, 10.3));
        cars.add(new Volvo(2019, "автомат", "S60", "зелёный", 43342, 10.3));

        checkNewCar(cars);
        repaintToRed(cars);
        checkMileage(cars);
    }

    public static void checkNewCar(List<Car> cars) {
        /*
         * Метод выводит "Устаревший авто", если авто было произведено в 2006 году либо ранее.
         * Выводит информацию об авто во всех остальных случаях.
         */
        for (Car car : cars) {
            if (car.getYear() < 2007) {
                System.out.println("Устаревший авто");
            } else {
                car.carInfo();
            }

        }

    }

    public static void repaintToRed(List<Car> cars) {
        /*
         * Метод выводит на экран все автомобили, которые были перекрашены с зелёного в красный
         */
        System.out.println("Автомобили перекрашенные в красный: ");
        for (Car car : cars) {
            if (car.getColor().equals("зелёный")) {
                car.repaint("красный");
                car.carInfo();
            }
        }
    }

    public static void checkMileage(List<Car> cars) {
        /*
         * Метод выводит на экран все автомобили с пробегов больше 100 000 км.
         */
        System.out.println("Автомобили с пробегов выше 100 000 км.:");
        for (Car car : cars) {
            if (car.getMileage() > 100000) {
                car.carInfo();
            }
        }
    }


}
