package ch.ms.repository;

import ch.ms.model.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KundeRepository extends JpaRepository<Kunde, Integer> {
}
