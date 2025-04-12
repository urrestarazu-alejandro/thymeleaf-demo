package com.thymeleaf.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTest {

    @Test
    void applicationStartsSuccessfully() {
        String[] args = {};
        Application.main(args);
        assertThat(true).isTrue(); // Ensures no exceptions are thrown during startup
    }
}