package com.brigelabz.moodanalyser;

public class MoodAnalyser {
    String message;

    MoodAnalyser() {

    }

    MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(){

        try {
            if (message.length() == 0){
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter a proper message");
            }
            if (message.toLowerCase().contains("sad")) {

                return "SAD";
            } else {

                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL, "Please enter a proper message");
        }
    }
}
