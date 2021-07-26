package com.springboot.greetingapp.controller;

import com.springboot.greetingapp.model.Greeting;

import com.springboot.greetingapp.model.User;
import com.springboot.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("")
    public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name){
    User user = new User(name);
    return greetingService.addGreeting(user);
    }
    @GetMapping("/greeting/{id}")
    public Greeting getById(@PathVariable Long id){
        return greetingService.getGreetingById(id);
    }
    @GetMapping("/greetings")
    public List<Greeting> getAllGreetings(){
        return greetingService.getAll();
    }
    @DeleteMapping("/greeting/{id}")
    public Greeting deleteById(@PathVariable Long id){
        return greetingService.deleteGreeting(id);
    }
}