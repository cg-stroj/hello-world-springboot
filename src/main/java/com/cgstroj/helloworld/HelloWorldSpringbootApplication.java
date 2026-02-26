package com.cgstroj.helloworld;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldSpringbootApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloWorldSpringbootApplication.class)
                .web(WebApplicationType.NONE)
                .logStartupInfo(false)
                .properties(
                        "spring.main.banner-mode=off",
                        "logging.level.root=OFF"
                )
                .run(args);
    }

    @Bean
    CommandLineRunner printHelloWorld(HelloMessageService helloMessageService) {
        return args -> System.out.println(helloMessageService.message());
    }
}
