package werkportaal.loonstrokenServer;

import werkportaal.loonstrokenServer.repository.LoonstrokenRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = LoonstrokenRepository.class)
public class LoonstrokenServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoonstrokenServerApplication.class, args);
	}
}
