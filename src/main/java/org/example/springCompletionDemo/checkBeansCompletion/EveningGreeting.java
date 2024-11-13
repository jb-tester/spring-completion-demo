package org.example.springCompletionDemo.checkBeansCompletion;

@org.springframework.stereotype.Service
class EveningGreeting implements GreetingService {


    @Override
    public String getGreetingMessage() {
        return "Good night";
    }
}


    