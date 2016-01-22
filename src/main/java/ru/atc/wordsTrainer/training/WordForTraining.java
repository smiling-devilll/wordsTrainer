package ru.atc.wordsTrainer.training;

import ru.atc.wordsTrainer.entities.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VTestova on 07.12.2015.
 */
public class WordForTraining {


    Word word;
    List<Word> variants;


    public WordForTraining(){}

    public WordForTraining(Word word, List<Word> variants){
        this.word = word;
        this.variants = new ArrayList<>(variants);
    }
    public List<Word> getVariants() {
        return variants;
    }

    public void setVariants(List<Word> variants) {
        this.variants = variants;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

}
