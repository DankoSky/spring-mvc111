package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Service;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> Carslist = Service.getListCars(count);
        model.addAttribute("Carlist", Carslist);

        return "cars";
    }

}