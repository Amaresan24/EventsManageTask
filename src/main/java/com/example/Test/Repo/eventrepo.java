package com.example.Test.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Test.Entity.EventsList;


public interface eventrepo  extends  JpaRepository<EventsList, Integer> {

}

