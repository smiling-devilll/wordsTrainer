package ru.atc.wordsTrainer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.atc.wordsTrainer.entities.Word;
import ru.atc.wordsTrainer.services.WordService;
import ru.atc.wordsTrainer.training.WordForTraining;

import java.util.List;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**

 * Created by VTestova on 07.12.2015.
 */
@Controller
@RequestMapping("dictionary")
public class DictionaryController {
    @Autowired
    WordService wordService;

    @RequestMapping(value = "/dictionary")
    public String getDictionary(ModelMap modelMap){
        List<Word> words = wordService.getAll();
        modelMap.addAttribute("words", words);
        return "dictionary";
    }


}
