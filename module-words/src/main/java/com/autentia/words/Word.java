package com.autentia.words;

public class Word {

    private final CharSequence characters;

    public Word(CharSequence characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return characters.toString();
    }

}
