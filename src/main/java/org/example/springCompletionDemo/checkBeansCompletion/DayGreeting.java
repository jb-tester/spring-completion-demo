package org.example.springCompletionDemo.checkBeansCompletion;

@org.springframework.stereotype.Service
class DayGreeting implements GreetingService {


    @Override
    public String getGreetingMessage() {
        return "Hello";
    }
}


    