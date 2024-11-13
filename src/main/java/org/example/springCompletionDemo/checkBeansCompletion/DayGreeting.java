package org.example.springCompletionDemo.checkBeansCompletion;

import org.springframework.stereotype.Service;

@Service
class DayGreeting implements Greeting {


    @Override
    public String getGreetingMessage() {
        return "Hello";
    }
}


    