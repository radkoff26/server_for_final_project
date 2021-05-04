package server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import server.models.Word;
import server.services.WordService;

import java.util.List;

@Controller
public class WordController {

    @Autowired
    WordService wordService;

    @ResponseBody
    @RequestMapping("/getAllWords")
    public List<Word> getAllWords() {
        return wordService.getAllWords();
    }

    @ResponseBody
    @RequestMapping("/getWords")
    public List<Word> getWords(@RequestParam(name = "gr") Integer gr) {
        return wordService.getWords(gr);
    }

}
