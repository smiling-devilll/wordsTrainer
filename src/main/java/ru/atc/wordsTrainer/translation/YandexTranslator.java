package ru.atc.wordsTrainer.translation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.atc.wordsTrainer.entities.Word;

import java.nio.charset.Charset;

/**
 * Created by VTestova on 04.12.2015.
 */
@Service
@Qualifier("yandex")
public class YandexTranslator implements Translator {

    private RestTemplate restTemplate = new RestTemplate();
    private String targetLanguage = "en";

    @Value("${yandex.key}")
    private String key;
    private String address = "https://translate.yandex.net/api/v1.5/tr.json/translate";
    private String query;
    public YandexTranslator(){
    }

    //https://translate.yandex.net/api/v1.5/tr.json/translate?
    // key=trnsl.1.1.20151204T081607Z.0de8453f6a948df4.0dc9733f9bfd7f40802987c7ecb187a4ae9dfe36&lang=en-ru&text=hello+world
    @Override
    public Word translate(String word) {
        query = address + "?"+"key="+key+"&"+"lang="+targetLanguage+"&"+"text="+word;
        restTemplate.getMessageConverters()
                .add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        YandexResponse response = restTemplate.postForObject(query, "", YandexResponse.class);

        if (response.getCode().equals(HttpStatus.OK)){
            return new Word(word, response.getText()[0]);
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
