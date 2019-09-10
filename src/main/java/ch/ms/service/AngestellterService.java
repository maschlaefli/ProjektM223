package ch.ms.service;

import ch.ms.model.Angestellter;
import ch.ms.model.Kunde;
import ch.ms.repository.AdresseRepository;
import ch.ms.repository.AngestellterRepository;
import ch.ms.repository.FirmaRepository;
import ch.ms.repository.KundeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AngestellterService {

    private KundeRepository kundeRepository;
    private AngestellterRepository angestellterRepository;
    private FirmaRepository firmaRepository;
    private AdresseRepository adresseRepository;

    public AngestellterService(KundeRepository kundeRepository, AngestellterRepository angestellterRepository, FirmaRepository firmaRepository, AdresseRepository adresseRepository){
        this.kundeRepository = kundeRepository;
        this.angestellterRepository = angestellterRepository;
        this.firmaRepository = firmaRepository;
        this.adresseRepository = adresseRepository;
    }

    public void createKunde(Kunde newKunde){
        kundeRepository.save(newKunde);
    }

    public List<Kunde> getKunden(){
        return kundeRepository.findAll();
    }

    public Optional<Kunde> getKunde(int id){
        return kundeRepository.findById(id);
    }

    public void deleteKunde(int id){
        kundeRepository.deleteById(id);
    }

    public String validate(Angestellter angestellter){

        List<Angestellter> angestellteListe = angestellterRepository.findAll();

        for(Angestellter value : angestellteListe){
            if(value.getUsername().equals(angestellter.getUsername()) && value.getPassword().equals(angestellter.getPassword())){
                System.out.println("valid");
                return "redirect:/userlist";
            }
        }
        return "redirect:/login";
    }
}
