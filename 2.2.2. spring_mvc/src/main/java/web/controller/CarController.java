package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.view.CarView;

@Controller
public class CarController {

    CarView carView;

    @Autowired
    public CarController(CarView carView) {
        this.carView = carView;
    }

    @GetMapping(value = "/cars")
    public String getSubListOfCars(@RequestParam(value = "count", required = false) Integer id, Model model) {
        if (id == null) {
            id = 5;
        }
        model.addAttribute("automobile", carView.selectCarsFromZeroToIndex(id));
        return "cars";
    }
}
