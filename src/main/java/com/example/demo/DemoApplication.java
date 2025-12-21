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

    // ✅ Used by TESTS (servlet at /)
    @Bean
    @Profile("!dev")
    public ServletRegistrationBean<SimpleStatusServlet> simpleStatusServlet() {
        return new ServletRegistrationBean<>(
                new SimpleStatusServlet(),
                "/"
        );
    }

    // ✅ Used in DEV (Swagger safe)
    @Bean
    @Profile("dev")
    public ServletRegistrationBean<SimpleStatusServlet> devSimpleStatusServlet() {
        return new ServletRegistrationBean<>(
                new SimpleStatusServlet(),
                "/simple-status"
        );
    }
}
