package org.example.springCompletionDemo.checkBeansCompletion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Value("${user.name:user}") String username;

    public String getUsername() {
        return username;
    }
}
