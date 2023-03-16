package com.example.vehicleemergencyap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface OpenAIInterface {
    // Define headers for the API request
    @Headers({"Content-Type: application/json", "Authorization: Bearer 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"})

    // Define a POST request to the OpenAI API, with the engine and endpoint specified
    @POST("engines/text-davinci-003/completions")
    // we set the model we want to use here eg text-davinci-003

    // Define a method to get a car maintenance tip from the OpenAI API, using an OpenAIRequest object as the request body
    Call<OpenAIResponse> getCarMaintenanceTip(@Body OpenAIRequest request);
}

