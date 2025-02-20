package web.service;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImp  implements CarService {
    private List<Car> cars;


    public CarServiceImp() {
        cars = new ArrayList<Car>();
        cars.add(new Car("BMW", "White", 5));
        cars.add(new Car("Audi", "Black", 2));
        cars.add(new Car("Chevrolet", "Blue", 10));
        cars.add(new Car("Jeep", "Red", 6));
        cars.add(new Car("LadaGranta", "Brown", 1000));

    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream()
                .limit(Math.min(count, cars.size()))
                .collect(Collectors.toList());


//создание метода который будет возвращать указанное количество машин из списка
    }
}
