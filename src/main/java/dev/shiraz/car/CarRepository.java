package dev.shiraz.car;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CarRepository {

    private Map<Integer, Car> carsMap = new LinkedHashMap<>();
    private Integer mapKey;

    public CarRepository() {
        carsMap.put(1,new Car("BMW", "350i", 2020, false));
        carsMap.put(2,new Car("Honda", "Civic", 2024, false));
        carsMap.put(3,new Car("Changan", "Alsvin", 2023, false));
        carsMap.put(4, new Car("MiniCooper", "mini cooper convetible", 2017, true));
            
            
            
        mapKey = carsMap.size();
    }

    public void saveCar(Car car) {
        int key = Integer.valueOf(mapKey) + 1;
        carsMap.put(key, car);
        mapKey++;
        System.out.println("added a new car: " + car.getName());
    }

    public Car getCar(int carId) {
        return carsMap.get(carId);
    }

    public void updateCar(Car car) {
        
    }

    public void deleteCar(int carId) {
        carsMap.remove(carId);
    }

    public List<Car> getAllCars() {
        return carsMap.values().stream().toList();
    }

}
