package ch.ms.repository;

import ch.ms.model.Angestellter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AngestellterRepository extends JpaRepository<Angestellter, Integer> {
}
