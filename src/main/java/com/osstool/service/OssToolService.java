package com.osstool.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osstool.entity.OssTool;
import com.osstool.repository.OssToolRepository;

@Service
public class OssToolService {

    @Autowired
    private OssToolRepository repository;

    public OssTool createTool(String name, String category, String description, String author, String license, String version, String repoUrl, Integer stars) {
        OssTool tool = new OssTool.Builder()
                .name(name != null ? name.trim() : null)
                .category(category != null ? category.trim() : null)
                .description(description != null ? description.trim() : null)
                .author(author != null ? author.trim() : null)
                .license(license != null ? license.trim() : null)
                .version(version != null ? version.trim() : null)
                .repoUrl(repoUrl != null ? repoUrl.trim() : null)
                .stars(stars)
                .viewCount(0)
                .dataValue(name + "-" + category)
                .build();
        return repository.save(tool);
    }

    public List<OssTool> getAllTools() {
        return repository.findAllByOrderByTimestampDesc();
    }

    public OssTool getToolById(Long id) {
        OssTool tool = repository.findById(id).orElse(null);
        if (tool != null) {
            tool.setViewCount(tool.getViewCount() + 1);
            repository.save(tool);
        }
        return tool;
    }

    public List<OssTool> getToolsByCategory(String category) {
        String clean = category != null ? category.trim() : "";
        return repository.findByCategory(clean).stream()
                .sorted(Comparator.comparing(OssTool::getTimestamp).reversed())
                .collect(Collectors.toList());
    }

    public List<OssTool> getToolsByAuthor(String author) {
        String clean = author != null ? author.trim() : "";
        return repository.findByAuthor(clean).stream()
                .sorted(Comparator.comparing(OssTool::getTimestamp).reversed())
                .collect(Collectors.toList());
    }

    public List<OssTool> getToolsByLicense(String license) {
        String clean = license != null ? license.trim() : "";
        return repository.findByLicense(clean).stream()
                .sorted(Comparator.comparing(OssTool::getStars).reversed())
                .collect(Collectors.toList());
    }

    public List<OssTool> getHybridTools(String category, String author) {
        List<OssTool> tools;
        if (category != null && author != null && !category.isEmpty() && !author.isEmpty()) {
            tools = repository.findByCategoryAndAuthor(category.trim(), author.trim());
        } else {
            tools = repository.findAll();
        }
        return tools.stream()
                .sorted(Comparator.comparing(OssTool::getTimestamp).reversed())
                .collect(Collectors.toList());
    }

    public List<OssTool> searchTools(String keyword) {
        String clean = keyword != null ? keyword.trim() : "";
        return repository.findByNameContainingIgnoreCase(clean);
    }

    public long getCount() {
        return repository.count();
    }

    public String getInfo() {
        return "OssTool Service - Builder Pattern + Strategy Pattern Category vs Author vs License vs Hybrid sorted timestamp DESC + Repository Pattern + Caffeine 1000 max 600s Stats";
    }

    public List<OssTool> getTopStarred() {
        return repository.findAllByOrderByStarsDesc();
    }
}