package com.example.rest.webservices.restfulwebservices.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWord(){
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorlBean helloWordBean(){
        return new HelloWorlBean("Hello World Bean");
    }

    @GetMapping("/hello-world/name/{name}")
    public ResponseEntity<HelloWorlBean> helloWordBean(@PathVariable String name){
        return new ResponseEntity(new HelloWorlBean("Hello and welcome Mr " + name), HttpStatus.OK);
    }
}
