package ru.atc.wordsTrainer.translation;

import ru.atc.wordsTrainer.entities.Word;

/**
 * Created by VTestova on 04.12.2015.
 */
public interface Translator {
    Word translate(String word);
}
