package com.autentia.dictionary;

import com.autentia.words.Word;
import com.autentia.words.friends.WordGenerator;

public class Dictionary {

    private final WordGenerator generator = new WordGenerator();

    public Word getWord() {
        return generator.next();
    }

}
