package com.autentia.words.friends;

import com.autentia.words.Word;

/**
 * This class is accessible just by Words module and Dictionary module.
 */
public class WordGenerator {

    private int count = 0;

    public Word next() {
        count++;
        return new Word("word " + count);
    }

}
