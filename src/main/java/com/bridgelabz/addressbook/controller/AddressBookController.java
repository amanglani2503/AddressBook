package com.bridgelabz.addressbook.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @GetMapping("/test")
    public String testEndpoint(){
        return "Address Book App started successfully !!";
    }
}
