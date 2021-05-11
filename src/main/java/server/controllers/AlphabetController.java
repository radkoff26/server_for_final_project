package server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import server.models.Letter;
import server.services.AlphabetService;

import java.util.List;

@Controller
public class AlphabetController {

    @Autowired
    private AlphabetService alphabetService;

    @ResponseBody
    @RequestMapping("/getAlphabet")
    public List<Letter> getLetters() {
        return alphabetService.getLetters();
    }
}
