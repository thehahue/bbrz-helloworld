package at.bbrz.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyService {
    @Autowired
    private KundenService kunden;


}
