package ru.atc.wordsTrainer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by VTestova on 04.12.2015.
 */
@Entity
public class Word {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String original;
    private String translation;
    private Date lastTrained;
    private Date addingDate;

    public Word(){}

    @Override
    public String toString() {
        return "Word{" +
                "original='" + original + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }

    public Word(String original, String translation){
        this.original = original;
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(Date addingDate) {
        this.addingDate = addingDate;
    }

    public Date getLastTrained() {
        return lastTrained;
    }

    public void setLastTrained(Date lastTrained) {
        this.lastTrained = lastTrained;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        if (original != null ? !original.equals(word.original) : word.original != null) return false;
        if (translation != null ? !translation.equals(word.translation) : word.translation != null) return false;
        if (lastTrained != null ? !lastTrained.equals(word.lastTrained) : word.lastTrained != null) return false;
        return !(addingDate != null ? !addingDate.equals(word.addingDate) : word.addingDate != null);

    }

    @Override
    public int hashCode() {
        int result = original != null ? original.hashCode() : 0;
        result = 31 * result + (translation != null ? translation.hashCode() : 0);
        result = 31 * result + (lastTrained != null ? lastTrained.hashCode() : 0);
        result = 31 * result + (addingDate != null ? addingDate.hashCode() : 0);
        return result;
    }

}
