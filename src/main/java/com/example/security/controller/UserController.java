package com.example.security.controller;

import com.example.security.entity.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {
    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Hello User";
    }

    public ResponseEntity<Account> register(@RequestBody Account account){
        return null;
    }
}
