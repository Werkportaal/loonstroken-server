package Werkportaal.loonstrokenserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com"})
public class LoonstrokenServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoonstrokenServerApplication.class, args);
	}

}
