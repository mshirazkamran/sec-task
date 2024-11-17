package dev.shiraz.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    
    private final CarRepository carRepo;

    @Autowired
    public CarService(CarRepository carRepo) {
        this.carRepo = carRepo;
    }

    public void saveCar(Car car) {
        carRepo.saveCar(car);
    }

    public Car getCar(int carId) {
        return carRepo.getCar(carId);
    }

    public List<Car> getAllCars() {
        return carRepo.getAllCars();
    }

    public void updateCar(Car car) {
        carRepo.updateCar(car);
    }


    public void deleteCar(int carId) {
        carRepo.deleteCar(carId);
    }
}
