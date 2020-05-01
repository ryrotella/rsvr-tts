package com.tts.rsvr.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	private String location;
	private Float cost;
	private Date eventDate;
	
	public Event() {}
	
	public Event(String name, String location, Float cost, Date eventDate) {
		//super();
		this.name = name;
		this.location = location;
		this.cost = cost;
		this.eventDate = eventDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Event [name=" + name + ", location=" + location + ", cost=" + cost + ", eventDate=" + eventDate + "]";
	}

	

}
