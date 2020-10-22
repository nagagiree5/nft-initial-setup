package io.springboot2.x.nftinitialsetup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springboot2.x.nftinitialsetup.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
