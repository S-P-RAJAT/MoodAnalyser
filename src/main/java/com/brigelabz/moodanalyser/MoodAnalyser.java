package com.brigelabz.moodanalyser;

import java.util.Locale;

public class MoodAnalyser {
    String message;

    MoodAnalyser() {

    }

    MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException{

        try {
            if (message.toLowerCase().contains("sad")) {

                return "SAD";
            } else {

                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}