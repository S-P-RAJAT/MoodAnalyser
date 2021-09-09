package com.brigelabz.moodanalyser;

import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad Message");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_WhenNoSad_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertNotEquals("SAD", mood);
    }
}