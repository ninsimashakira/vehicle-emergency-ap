package com.example.vehicleemergencyap;

public class OpenAIChoice {
    // Define private variables for the text and score of a choice
    private String text;
    private double score;

    // Define a method to get the text of the choice
    public String getText() {
        return text;
    }

    // Define a method to set the text of the choice
    public void setText(String text) {
        this.text = text;
    }

    // Define a method to get the score of the choice
    public double getScore() {
        return score;
    }

    // Define a method to set the score of the choice
    public void setScore(double score) {
        this.score = score;
    }
}
