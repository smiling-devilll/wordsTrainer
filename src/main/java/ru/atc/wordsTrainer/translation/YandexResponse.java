package ru.atc.wordsTrainer.translation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.http.HttpStatus;

/**
 * Created by VTestova on 04.12.2015.
 */


public class YandexResponse {
    @JsonIgnore
    HttpStatus code;
    @JsonView
    String lang;
    @JsonView
    String[] text;

    public YandexResponse() {
    }

    public HttpStatus getCode() {
        return code;
    }

    @JsonProperty(value = "code")
    @JsonDeserialize(using = HttpStatusDeserializer.class)
    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

}
