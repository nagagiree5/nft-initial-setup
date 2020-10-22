package io.springboot2.x.nftinitialsetup.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "NFT_MESSAGE")
@Entity
public class Message {
private String message;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer msgId;
private String byWho;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Integer getMsgId() {
	return msgId;
}
public void setMsgId(Integer msgId) {
	this.msgId = msgId;
}
public String getByWho() {
	return byWho;
}
public void setByWho(String byWho) {
	this.byWho = byWho;
}

}
