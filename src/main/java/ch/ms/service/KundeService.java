package ch.ms.service;

import ch.ms.model.Kunde;
import ch.ms.repository.AdresseRepository;
import ch.ms.repository.FirmaRepository;
import ch.ms.repository.KundeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KundeService {

    private KundeRepository kundeRepository;
    private FirmaRepository firmaRepository;
    private AdresseRepository adresseRepository;

    public KundeService(KundeRepository kundeRepository, FirmaRepository firmaRepository, AdresseRepository adresseRepository){
        this.kundeRepository = kundeRepository;
        this.firmaRepository = firmaRepository;
        this.adresseRepository = adresseRepository;
    }

    public Optional<Kunde> getKunde(int id){
        return kundeRepository.findById(id);
    }

    public void updateKunde(Kunde kunde){
        kundeRepository.save(kunde);
    }
}
