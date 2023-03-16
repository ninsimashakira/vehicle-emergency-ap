package com.example.vehicleemergencyap;

import java.util.List;

public class OpenAIResponse {
    // Define a private variable for a list of OpenAIChoice objects
    private List<OpenAIChoice> choices;

    // Define a method to get the list of OpenAIChoice objects
    public List<OpenAIChoice> getChoices() {
        return choices;
    }

    // Define a method to set the list of OpenAIChoice objects
    public void setChoices(List<OpenAIChoice> choices) {
        this.choices = choices;
    }
}
