package io.springboot2.x.nftinitialsetup.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.springboot2.x.nftinitialsetup.domain.Message;

public interface IMessageService {
	
	List<Message> readAllMessages();
	boolean sentMsg(@RequestBody Message msg);

}  
