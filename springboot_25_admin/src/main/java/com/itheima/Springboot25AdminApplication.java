package com.itheima;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class Springboot25AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot25AdminApplication.class, args);
    }

}
