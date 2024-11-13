package org.example.springCompletionDemo.checkBeansCompletion;

@org.springframework.stereotype.Service
class MorningGreeting implements GreetingService {



    @Override
    public String getGreetingMessage() {
        return "Good morning";
    }
}


    