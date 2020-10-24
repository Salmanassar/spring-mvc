package web.model;

import org.springframework.stereotype.Service;

@Service
public class CarBuilder {
    private int id;
    private String modelB;
    private String seriesB;

    public CarBuilder buildId(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder buildModel(String modelB) {
        this.modelB = modelB;
        return this;
    }

    public CarBuilder buildSeries(String seriesB) {
        this.seriesB = seriesB;
        return this;
    }

    public Car createCar() {
        Car car = new Car();
        car.setId(id);
        car.setModel(modelB);
        car.setSeries(seriesB);
        return car;
    }
}