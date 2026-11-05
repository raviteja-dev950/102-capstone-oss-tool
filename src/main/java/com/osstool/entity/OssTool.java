package com.osstool.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "oss_tools")
public class OssTool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String description;

    private String author;
    private String license;
    private String version;
    private String repoUrl;
    private Integer stars;
    private Integer viewCount;
    private LocalDateTime timestamp;
    private String dataValue;

    public OssTool() {
    }

    // Builder Pattern - same as Project 100 AuditLog.Builder and 101 Subscription.Builder
    public static class Builder {
        private String name;
        private String category;
        private String description;
        private String author;
        private String license;
        private String version;
        private String repoUrl;
        private Integer stars;
        private Integer viewCount = 0;
        private String dataValue;

        public Builder name(String name) {
            this.name = name != null ? name.trim() : null;
            return this;
        }

        public Builder category(String category) {
            this.category = category != null ? category.trim() : null;
            return this;
        }

        public Builder description(String description) {
            this.description = description != null ? description.trim() : null;
            return this;
        }

        public Builder author(String author) {
            this.author = author != null ? author.trim() : null;
            return this;
        }

        public Builder license(String license) {
            this.license = license != null ? license.trim() : null;
            return this;
        }

        public Builder version(String version) {
            this.version = version != null ? version.trim() : null;
            return this;
        }

        public Builder repoUrl(String repoUrl) {
            this.repoUrl = repoUrl != null ? repoUrl.trim() : null;
            return this;
        }

        public Builder stars(Integer stars) {
            this.stars = stars;
            return this;
        }

        public Builder viewCount(Integer viewCount) {
            this.viewCount = viewCount;
            return this;
        }

        public Builder dataValue(String dataValue) {
            this.dataValue = dataValue != null ? dataValue.trim() : null;
            return this;
        }

        public OssTool build() {
            OssTool tool = new OssTool();
            tool.name = this.name;
            tool.category = this.category;
            tool.description = this.description;
            tool.author = this.author;
            tool.license = this.license;
            tool.version = this.version;
            tool.repoUrl = this.repoUrl;
            tool.stars = this.stars;
            tool.viewCount = this.viewCount;
            tool.dataValue = this.dataValue;
            return tool;
        }
    }

    @PrePersist
    protected void onCreate() {
        if (timestamp == null) {
            timestamp = LocalDateTime.now();
        }
        if (viewCount == null) {
            viewCount = 0;
        }
        // CRITICAL trim() fix like Project 99 isolated [] -> 1 item and Project 100 Resource 1 FIXED
        if (name != null) name = name.trim();
        if (category != null) category = category.trim();
        if (description != null) description = description.trim();
        if (author != null) author = author.trim();
        if (license != null) license = license.trim();
        if (version != null) version = version.trim();
        if (repoUrl != null) repoUrl = repoUrl.trim();
        if (dataValue != null) dataValue = dataValue.trim();
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name != null ? name.trim() : null; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category != null ? category.trim() : null; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description != null ? description.trim() : null; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getLicense() { return license; }
    public void setLicense(String license) { this.license = license; }
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
    public String getRepoUrl() { return repoUrl; }
    public void setRepoUrl(String repoUrl) { this.repoUrl = repoUrl; }
    public Integer getStars() { return stars; }
    public void setStars(Integer stars) { this.stars = stars; }
    public Integer getViewCount() { return viewCount; }
    public void setViewCount(Integer viewCount) { this.viewCount = viewCount; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
    public String getDataValue() { return dataValue; }
    public void setDataValue(String dataValue) { this.dataValue = dataValue; }
}