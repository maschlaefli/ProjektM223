package ch.ms.repository;

import ch.ms.model.Firma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirmaRepository extends JpaRepository<Firma, Integer> {
}
