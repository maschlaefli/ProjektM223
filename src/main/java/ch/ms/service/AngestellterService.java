package ch.ms.service;

import ch.ms.model.Kunde;
import ch.ms.repository.AngestellterRepository;
import ch.ms.repository.KundeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AngestellterService {

    private KundeRepository kundeRepository;
    private AngestellterRepository angestellterRepository;

    public AngestellterService(KundeRepository kundeRepository, AngestellterRepository angestellterRepository){
        this.kundeRepository = kundeRepository;
        this.angestellterRepository = angestellterRepository;
    }

    public void createKunde(Kunde newKunde){
        kundeRepository.save(newKunde);
    }

    public Optional<Kunde> getKunde(int id){
        return kundeRepository.findById(id);
    }

    public List<Kunde> getKunden(){
        return kundeRepository.findAll();
    }

    public void deleteKunde(int id){
        kundeRepository.deleteById(id);
    }
}
