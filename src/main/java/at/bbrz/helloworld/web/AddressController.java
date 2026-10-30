package at.bbrz.helloworld.web;

import at.bbrz.helloworld.model.Adresse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AddressController {

    @GetMapping("/adresse")
    public Adresse getAddress(@RequestParam("str") String strasse,
                              @RequestParam("hn") String hausnummer,
                              @RequestParam("ort") String ort,
                              @RequestParam("plz") String plz,
                              @RequestParam("land") String land) {

        Adresse neuAdresse = new Adresse(strasse, plz, ort, hausnummer, land);

        return neuAdresse;
    }
}
