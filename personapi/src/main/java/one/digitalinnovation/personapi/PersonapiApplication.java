package one.digitalinnovation.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonapiApplication.class, args);
	}

//    Para Testar em outra porta
//import java.util.Collections;
//	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(PersonapiApplication.class);
//		app.setDefaultProperties(Collections
//				.singletonMap("server.port", "8088"));
//		app.run(args);
//	}
}
