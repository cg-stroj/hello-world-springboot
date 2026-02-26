package com.cgstroj.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloMessageServiceTest {

    private final HelloMessageService helloMessageService = new HelloMessageService();

    @Test
    void shouldReturnHelloWorldMessage() {
        assertEquals("Hello World", helloMessageService.message());
    }
}
