package org.example.springCompletionDemo.checkBeansCompletion;

import org.springframework.stereotype.Service;

@Service
class MorningGreeting implements Greeting {



    @Override
    public String getGreetingMessage() {
        return "Good morning";
    }
}


    