package web.controller.servises;

import org.springframework.stereotype.Service;
import web.controller.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List cars;

    public CarService() {
        cars = new ArrayList();
        cars.add(new Car("lada", 1111, "oleg"));
        cars.add(new Car("ladapriora", 1112, "ayabjoni"));
        cars.add(new Car("ladagranta", 1113, "najibulli"));
        cars.add(new Car("ladakalina", 1114, "timerbulat"));
        cars.add(new Car("ladavesta", 1115, "oleg"));
    }

    public List getAllCars() {
        return cars;
    }

    public List getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}