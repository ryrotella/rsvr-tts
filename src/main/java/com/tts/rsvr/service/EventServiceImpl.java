package com.tts.rsvr.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.rsvr.model.Event;
import com.tts.rsvr.repository.EventRepository;

@Service
public class EventServiceImpl implements EventServiceInt {

	@Autowired
	private EventRepository eventRepository;
	
	@Override
	public List<Event> findAll() {
		return eventRepository.findAll();
	}
	
	@Override
	public Event findEventById(Long id) {
		return eventRepository.findEventById(id);
	}
	
	@Override
	public Event saveEvent(Event event) {
		return eventRepository.save(event);
	}
	
	@Override
	public Event updateEvent(Long id, Event eventFromForm) {
		Event eventFromDb = findEventById(id);
		
		//userFromDb.setName(userFromForm.getName());
		//userFromDb.setLocation(userFromForm.getLocation());
		
		BeanUtils.copyProperties(eventFromForm, eventFromDb);
		return eventRepository.save(eventFromDb);
	}
	
	@Override
	public void deleteEventById(Long id) {
		eventRepository.deleteById(id);
		
	}

	
}
