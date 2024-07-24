package com.example.Test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "event_details1")
@Entity

public class EventsList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String username;
	private String eventname;
	private String message;
	private String createAt;

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEventname() {
		return eventname;
	}

	public String getMessage() {
		return message;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

}
