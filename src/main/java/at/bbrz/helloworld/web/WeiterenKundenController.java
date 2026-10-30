package at.bbrz.helloworld.web;

import at.bbrz.helloworld.model.Kunde;
import at.bbrz.helloworld.service.DummyService;
import at.bbrz.helloworld.service.KundenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WeiterenKundenController {
    private KundenService kunden;

    @Autowired
    private DummyService dummy;

    @Autowired
    public WeiterenKundenController(KundenService kunden) {
        this.kunden = kunden;
    }

    @GetMapping("/weitererKunde")
    public Kunde weitererKunde() {
            return kunden.getKunden().get(0);
    }
}
