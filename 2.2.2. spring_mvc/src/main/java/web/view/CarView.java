package web.view;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.CarBuilder;

import java.util.Arrays;
import java.util.List;

@Service
public class CarView {
    public List<Car> createListOfCars() {
        Car car1 = new CarBuilder().buildId(1).buildModel("Toyota").buildSeries("RAW4").createCar();
        Car car2 = new CarBuilder().buildId(2).buildModel("Nissan").buildSeries("Qashqai").createCar();
        Car car3 = new CarBuilder().buildId(3).buildModel("Mazda").buildSeries("CX5").createCar();
        Car car4 = new CarBuilder().buildId(4).buildModel("BMW").buildSeries("X4").createCar();
        Car car5 = new CarBuilder().buildId(5).buildModel("Ford").buildSeries("Mustang").createCar();
        return Arrays.asList(car1, car2, car3, car4, car5);
    }

    public List<Car> selectCarsFromZeroToIndex(int index) {
        List<Car> cars = createListOfCars();
        if (index >= 5)
            return cars;
        else
            return cars.subList(0, index);
    }


}
