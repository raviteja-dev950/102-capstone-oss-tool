package com.osstool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CapstoneOssToolApplication {
    public static void main(String[] args) {
        SpringApplication.run(CapstoneOssToolApplication.class, args);
    }
}