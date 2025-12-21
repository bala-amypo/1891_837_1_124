package com.example.demo;

import com.example.demo.servlet.SimpleStatusServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // ✅ TEST MODE → servlet at /
    @Bean
    @Profile("!dev")
    public ServletRegistrationBean<SimpleStatusServlet> testServlet() {
        return new ServletRegistrationBean<>(new SimpleStatusServlet(), "/");
    }

    // ✅ DEV MODE → servlet NOT at /
    @Bean
    @Profile("dev")
    public ServletRegistrationBean<SimpleStatusServlet> devServlet() {
        return new ServletRegistrationBean<>(new SimpleStatusServlet(), "/simple-status");
    }
}
