package com.example.Test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test.Dao.eventdao;
import com.example.Test.Entity.EventsList;

@Service
public class eventservice {
	@Autowired
	eventdao ed;

	public String postEvent(EventsList e) {
		// TODO Auto-generated method stub

		return ed.postEvent(e);
	}

	public String postall_events(List<EventsList> a) {
		// TODO Auto-generated method stub
		return ed.postall_events(a);
	}

	public EventsList getEvent_id(int a) {
		// TODO Auto-generated method stub
		return ed.getEvent_id(a);
	}

	public List<EventsList> gettotal_event() {
		// TODO Auto-generated method stub
		return ed.gettotal_event();
	}

	public String updateEvents(EventsList e, int a) {
		// TODO Auto-generated method stub
		
		EventsList val = ed.getEvent_id(a);

		val.setEventname(e.getEventname());
		val.setUsername(e.getUsername());
		val.setDesc(e.getDesc());
		val.setDate(e.getDate());

		ed.updateEvents(val);

		return "Update SuccesFully";

	}

	public String deleteEvent(int a) {
		// TODO Auto-generated method stub
		return ed.deleteEvent(a);
	}

	public List<EventsList> date_event(String a) {
		// TODO Auto-generated method stub
		List<EventsList> li = ed.gettotal_event();

		List<EventsList> events = li.stream().filter(X -> X.getDate().equals(a)).collect(Collectors.toList());

		return events;
	}

	public List<EventsList> create_Event(String a) {
		// TODO Auto-generated method stub
		
		
		List<EventsList> cr = ed.gettotal_event();

		List<EventsList> userDetails = cr.stream().filter(X -> X.getEventname().equals(a)).collect(Collectors.toList());
		return userDetails;
		
		
		
	}

}
