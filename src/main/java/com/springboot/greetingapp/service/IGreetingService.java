package com.springboot.greetingapp.service;

import com.springboot.greetingapp.model.Greeting;
import com.springboot.greetingapp.model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
