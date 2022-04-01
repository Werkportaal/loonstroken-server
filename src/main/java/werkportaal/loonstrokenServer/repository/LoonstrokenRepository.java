package werkportaal.loonstrokenServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import werkportaal.loonstrokenServer.model.Loonstroken;

public interface LoonstrokenRepository extends JpaRepository<Loonstroken, String> {
}
