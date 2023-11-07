package com.triangulant.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Test
    public void myFirstTest() {
        assertThat(42).isEqualTo(42);
    }

}
