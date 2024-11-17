package dev.shiraz.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/v1")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    
    @GetMapping("/car")
    public ResponseEntity<Car> getCar(@RequestParam int id) {
        return ResponseEntity.ok(carService.getCar(id));
    }

    @GetMapping("/all-cars")
    public ResponseEntity<List<Car>> getAllCars() {
        return ResponseEntity.ok(carService.getAllCars());
    }

    // @GetMapping("/lol")
    // public String hello() {
    //     System.out.println("hello() executed!");
    //     return "helllo grpm shiraz";
    // }

    @PostMapping("/car")
    public void createCar(@RequestBody Car car) {
        carService.saveCar(car);
    }

    @DeleteMapping("/car")
    public void deleteCar(@RequestParam int id) {
        carService.deleteCar(id);
    }

    @PutMapping("/car")
    public void updateCar(@RequestBody Car car) {
        carService.updateCar(car);
    }
    
}
