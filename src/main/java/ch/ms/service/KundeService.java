package ch.ms.service;

import ch.ms.model.Kunde;
import ch.ms.repository.KundeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KundeService {

    private KundeRepository kundeRepository;

    public KundeService(KundeRepository kundeRepository){
        this.kundeRepository = kundeRepository;
    }

    public Optional<Kunde> getKunde(int id){
        return kundeRepository.findById(id);
    }

    public void updateKunde(Kunde kunde){
        kundeRepository.save(kunde);
    }
}
