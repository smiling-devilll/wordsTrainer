package ru.atc.wordsTrainer.system;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * Created by VTestova on 03.12.2015.
 */

@EnableAutoConfiguration
@ComponentScan("ru.atc.wordsTrainer")
@EntityScan("ru.atc.wordsTrainer")
@EnableJpaRepositories("ru.atc.wordsTrainer")
@EnableTransactionManagement
@Configuration
@PropertySource("file:application.properties")
public class Main {


    @Bean
    public ViewResolver createViewResolver() {
        FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();

        viewResolver.setCache(false);
        viewResolver.setSuffix(".ftl");
        viewResolver.setContentType("text/html;charset=UTF-8");

        return viewResolver;
    }


}
