package com.springboot.greetingapp.model;


import javax.persistence.*;

@Entity
@Table(name="GREETINGS")
public class Greeting {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
     long id;
     String content;

    public Greeting() {
       id=0;
       content="";
    }

    public Greeting(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
