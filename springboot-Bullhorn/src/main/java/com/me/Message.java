package com.me;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Message {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@NotNull
	@Size(max=200)
	private String content;
	
	@NotNull
	@Size(min=10, max=10)
	private String postdate;
	
	@NotNull
	@Size(min=3)
	private String sentby;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPostdate() {
		return postdate;
	}

	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}

	public String getSentby() {
		return sentby;
	}

	public void setSentby(String sentby) {
		this.sentby = sentby;
	}

}
