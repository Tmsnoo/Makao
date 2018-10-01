package pl.tmsnoo.makao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import pl.tmsnoo.makao.entity.Card;
import pl.tmsnoo.makao.repository.CardRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(CardRepository repository) {
		return args -> {
			repository.save(new Card());
		};
	}
}
