package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.controller.model.Car;
import web.controller.servises.CarService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

@Controller
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping("/car")
    public String getCars(@RequestParam("count") int count, ModelMap model) {
        List cars;
        if (count >= 5) {
            cars = carService.getAllCars();
        } else {
            cars = carService.getCars(count);
        }
        model.addAttribute("cars", cars);

        return "car";
    }


}
