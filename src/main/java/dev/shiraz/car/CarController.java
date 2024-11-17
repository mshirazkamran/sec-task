package dev.shiraz.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Controller;



@Controller
@RequestMapping
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    
    @GetMapping("/car/{id}")
    @ResponseBody
    public Car getCar(@PathVariable int id) {
        return carService.getCar(id);
    }

    @GetMapping("/all-cars")
    @ResponseBody
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    // @GetMapping("/lol")
    // public String hello() {
    //     System.out.println("hello() executed!");
    //     return "helllo grpm shiraz";
    // }

    @GetMapping("/car")
    public String carRegistration() {
        return "addCar";
    }

    @PostMapping("/car")
    public String createCar(@ModelAttribute Car car) {
        carService.saveCar(car);

        return "addedCar";
    }

    @DeleteMapping("/car")
    public String deleteCar(@RequestParam int id) {
        carService.deleteCar(id);
        return "deletedCar";
    }

    @PutMapping("/car")
    public String updateCar(@RequestBody Car car) {
        carService.updateCar(car);
        return "updatedCar";
    }
    
}
