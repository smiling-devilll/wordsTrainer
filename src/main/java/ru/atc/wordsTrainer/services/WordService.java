package ru.atc.wordsTrainer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.atc.wordsTrainer.entities.Word;
import ru.atc.wordsTrainer.repositories.WordRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by VTestova on 04.12.2015.
 */
@Service
public class WordService {

    @Autowired
    WordRepository wordRepository;

    public List<String> getAllTranslationsForWord(Word word){
        List<Word> list = wordRepository.findAllTranslationsByWord(word);
        List<String> translations = new ArrayList<String>();
        for (Word wrd : list){
            translations.add(wrd.getTranslation());
        }
        return translations;
    }

    public void save(Word word){
        wordRepository.save(word);
    }

    public List<Word> getAll(){
        List<Word> words =  new ArrayList<Word>();
        for (Word word : wordRepository.findAll()){
            words.add(word);
        }
        return words;
    }
}
