package ru.atc.wordsTrainer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.atc.wordsTrainer.entities.Word;
import ru.atc.wordsTrainer.repositories.WordRepository;
import ru.atc.wordsTrainer.training.WordForTraining;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VTestova on 07.12.2015.
 */
@Service
public class TrainingService {
    @Value("${training-words-amount}") int count;


    @Autowired
    WordRepository wordRepository;

    public List<WordForTraining> getWordsForTraining() {
        List<WordForTraining> wordsForTrainings = new ArrayList<>();
        List<Word> candidates = wordRepository.findWordsForTraining(count);
        for (Word word : candidates) {
            List<Word> translations = wordRepository.findTranslationVariants(word.getId());
            if (!translations.contains(word)) translations.add(word);
            wordsForTrainings.add(new WordForTraining(word, translations));
        }
        return wordsForTrainings;
    }
}
