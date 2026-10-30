package at.bbrz.helloworld.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        String output = "Hello World!\n<br>";
        for (int i = 0; i < 100; i++) {
            output = output + i+"\n<br>";

        }
        return output;
    }

    @GetMapping("/du")
    public String du() {
        return "Hallo Du!";
    }
}
