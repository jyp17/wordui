package edu.mills.cs180a.wordui.model;

import java.util.Objects;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class WordRecord {
    private final StringProperty word = new SimpleStringProperty(this, "word", "");
    private final IntegerProperty frequency = new SimpleIntegerProperty(this, "frequency");
    private final StringProperty definition =
            new SimpleStringProperty(this, "definition", "sample definition");

    public WordRecord() {}

    public WordRecord(String word, Integer frequency, String definition) {
        this.word.set(word);
        this.frequency.set(frequency);
        this.definition.set(definition);
    }

    public String getWord() {
        return word.get();
    }

    public StringProperty wordProperty() {
        return word;
    }

    public void setWord(String word) {
        this.word.set(word);
    }

    public Integer getFrequency() {
        return frequency.get();
    }

    public IntegerProperty frequencyProperty() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency.set(frequency);
    }

    public String getDefinition() {
        return definition.get();
    }

    public StringProperty definitionProperty() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition.set(definition);
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", word.get(), frequency.get());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        WordRecord record = (WordRecord) obj;
        return Objects.equals(word, record.word) && Objects.equals(frequency, record.frequency)
                && Objects.equals(definition, record.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, definition);
    }
}
