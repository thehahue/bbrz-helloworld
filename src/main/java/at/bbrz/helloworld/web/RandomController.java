package at.bbrz.helloworld.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController
@RequestMapping("/api")
public class RandomController {
    private final SecureRandom random = new SecureRandom();

    @GetMapping("/random")
    public int[] random() {
        return random.ints(10, 0, 100)
                .toArray();
    }
}
