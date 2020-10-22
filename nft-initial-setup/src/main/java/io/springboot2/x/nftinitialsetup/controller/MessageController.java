package io.springboot2.x.nftinitialsetup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.springboot2.x.nftinitialsetup.domain.Message;
import io.springboot2.x.nftinitialsetup.service.IMessageService;

@RestController
public class MessageController {

	@Autowired
	private IMessageService service;
	
	@GetMapping("/")
	ResponseEntity<List<Message>> readAllMessages(){
		return new ResponseEntity<List<Message>>(service.readAllMessages(),HttpStatus.OK);
	}
	@PostMapping("/sentMsg")
	boolean sentMsg(@RequestBody Message msg) {
		return service.sentMsg(msg);
	}
}
