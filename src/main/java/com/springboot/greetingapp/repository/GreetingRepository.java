package com.springboot.greetingapp.repository;

import com.springboot.greetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {

}
