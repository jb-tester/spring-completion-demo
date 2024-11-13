package org.example.springCompletionDemo.checkBeansCompletion;

import org.springframework.stereotype.Service;

@Service
class EveningGreeting implements Greeting {


    @Override
    public String getGreetingMessage() {
        return "Good night";
    }
}


    