package com.springboot.greetingapp.service;

import com.springboot.greetingapp.model.Greeting;
import com.springboot.greetingapp.model.User;
import com.springboot.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GreetingService implements IGreetingService{

    private static final String template = "Hello, %s!";

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template,user.toString().isEmpty()?"Hello World":user.toString());
        return greetingRepository.save(new Greeting(message));
    }

    @Override
    public Greeting getGreetingById(long id) {
        return greetingRepository.findById(id).get();

    }
    @Override
    public List<Greeting> getAll() {
        return greetingRepository.findAll();
    }
}
