package com.autentia.tutorial.java9.modules;

import com.autentia.dictionary.Dictionary;
import com.autentia.logging.Logger;
import com.autentia.words.Word;

import java.util.ServiceLoader;

public class App {

    private final Logger log = ServiceLoader.load(Logger.class).findFirst().get();
    private final Dictionary dictionary = new Dictionary();

    public static void main(String... args) {
        new App().execute();
    }

    private void execute() {
        final Word word1 = dictionary.getWord();
        final Word word2 = dictionary.getWord();
        final Word word3 = dictionary.getWord();

        log.error(word1.toString());
        log.info(word2.toString());
        log.debug(word3.toString());
    }

}
