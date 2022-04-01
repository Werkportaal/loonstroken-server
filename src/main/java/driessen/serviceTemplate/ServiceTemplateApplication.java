package driessen.serviceTemplate;

import driessen.serviceTemplate.repository.TemplateRepository;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = TemplateRepository.class)
public class ServiceTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTemplateApplication.class, args);
	}

	// This is so that SimpleMessageConverter only String, byte[] and Serializable payloads supports.
	@Bean
	public Jackson2JsonMessageConverter jsonConverter() {
		return new Jackson2JsonMessageConverter();
	}

}
