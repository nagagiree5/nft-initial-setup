package io.springboot2.x.nftinitialsetup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.springboot2.x.nftinitialsetup.domain.Message;
import io.springboot2.x.nftinitialsetup.repository.MessageRepository;

@SpringBootApplication
@RestController
public class NftInitialSetupApplication {
	@Autowired
	private MessageRepository repo;
	

	public static void main(String[] args) {
		SpringApplication.run(NftInitialSetupApplication.class, args);
	}

	@GetMapping("/")
	ResponseEntity<List<Message>> readAllMessages(){
		return new ResponseEntity<List<Message>>(repo.findAll(),HttpStatus.OK);
	}
	@PostMapping("/sentMsg")
	boolean sentMsg(@RequestBody Message msg) {
		repo.save(msg);
		return true;
	}
}
