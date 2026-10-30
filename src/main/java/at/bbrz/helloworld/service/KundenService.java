package at.bbrz.helloworld.service;

import at.bbrz.helloworld.model.Adresse;
import at.bbrz.helloworld.model.Kunde;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KundenService {
    private List<Kunde> kunden;

    public KundenService() {
        kunden = new ArrayList<>();
        kunden.add(new Kunde("Anna", "Maier", 33,
                new Adresse("Hauptstraße", "1010", "Wien", "12", "Österreich")));
        kunden.add(new Kunde("Max", "Müller", 28,
                new Adresse("Bahnhofstraße", "4020", "Linz", "5", "Österreich")));
        kunden.add(new Kunde("Lisa", "Huber", 41,
                new Adresse("Gartenstraße", "5020", "Salzburg", "8a", "Österreich")));
        kunden.add(new Kunde("Paul", "Schmidt", 22,
                new Adresse("Schulstraße", "8010", "Graz", "3", "Österreich")));
        kunden.add(new Kunde("Emma", "Wagner", 35,
                new Adresse("Bergstraße", "6020", "Innsbruck", "17", "Österreich")));

    }

    public List<Kunde> getKunden() {
        return kunden;
    }
}
