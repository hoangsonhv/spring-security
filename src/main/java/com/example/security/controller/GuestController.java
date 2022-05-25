package com.example.security.controller;

import com.example.security.entity.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/guests")
public class GuestController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Hello Guest!";
    }

    public ResponseEntity<Account> register(@RequestBody Account account){
        return null;
    }
}
