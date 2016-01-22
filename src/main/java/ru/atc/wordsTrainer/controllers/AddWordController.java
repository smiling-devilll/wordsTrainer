package ru.atc.wordsTrainer.controllers;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.atc.wordsTrainer.entities.Word;
import ru.atc.wordsTrainer.services.WordService;
import ru.atc.wordsTrainer.translation.Translator;
import ru.atc.wordsTrainer.translation.YandexTranslator;

import java.sql.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by VTestova on 03.12.2015.
 */
@Controller
@RequestMapping("translation")
public class AddWordController {

    @Autowired
    WordService wordService;
    @Autowired
    @Qualifier("yandex")
    Translator translator;

    @RequestMapping(value = "translatedWord", method = GET)
    public String translatedWord(ModelMap modelMap) {
        return "translatedWord";
    }

    @RequestMapping(value = "translate", method = GET)
    public String enterWord() {
        return "addWord";
    }

    @RequestMapping(value = "translate", method = POST)
    public String translate(@ModelAttribute("word") String word, ModelMap modelMap) {
        System.out.println(word);
        Word newWord = translator.translate(word);
        newWord.setAddingDate(new DateTime().toDate());
        newWord.setLastTrained(new DateTime().minusDays(100).toDate());
        wordService.save(newWord);

        modelMap.addAttribute("word", newWord);
        return "translatedWord";
    }
}
