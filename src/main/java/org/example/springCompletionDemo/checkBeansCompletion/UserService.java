package org.example.springCompletionDemo.checkBeansCompletion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Value("${user.name:user}") String username;

    public String getUsername() {
        return username;
    }
}
