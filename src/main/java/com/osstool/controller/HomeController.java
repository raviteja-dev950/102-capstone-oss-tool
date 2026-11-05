package com.osstool.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("project", "102 Capstone OSS Tool");
        response.put("status", "Live Tier 10 SCALE 102/102 100%");
        response.put("tier", "Tier 10 System Design Level");
        response.put("progress", "102/102 100%");
        response.put("features", new String[] {
            "Caffeine 1000 max 600s Stats recordStats",
            "Security Headers nosniff DENY XSS",
            "Builder Pattern OssTool.Builder Fluent API",
            "Strategy Pattern Category vs Author vs License vs Hybrid sorted timestamp",
            "Repository Pattern JpaRepository",
            "H2 Database ossdb",
            "viewCount Added + idx_category + idx_author",
            "JUnit 5 6/6 Green",
            "Mockito Mocked Repo"
        });
        response.put("endpoints", 12);
        response.put("liveUrl", "https://102-capstone-oss-tool.onrender.com");
        response.put("githubGoal", "Add CONTRIBUTING.md, issues, release tags");
        return response;
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("database", "ossdb");
        response.put("cache", "Caffeine 1000 max 600s Stats recordStats enabled");
        response.put("security", "nosniff DENY XSS");
        return response;
    }
}