package com.seileen.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.seileen.springbootbackend.model.Phone;
import com.seileen.springbootbackend.model.User;
import com.seileen.springbootbackend.repository.PhoneRepository;
import com.seileen.springbootbackend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PhoneRepository phoneRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User ("Mana", "Sama", "manasama@gmail.com"));
		this.userRepository.save(new User ("Gackt", "Kamui", "gackt_kamui69@gmail.com"));
		this.userRepository.save(new User ("Klaha", "Desaparecido", "whereami@gmail.com"));

		this.phoneRepository.save(new Phone ("IPhone 13 pro max", 1399.99, "Un nuovo, sorprendente salto di qualità per le fotocamere.  Un display così reattivo che anche i gesti di sempre ti stupiranno."));
		this.phoneRepository.save(new Phone ("Samsung Galaxy Z Flip3", 1250.00, "Se pensi che abbiamo rivoluzionato il concetto di smatphone, allora hai proprio ragione. Adesso tutto questo è realtà."));
	}
	
	

}
