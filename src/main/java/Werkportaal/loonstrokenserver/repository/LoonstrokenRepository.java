package Werkportaal.loonstrokenserver.repository;

import Werkportaal.loonstrokenserver.model.Loonstroken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoonstrokenRepository extends JpaRepository<Loonstroken, String> {
}
