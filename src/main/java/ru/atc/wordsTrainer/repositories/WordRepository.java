package ru.atc.wordsTrainer.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.atc.wordsTrainer.entities.Word;

import java.util.List;

/**
 * Created by VTestova on 04.12.2015.
 */
@Repository
public interface WordRepository extends CrudRepository<Word, Long> {

    @Query("select word from Word word where word.original=?1")
    List<Word> findAllTranslationsByWord(Word word);

    @Query("select word from Word word where sysdate - word.lastTrained > 10 and rownum < ?1")
    List<Word> findWordsForTraining(int count);

    @Query("select word from Word word where word.id <> ?1 and rownum < 3")
    List<Word> findTranslationVariants(Long id);
}
