package ru.atc.wordsTrainer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.atc.wordsTrainer.entities.Word;
import ru.atc.wordsTrainer.services.TrainingService;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by VTestova on 03.12.2015.
 */
@Controller
@RequestMapping("train")
public class TrainingController {
    @Autowired
    TrainingService trainingService;

    @RequestMapping(value = "/training", method = GET)
    public String trainWords(ModelMap modelMap){
        modelMap.addAttribute("wordsForTraining", trainingService.getWordsForTraining());

        return "training";
    }

    @RequestMapping(value = "/training", method = POST)
    public void setNewTrainingDate(@ModelAttribute("answer") String answer,
                                   ModelMap modelMap){

//        System.out.println(modelMap.containsAttribute("wrd"));
//        System.out.println(modelMap.containsAttribute("name"));
//        System.out.println(answer);
        for (Map.Entry entry : modelMap.entrySet()){
            System.out.print(entry.getKey().toString() + " : ");
            System.out.println(entry.getValue().toString());
        }
//        return "redirect:/training";
    }
@RequestMapping(value = "/training2", method = POST)
    public String setNewTrainingDate2(@ModelAttribute("answer") String answer,
                                   ModelMap modelMap){
    System.out.println("training2");
//        System.out.println(modelMap.containsAttribute("wrd"));
//        System.out.println(modelMap.containsAttribute("name"));
//        System.out.println(answer);
        for (Map.Entry entry : modelMap.entrySet()){
            System.out.print(entry.getKey().toString() + " : ");
            System.out.println(entry.getValue().toString());
        }
        return "redirect:training";
    }

}
