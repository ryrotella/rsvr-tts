package com.tts.rsvr.service;

import java.util.List;

import com.tts.rsvr.model.Event;

public interface EventServiceInt {
	
	List<Event> findAll();

	Event findEventById(Long id);

	Event saveEvent(Event event);

	Event updateEvent(Long id, Event event);

	void deleteEventById(Long id);

}
