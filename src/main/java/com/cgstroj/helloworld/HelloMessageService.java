package com.cgstroj.helloworld;

import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

    public String message() {
        return "Hello World";
    }
}
