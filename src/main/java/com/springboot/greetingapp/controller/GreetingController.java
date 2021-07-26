package com.springboot.greetingapp.controller;

import com.springboot.greetingapp.model.Greeting;

import com.springboot.greetingapp.model.User;
import com.springboot.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("")
    public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name){
    User user = new User(name,"harshit");
    return greetingService.addGreeting(user);
    }

}