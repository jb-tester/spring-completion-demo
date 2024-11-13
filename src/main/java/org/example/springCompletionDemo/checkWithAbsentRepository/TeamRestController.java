package org.example.springCompletionDemo.checkWithAbsentRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamRestController {

    @GetMapping("/test")
    public List<Team> test() {
        return null;
    }
}
