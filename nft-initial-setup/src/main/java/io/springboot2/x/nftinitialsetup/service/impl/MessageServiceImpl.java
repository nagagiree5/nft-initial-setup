package io.springboot2.x.nftinitialsetup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springboot2.x.nftinitialsetup.domain.Message;
import io.springboot2.x.nftinitialsetup.repository.MessageRepository;
import io.springboot2.x.nftinitialsetup.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {

	@Autowired
	private MessageRepository repo;
	@Override
	public List<Message> readAllMessages() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean sentMsg(Message msg) {
		// TODO Auto-generated method stub
		repo.save(msg);
		return true;
	}

}
