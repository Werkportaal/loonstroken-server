package driessen.serviceTemplate.repository;

import driessen.serviceTemplate.model.Template;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateRepository extends JpaRepository<Template, String> {

}
