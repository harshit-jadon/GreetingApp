package com.springboot.greetingapp.service;

import com.springboot.greetingapp.model.Greeting;
import com.springboot.greetingapp.model.User;

import java.util.List;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);

    List<Greeting> getAll();
    Greeting deleteGreeting(long id);
}
