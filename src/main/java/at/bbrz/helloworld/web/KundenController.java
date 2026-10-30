package at.bbrz.helloworld.web;

import at.bbrz.helloworld.model.Adresse;
import at.bbrz.helloworld.model.Kunde;
import at.bbrz.helloworld.service.KundenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KundenController {
    @Autowired
    private KundenService kunden;

    @GetMapping("/kunde")
    public Kunde ich() {
        Kunde kunde = new Kunde("ich", "Maier", 33, new Adresse("LiebeGasse", "3030", "Dort", "5a", "Österreich"));

        return kunde;
    }

    @GetMapping("/kunden")
    public List<Kunde> kunden() {
        return kunden.getKunden();
    }

    @GetMapping("/add")
    public Kunde addKunde(@RequestParam("vorname")  String vorname, @RequestParam("nachname") String nachname) {
        Adresse adresse = new Adresse("Gartenstraße", "5020", "Salzburg", "8a", "Österreich");

        Kunde neuerKunde = new Kunde(vorname, nachname, 34, adresse);
        kunden.getKunden().add(neuerKunde);

        return neuerKunde;
    }
}
