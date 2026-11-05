package com.osstool.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.osstool.entity.OssTool;
import com.osstool.service.OssToolService;

@RestController
@RequestMapping("/api/tools")
public class OssToolController {

    @Autowired
    private OssToolService service;

    @GetMapping
    public List<OssTool> getAllTools() {
        return service.getAllTools();
    }

    @PostMapping
    public OssTool createTool(@RequestBody Map<String, Object> payload) {
        String name = (String) payload.get("name");
        String category = (String) payload.get("category");
        String description = (String) payload.get("description");
        String author = (String) payload.get("author");
        String license = (String) payload.get("license");
        String version = (String) payload.get("version");
        String repoUrl = (String) payload.get("repoUrl");
        Integer stars = payload.get("stars") != null ? Integer.parseInt(payload.get("stars").toString()) : 0;
        return service.createTool(name, category, description, author, license, version, repoUrl, stars);
    }

    @GetMapping("/{id}")
    public OssTool getToolById(@PathVariable Long id) {
        return service.getToolById(id);
    }

    @GetMapping("/category/{category}")
    public List<OssTool> getByCategory(@PathVariable String category) {
        return service.getToolsByCategory(category);
    }

    @GetMapping("/author/{author}")
    public List<OssTool> getByAuthor(@PathVariable String author) {
        return service.getToolsByAuthor(author);
    }

    @GetMapping("/license/{license}")
    public List<OssTool> getByLicense(@PathVariable String license) {
        return service.getToolsByLicense(license);
    }

    @GetMapping("/hybrid")
    public List<OssTool> getHybrid(@RequestParam(required = false) String category, @RequestParam(required = false) String author) {
        return service.getHybridTools(category, author);
    }

    @GetMapping("/search")
    public List<OssTool> search(@RequestParam String q) {
        return service.searchTools(q);
    }

    @GetMapping("/count")
    public Map<String, Long> count() {
        return Map.of("count", service.getCount());
    }

    @GetMapping("/info")
    public Map<String, String> info() {
        return Map.of("info", service.getInfo());
    }

    @GetMapping("/top")
    public List<OssTool> topStarred() {
        return service.getTopStarred();
    }
}