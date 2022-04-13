package werkportaal.loonstrokenServer;

import werkportaal.loonstrokenServer.repository.LoonstrokenRepository;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = LoonstrokenRepository.class)
public class LoonstrokenServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoonstrokenServerApplication.class, args);
	}

	// This is so that SimpleMessageConverter only String, byte[] and Serializable payloads supports.
	@Bean
	public Jackson2JsonMessageConverter jsonConverter() {
		return new Jackson2JsonMessageConverter();
	}

}
