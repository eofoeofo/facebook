package com.koreait.facebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacebookApplication {

    // 여기의 main을 실행하면 자동으로 tomcat이 실행된다.
    public static void main(String[] args) {

        SpringApplication.run(FacebookApplication.class, args);
    }

}
