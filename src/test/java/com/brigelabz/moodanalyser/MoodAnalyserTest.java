package com.brigelabz.moodanalyser;

import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad Message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);

    }
    @Test
    public void givenMessage_WhenNoSad_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");


        String mood = moodAnalyser.analyseMood();
        Assert.assertNotEquals("SAD", mood);

    }
    @Test
    public void givenNullMood_ShouldThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {

            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenEmptyMood_ShouldThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {

            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}