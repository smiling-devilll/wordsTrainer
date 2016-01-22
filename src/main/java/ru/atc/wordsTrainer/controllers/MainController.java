package ru.atc.wordsTrainer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by VTestova on 03.12.2015.
 */
@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping("/")
    public String main(){
        return "index";
    }

}
