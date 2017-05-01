#!/bin/sh
java --module-path app/target/app-1.0-SNAPSHOT.jar\
:module-dictionary/target/module-dictionary-1.0-SNAPSHOT.jar\
:module-logging/target/module-logging-1.0-SNAPSHOT.jar\
:module-logging-console/target/module-logging-console-1.0-SNAPSHOT.jar\
:module-words/target/module-words-1.0-SNAPSHOT.jar\
    -m com.autentia.app/com.autentia.tutorial.java9.modules.App
