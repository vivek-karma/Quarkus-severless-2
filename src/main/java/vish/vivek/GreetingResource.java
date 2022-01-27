package vish.vivek;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingResource {

    @PostMapping("/")
    public String getFeedback(@RequestBody Feedback feedback) {
        return "Thanks for submitting feedback!";
    }
}