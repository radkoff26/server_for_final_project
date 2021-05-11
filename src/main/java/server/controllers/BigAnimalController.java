package server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import server.models.BigAnimal;
import server.services.BigAnimalService;

import java.util.List;

@Controller
public class BigAnimalController {

    @Autowired
    BigAnimalService service;

    @ResponseBody
    @RequestMapping("/getBigAnimals")
    public List<BigAnimal> getBigAnimals() {
        return service.getBigAnimals();
    }
}
