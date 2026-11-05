# 🚀 Project 102 – Capstone OSS Tool (Your OSS Tool Idea) | System Design Level | Full Stack DevOps | FINAL

[Java 17](https://img.shields.io/badge/Java-17-E76F00?logo=openjdk&logoColor=white)
[Spring Boot 3.2.5](https://img.shields.io/badge/Spring%20Boot-3.2.5-6DB33F?logo=springboot&logoColor=white)
[Caching](https://img.shields.io/badge/Caching-Caffeine%201000%20max%20600s%20expire%20Stats-blue?logo=redis&logoColor=white)
[Cache Stats](https://img.shields.io/badge/Cache%20Stats-recordStats%20enabled-brightgreen)
[Security](https://img.shields.io/badge/Security-Headers%20nosniff%20DENY%20XSS-red?logo=springsecurity&logoColor=white)
[Builder Pattern](https://img.shields.io/badge/Builder%20Pattern-OssTool.Builder%20Fluent%20API-success?logo=java&logoColor=white)
[Strategy Pattern](https://img.shields.io/badge/Strategy%20Pattern-Category%20vs%20Author%20vs%20License%20vs%20Hybrid-yellow?logo=elasticsearch&logoColor=white)
[Repository Pattern](https://img.shields.io/badge/Repository%20Pattern-JpaRepository-6DB33F)
[H2 Database](https://img.shields.io/badge/H2-Database%20ossdb-003545?logo=h2&logoColor=white)
[viewCount](https://img.shields.io/badge/viewCount-Added%20%2B%20idx__category%20%2B%20idx__author-orange)
[JUnit 5](https://img.shields.io/badge/JUnit-5%206%2F6%20Green-25A162?logo=junit5&logoColor=white)
[Mockito](https://img.shields.io/badge/Mockito-Mocked%20Repo%20when%2Fverify-00BFFF)
[OSS Pattern](https://img.shields.io/badge/OSS-Pattern%20Category%20Author%20License%20Hybrid-blueviolet?logo=elasticsearch&logoColor=white)
[Docker](https://img.shields.io/badge/Docker-Multi--Stage-2496ED?logo=docker&logoColor=white)
[Render](https://img.shields.io/badge/Render-Live%203m50s-brightgreen?logo=render&logoColor=white)
[Tomcat](https://img.shields.io/badge/Apache%20Tomcat-10.1.20-D4AF00?logo=apachetomcat&logoColor=white)
[Port](https://img.shields.io/badge/Port-8104-00BFFF)
[Status](https://img.shields.io/badge/Status-Capstone%20OSS%20Tool%20Live%20Tier%2010-brightgreen)
[Tier 10](https://img.shields.io/badge/Tier%2010-System%20Design%20Level%20SCALE%20FINAL-blueviolet)

**Live URL:** https://one02-capstone-oss-tool.onrender.com/

[[Live](https://img.shields.io/badge/Live-Render-brightgreen?style=for-the-badge&logo=render)](https://one02-capstone-oss-tool.onrender.com)

Project 102 - Part of Java 102 Projects Challenge - System Design Level Tier 10 SCALE - Capstone OSS Tool - Your OSS Tool Idea - FINAL PROJECT 102/102 100%

---
**TIER 10 SCALE 102/102 - 100% - FINAL**
---

# 📖 Project Overview

**Capstone OSS Tool (Your OSS Tool Idea)** is Project 102 of **Tier 10 – System Design Level – SCALE PROJECT – FINAL CAPSTONE**, developed using **Java 17**, **Spring Boot 3.2.5**, **Spring Cache Caffeine (CaffeineCacheManager maximumSize=1000 expireAfterAccess=600s recordStats() - Redis pattern ready)**, **Security Headers (SecurityHeadersConfig WebMvcConfigurer + HandlerInterceptor X-Content-Type-Options nosniff + X-Frame-Options DENY + X-XSS-Protection)**, **Design Patterns (Builder Pattern OssTool.Builder Fluent API + Strategy Pattern Category vs Author vs License vs Hybrid + Repository Pattern JpaRepository + Caching Pattern Cache-aside)**, **Spring Data JPA**, **H2 Database ossdb + view_count + idx_category + idx_author index**, **JUnit 5 + Mockito 6 tests Green Bar**, **Docker Multi-Stage (maven:3.9-eclipse-temurin-17 + eclipse-temurin:17-jdk-alpine + mkdir -p data)**, **Maven**, and **Apache Tomcat 10.1.20** in a **production System Design ready repo**.

Spring Boot REST API running on port 8104 locally (10000 on Render) with 12 endpoints + home `GET / returns live JSON {"project":"102-capstone-oss-tool","status":"Live - Capstone OSS Tool - Tier 10 Scale FINAL","tier":"10 - System Design Level - Caching + Security + Testing + Design Patterns - FINAL","caching":"Caffeine Cache - tools cache - 1000 max, 600s expire - Stats enabled - Redis ready","oss":"OSS Pattern - Category Author License Hybrid"}`, `GET /health -> {"status":"UP","cache":"Active - Caffeine - tools, tool - Stats enabled","security":"Headers Active","oss":"Active - OSS Pattern - Category Author License Hybrid - Strategy Pattern"}`, `POST /api/tools?category=DevTool&name=Lombok&description=Java annotation library&author=ProjectLombok&license=MIT&version=1.18.30&repoUrl=https://github.com/projectlombok/lombok&stars=13000&dataValue=Lombok-DevTool -> 200 OK {id, name, category, author, license, stars, timestamp, dataValue}`, `GET /api/tools -> List OssTool with viewCount + X-Cache: Caffeine`, `GET /api/tools/category/DevTool -> Category-Strategy count 1 + category DevTool`, `GET /api/tools/author/ben-manes -> Author-Strategy count 1 + author ben-manes`, `GET /api/tools/license/MIT -> License-Strategy count 1 FIXED from [] empty -> trim() fix + MIT with %20MIT proof`, `GET /api/tools/hybrid?category=Cache&author=ben-manes -> Hybrid-Strategy count 1 Caffeine + sorted timestamp DESC + X-Strategy: Hybrid-Strategy`. This repo contains **OssTool.java Entity with Builder inner class**, **OssToolRepository.java**, **OssToolService.java**, **CacheConfig.java**, **SecurityHeadersConfig.java**, **OssToolController.java**, **OssToolServiceTest (JUnit 5 + Mockito 6 tests Green Bar)**. One `git push` gives full Capstone OSS Tool live - FINAL 102/102 100%.

This is Project 102 of Tier 10 - SCALE - After Subscription SaaS (101), now final Capstone OSS Tool - FINAL.

**Bug Fixed:** `Syntax error in SQL statement "create table oss_tools (... value varchar ...) expected "identifier""` - H2 reserved keyword `value` - Fixed by renaming field to `dataValue` with `@Column(name="data_value")` + backward compat `getValue()/setValue()` alias with `@JsonIgnore` to fix JSON conflict - Same pattern as 97 98 99 100 101 value fix.

**Bug Fixed:** `GET /api/tools/license/MIT returns [] empty but DB has MIT` - Postman Enter adds `%20` space - `license="%20MIT"` URL encoded space - `license=" MIT"` - Filter `"MIT".equals(" MIT")` fails - Fixed by adding `trim()` in `createTool()` `cleanLicense=license.trim()` + `cleanCategory=category.trim()` + `cleanAuthor=author.trim()` + `getToolByStrategy()` `cleanType=type.trim()` + `d.getLicense().trim()` - BUILD SUCCESS 13.37 sec - Now demo license returns 1 item CLEAN not [] - CRITICAL FIX - Same as 99 isolated fix + 100 resource fix count 0->1 + 101 tenant fix count 0->2.

**Bug Fixed:** `Cannot load driver class: org.h2.Driver` - H2 scope runtime - Fixed by removing `<scope>runtime</scope>` + Maven Update Project + Force Update - Same pattern as Tier 9 H2 fix - 94 + 95 + 96 + 97 + 98 + 99 + 100 + 101 also.

**Bug Fixed:** `Unable to resolve name [org.hibernate.dialect.H2Dialect ] as strategy` - Extra newline space in application.properties - Fixed by removing `spring.jpa.database-platform` + `spring.datasource.driverClassName` lines + Fixing `password=update` misaligned - Fixed `spring.jpa.hibernate.ddl-auto=update` - BUILD SUCCESS 13.37 sec - Same as 101 ddl-auto fix.

**Bug Fixed:** `URL must start with 'jdbc'` - Typo `dbc:h2:mem:ossdb` missing `j` - Fixed by correcting to `jdbc:h2:file:./data/ossdb` - BUILD SUCCESS 13.37s Tier 10 + Fixed `Table OSS_TOOLS not found` by adding `ddl-auto=update` - Same as 101 saasdb fix.

**Bug Fixed:** `OssToolController.java red errors - cannot find symbol Cacheable, CaffeineCacheManager` - META-INF folder bug - Eclipse creates `src/main/resources/META-INF` breaking Maven + Maven dependencies not downloaded - Fixed by deleting META-INF + deleting target + Maven Update Project Force Update - Same as 93/94/95/96/97/98/99/100/101 META-INF bug.

**Bug Fixed:** `docker.io/library/openjdk:17-jdk-slim: not found` - OpenJDK image deleted from Docker Hub - Fixed by changing to `eclipse-temurin:17-jdk-alpine` - Render Deploy failed - Same as 94 + 95 + 96 + 97 + 98 + 99 + 100 + 101.

**Bug Fixed:** `COPY target/*.jar app.jar ERROR: lstat /target: no such file or directory` - Docker build doesn't run mvn package - Fixed by using Multi-Stage Dockerfile `FROM maven:3.9-eclipse-temurin-17 AS build + COPY pom.xml + COPY src + RUN mvn clean package -DskipTests + FROM eclipse-temurin:17-jdk-alpine + mkdir -p data + COPY --from=build /app/target/*.jar app.jar` - Deploy succeeded Live 3m50s - Same as 94 + 95 + 96 + 97 + 98 + 99 + 100 + 101.

**Bug Fixed:** `POST /api/tools -> 400 Bad Request` - Used `@RequestParam` with `@RequestBody` conflict - Fixed by changing to `@RequestBody OssTool` or Query Params + Setting Params tab in Postman Key Value category name description author license version repoUrl stars dataValue - Same as 97 98 99 100 101 index bug - Now 200 OK id 1 Lombok 13000 stars - CLEAN without %20.

**Bug Fixed:** `GET /api/tools/license/%20MIT -> [] empty` - Used `equals` without trim but license has space ` MIT` from `%20MIT` - Fixed by adding `trim()` in Service - Same as 99 isolated bug + 100 resource bug + 101 tenant bug - Now 200 OK count 1 License-Strategy MIT - FIXED from [] - YOUR REAL DATA proof.

**Bug Fixed:** `Was 2/2 tests Tier 5 - Not Tier 10 compliant + UnnecessaryStubbingException` - Only Entity + Format tests - No Builder + No Mockito + No Caching + No Security + No CONTRIBUTING.md - Fixed by rebuilding to Tier 10 SCALE - Caffeine 1000 max 600s Stats + Security Headers + Builder Pattern + Strategy Pattern Category vs Author vs License vs Hybrid + Repository + Caching + JUnit5 Mockito 6 tests Green Bar Runs: 6/6 Errors: 0 Failures: 0 Finished after 6.809s (6.200s) + viewCount + idx_category + idx_author + CONTRIBUTING.md 12466 chars + Issues + 18 Badges + Architecture Diagram + Live Link + Docker Multi-Stage + Render Live - Roadmap 100% Compliant - FINAL.

---

# ✨ Features

- Scale Ready status API with JSON response - `{"project":"102-capstone-oss-tool","status":"Live - Capstone OSS Tool - Tier 10 Scale FINAL","tier":"10 - System Design Level - Caching + Security + Testing + Design Patterns - FINAL","caching":"Caffeine Cache - tools cache - 1000 max, 600s expire - Stats enabled - Redis ready","oss":"OSS Pattern - Category Author License Hybrid"}`
- Fully production Capstone OSS Tool API service - 12 endpoints + home + health + tool create + list + category + author + license + hybrid + search + count + info + Live on Render Docker - Deploy succeeded 3m50s - Same as 101 Live 3m50s + 100 Live 3m49s - FINAL
- Caching - System Design core - `CacheConfig.java @Configuration @EnableCaching` + `CaffeineCacheManager maximumSize=1000 expireAfterAccess=600s recordStats()` + `@Cacheable("tools") + @Cacheable("tool") + @CacheEvict(allEntries=true)` + Headers `X-Cache: Caffeine - tools` + `Cache-Control: public max-age=3600` + Redis pattern ready + `recordStats` enabled
- Security Headers - `SecurityHeadersConfig.java @Configuration implements WebMvcConfigurer` + `X-Content-Type-Options: nosniff + X-Frame-Options: DENY + X-XSS-Protection: 1; mode=block` + Validation @NotBlank + license empty check
- Builder Pattern - `OssTool.java` - Inner Builder - `OssTool.Builder name() category() description() author() license() version() repoUrl() stars() viewCount() dataValue() build()` Fluent API - No telescoping constructor - `createTool` uses Builder + CacheEvict + trim() fix
- Strategy Pattern - `OssToolService.getToolByStrategy()` + `OssToolController` - Category vs Author vs License vs Hybrid - `GET /api/tools/category/DevTool -> Category-Strategy count 1 Lombok`, `GET /api/tools/author/ben-manes -> Author-Strategy count 1 Caffeine + stars 15000`, `GET /api/tools/license/MIT -> License-Strategy count 1 FIXED from [] empty -> trim() fix + MIT with %20MIT proof`, `GET /api/tools/hybrid -> Hybrid-Strategy count 4 sorted timestamp DESC 2026-11-05T23:41:51.038208 H2 Database + 23:41:27.083332 Caffeine + 23:41:08.272825 MapStruct + 23:40:46.904102 Lombok + X-Strategy: Hybrid-Strategy` - Core OSS Design - Category Author License
- Repository Pattern - `OssToolRepository.java extends JpaRepository<OssTool, Long>` + `findAllByOrderByTimestampDesc() + findByCategoryOrderByStarsDesc() + findByAuthorContainingIgnoreCase() + findByLicense() + findByCategory + findByAuthor + idx_category + idx_author + viewCount + stars`
- Caching Pattern - `CacheConfig + @Cacheable + @CacheEvict` - Cache-aside - Stats enabled - Redis ready
- OSS Entity - `OssTool id Long + name + category + description + author + license + version + repoUrl + stars + viewCount + timestamp + data_value column fix + @JsonIgnore alias fix + Inner Builder` - H2 ossdb + data_value column fix for reserved keyword value
- Create Logic - `OssToolService.createTool(name, category, description, author, license, version, repoUrl, stars, viewCount, dataValue) -> trim() fix cleanCategory=category.trim() cleanAuthor=author.trim() cleanLicense=license.trim() -> Builder Pattern -> repository.save + CacheEvict + Return OssTool` - Production create - `POST /api/tools?category=DevTool&name=Lombok&description=Java annotation library&author=ProjectLombok&license=MIT&version=1.18.30&repoUrl=https://github.com/projectlombok/lombok&stars=13000&dataValue=Lombok-DevTool -> 200 OK {id:1, name:Lombok, category:DevTool CLEAN without %20, author:ProjectLombok, license:MIT, stars:13000, timestamp: 2026-11-05T23:40:46.904102}`
- OSS Logic - `getToolByStrategy(type, filter) -> cleanType=type.trim().toLowerCase() -> If type category -> filter DevTool returns 1 Lombok -> If author -> filter ben-manes returns 1 Caffeine 15000 stars -> If license -> filter MIT returns 1 Lombok FIXED [] bug -> If hybrid -> sorted by timestamp DESC 4,3,2,1` - Real OSS - `ben-manes` returns 1 tool Caffeine hybrid sorted timestamp DESC H2 Database latest 23:41:51.038208
- H2 Database - `jdbc:h2:file:./data/ossdb FIXED from dbc typo + ddl-auto=update + oss_tools table id name category description author license version repo_url stars view_count timestamp data_value + index idx_category + idx_author + H2Console enabled` - File based
- OSS Pattern - `Category all DevTool count 1 + Author only ben-manes count 1 + License only MIT count 1 FIXED from [] empty + Hybrid sorted by timestamp DESC` - `oss: OSS-Pattern - category author license hybrid + trim() fix + %20MIT proof` - For Final Capstone
- JUnit 5 + Mockito Tests - `OssToolServiceTest` - 6 tests green - `testBuilderPattern() + testOssToolEntity() + testFormatToolInfo() + testGetToolById_Mockito() + testSearchByCategory_Mockito() + testGetAllTools_Mockito()` - Was 2/2 Tier 5 -> Now 6/6 Tier 10 - Finished after 6.809s (6.200s) - trim() verified
- Docker Multi-Stage - `maven:3.9-eclipse-temurin-17 AS build + eclipse-temurin:17-jdk-alpine + mkdir -p data + COPY --from=build /app/target/*.jar app.jar` - Fix for Render COPY error + openjdk not found + data not found - Deploy succeeded Live 3m50s FINAL
- Render Live - `https://one02-capstone-oss-tool.onrender.com` - Tomcat started on port 10000 - Started Application in 89.101s - Your service is live - Deploy succeeded 3m50s - Your service is live - Available at primary URL FINAL
- CONTRIBUTING.md - Added as per Tier 10 GitHub Goal - 12,466 chars - FINAL
- Issues - `.github/ISSUE_TEMPLATE/bug_report.md + feature_request.md` - FINAL
- Architecture Diagram - Caching + Security + Design Patterns + OSS Category Author License Hybrid + trim() fix + %20MIT proof + Docker + Render flow in README - FINAL
- Tomcat initialized with port 8104 local, 10000 on Render - Tier 10 Port 8104 FINAL
- Started Application in 13.37 seconds Local Eclipse Java 21.0.10 - Includes Caching + Security + Builder + Strategy + JPA - 89.101s on Render Docker - FINAL
- Verified with Browser + Postman - `GET / -> Live JSON Tier 10 FINAL + GET /health -> UP cache Active oss Active + POST /api/tools -> 200 OK Builder Pattern CLEAN without %20 + GET /api/tools -> 4 tools viewCount 0 + X-Cache + GET /api/tools/category/DevTool -> Category count 1 + GET /api/tools/author/ben-manes -> Author count 1 + GET /api/tools/license/MIT -> License count 1 FIXED from [] empty %20MIT proof + GET /api/tools/hybrid?category=Cache&author=ben-manes -> Hybrid count 1 Caffeine + GET /api/tools/hybrid -> Hybrid count 4 sorted timestamp DESC + GET /api/tools/search?q=Caffeine -> count 1 + GET /api/tools/count -> 4 + GET /health -> UP` - JUnit green bar 6/6 6.809s (6.200s) - Render Live FINAL
- Public Production Ready - Portfolio ready Capstone OSS Tool API project - Tier 10 SCALE 102/102 - 100% - FINAL PROJECT

---

# 🛠 Technologies Used

- Java 17 (eclipse-temurin:17-jdk-alpine) - Local Java 21.0.10
- Spring Boot 3.2.5 (Banner v3.2.5)
- Spring Web - REST API `@RestController` + `@RequestMapping` + `@GetMapping` + `@PostMapping` + `@RequestParam` + `@PathVariable` + `ResponseEntity` + `HttpHeaders` + `HttpStatus`
- Spring Cache - `spring-boot-starter-cache` + `Caffeine Cache` + `com.github.ben-manes.caffeine:caffeine` + `@EnableCaching` + `CaffeineCacheManager maximumSize=1000 expireAfterAccess=600s recordStats()` + `@Cacheable("tools")` + `@Cacheable("tool")` + `@CacheEvict(allEntries=true)` + X-Cache + Cache-Control + Redis pattern ready + recordStats enabled - `spring.cache.type=caffeine + spring.cache.caffeine.spec=maximumSize=1000,expireAfterAccess=600s,recordStats`
- Security Headers - `SecurityHeadersConfig.java @Configuration implements WebMvcConfigurer` + `HandlerInterceptor` + `X-Content-Type-Options: nosniff + X-Frame-Options: DENY + X-XSS-Protection: 1; mode=block` + Validation @NotBlank + category empty check - Tier 10 Security - FINAL
- Design Patterns - Builder Pattern `OssTool.Builder` Fluent API + Strategy Pattern Category vs Author vs License vs Hybrid `Category-Strategy only DevTool vs Author-Strategy only ben-manes vs License-Strategy only MIT FIXED from [] vs Hybrid-Strategy sorted timestamp DESC 23:41:51.038208,23:41:27.083332,23:41:08.272825,23:40:46.904102` OSS core + Repository Pattern `JpaRepository` + Caching Pattern `CacheConfig + @Cacheable + @CacheEvict Cache-aside`
- Spring Data JPA - `@Entity @Table(name="oss_tools")` + `JpaRepository<OssTool, Long>` + `findAllByOrderByTimestampDesc()` + `findByCategoryOrderByStarsDesc() + findByAuthorContainingIgnoreCase() + findByLicense() + findByCategory + findByAuthor + idx_category + idx_author + view_count + stars + data_value`
- H2 Database - `jdbc:h2:file:./data/ossdb FIXED from dbc typo` + `H2Console enabled /h2-console` + File based + `view_count` + `idx_category` + `idx_author` + `data_value` column fix for reserved keyword `value` + `@JsonIgnore` alias fix - FINAL
- OSS Pattern - `Category all DevTool count 1 + Author only ben-manes count 1 + License only MIT count 1 FIXED + Hybrid sorted timestamp DESC 4,3,2,1` - `oss: OSS-Pattern - category author license hybrid + trim() fix + %20MIT proof` - For Final Capstone
- JUnit 5 + Mockito - `spring-boot-starter-test` - `@ExtendWith(MockitoExtension.class)` + `@Mock OssToolRepository` + `@InjectMocks OssToolService` + `when().thenReturn()` + `verify() times()` + `ByteBuddy agent` - 6 tests green - Finished after 6.809s (6.200s) - Was 2/2 Tier 5 -> Now 6/6 Tier 10 - FINAL
- Docker Multi-Stage - `FROM maven:3.9-eclipse-temurin-17 AS build + RUN mvn clean package -DskipTests + FROM eclipse-temurin:17-jdk-alpine + mkdir -p data + COPY --from=build /app/target/*.jar app.jar` - Fix for Render COPY error + openjdk not found + data not found - Deploy succeeded Live 3m50s FINAL
- Render - Web Service Docker Free Tier - Auto-Deploy on push - Tomcat 10000 - Live https://one02-capstone-oss-tool.onrender.com - Deploy succeeded Live - 3m50s - Your service is live - Available at primary URL - FINAL 102/102 100%
- Maven 3.9+
- Apache Tomcat 10.1.20 (Embedded) - TomcatWebServer port 8104 local, 10000 Render - FINAL
- Postman - For `POST /api/tools 200 OK Builder Pattern CLEAN without %20 + GET /api/tools + X-Cache + GET /api/tools/category/DevTool -> Category count 1 + GET /api/tools/author/ben-manes -> Author count 1 + GET /api/tools/license/MIT -> License count 1 FIXED from [] %20MIT proof + GET /api/tools/hybrid?category=Cache&author=ben-manes -> Hybrid count 1 Caffeine + GET /api/tools/hybrid -> Hybrid count 4 sorted timestamp DESC`
- Browser - Chrome - For home + health + list + oss test + license %20MIT fix verification - FINAL
- Windows 11 - Eclipse IDE + Browser + Postman - FINAL
- GitHub - Issues + Release v1.0.0 + CONTRIBUTING.md 12466 chars + 18 Badges + Architecture Diagram + Live Link + Deployed Link - Tier 10 GitHub Goal - FINAL 102/102 100%

---

---

# 📂 Project Structure - Capstone OSS Tool Repo - FINAL

```text
102-capstone-oss-tool
│
├── .github
│   └── ISSUE_TEMPLATE
│       ├── bug_report.md (Labels bug, Tier 10, System Design, license %20MIT trim fix + data_value + @JsonIgnore + FINAL)
│       └── feature_request.md (Labels enhancement, Tier 10, OSS Category Author License Hybrid FINAL)
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── osstool
│   │   │           ├── OsstoolApplication.java (Main + Tomcat 8104 local 10000 Render + Started 13.37s local 89.101s Render FINAL)
│   │   │           ├── config
│   │   │           │   ├── CacheConfig.java (@Configuration @EnableCaching + CaffeineCacheManager maximumSize=1000 expireAfterAccess=600s recordStats() + Redis pattern ready + recordStats enabled - FINAL)
│   │   │           │   └── SecurityHeadersConfig.java (@Configuration implements WebMvcConfigurer + HandlerInterceptor + nosniff DENY XSS Protection - Tier 10 Security FINAL)
│   │   │           ├── controller
│   │   │           │   ├── HomeController.java (2 endpoints + Home Live JSON Tier 10 FINAL + Health UP cache Active oss Active + ossdb + Live URL one02 - Port 8104 FINAL)
│   │   │           │   └── OssToolController.java (12 endpoints + Create POST Body raw JSON Builder + trim() fix + List GET @Cacheable X-Cache 4 items id 4 H2 Database 4500 stars 23:41:51.038208 + id 3 Caffeine 15000 stars 23:41:27.083332 + id 2 MapStruct 6500 stars 23:41:08.272825 + id 1 Lombok 13000 stars 23:40:46.904102 + Category GET Category-Strategy DevTool count 1 id 1 Lombok + Author GET Author-Strategy ben-manes count 1 id 3 Caffeine 15000 stars 23:41:27.083332 + License GET License-Strategy MIT count 1 id 1 Lombok FIXED from [] empty %20MIT proof + Hybrid GET Hybrid-Strategy category Cache author ben-manes count 1 id 3 Caffeine + Hybrid GET all count 4 sorted timestamp DESC id 4,3,2,1 H2, Caffeine, MapStruct, Lombok + Search q=Caffeine count 1 id 3 + Count GET 4 + Info GET Capstone OSS Tool Tier 10 SCALE FINAL Caching 1000 max + X-Strategy Category vs Author vs License vs Hybrid - Strategy Pattern core - OSS Category Author License FINAL)
│   │   │           ├── model
│   │   │           │   └── OssTool.java (Entity @Table name=oss_tools + id Long + name + category + description + author + license + version + repoUrl + stars + viewCount input 100 output 0 + timestamp + createdAt 2026-11-05T23:40:46.904102 + data_value column fix for reserved keyword value + @JsonIgnore alias fix + Inner Builder class name() category() description() author() license() version() repoUrl() stars() viewCount() dataValue() build() Fluent API - Builder Pattern + trim() fix - FINAL)
│   │   │           ├── repository
│   │   │           │   └── OssToolRepository.java (JpaRepository<OssTool, Long> + findAllByOrderByTimestampDesc + findByCategoryOrderByStarsDesc + findByAuthorContainingIgnoreCase + findByLicense + findByCategory + findByAuthor + idx_category + idx_author - Repository Pattern - OSS pattern ready FINAL)
│   │   │           └── service
│   │   │               └── OssToolService.java (Builder Pattern createTool + trim() fix cleanCategory category.trim() cleanAuthor author.trim() cleanLicense license.trim() + CacheEvict tools tool + viewCount + idx_category + idx_author + Cacheable tools + Cacheable tool + formatToolInfo Category DevTool: Lombok + isRelevant category contains DevTool + Strategy Pattern getToolByStrategy category vs author vs license vs hybrid + trim() fix cleanType + filter author license category trim() FIXED [] bug MIT %20MIT proof count 1 + hybrid sorted timestamp DESC)
│   │   │
│   │   └── resources
│   │       └── application.properties (server.port=${PORT:8104} + datasource jdbc:h2:file:./data/ossdb FIXED from dbc typo + jpa ddl-auto update show-sql true + h2 console enabled + cache type caffeine + caffeine spec maximumSize=1000,expireAfterAccess=600s,recordStats - FINAL)
│   │
│   └── test
│       └── java
│           └── com
│               └── osstool
│                   └── OssToolServiceTest.java (JUnit 5 + Mockito - 6 tests green - Runs: 6/6 Errors: 0 Failures: 0 Green Bar Finished after 6.809 seconds (6.200 s) - Builder Pattern Test Passed: Caffeine + Search Test Passed: Found 1 rec for category DevTool + Mockito Test Passed: getAllTools - Mocked 2 tools + OssTool Entity Test Passed + Mockito Test Passed: getToolById + Format Tool Test Passed: Category DevTool: Lombok - MIT - FIXED [] bug %20MIT proof FINAL)
│
├── screenshots
│   ├── demo1.png (GET / - Home Live JSON - Capstone OSS Tool Tier 10 FINAL - owner Raviteja + security nosniff DENY XSS + designPatterns Builder Strategy Repository Caching + tier 10 FINAL + port 8104 + testing JUnit5 Mockito 6 tests + caching Caffeine 1000 max 600s Stats enabled + oss Category Author License Hybrid + live https://one02-capstone-oss-tool.onrender.com - 05-11-2026 11:41 PM FINAL)
│   ├── demo2.png (GET /health - UP - oss Active OSS Pattern Category Author License Hybrid Strategy Pattern + cache Active Caffeine Stats enabled + security Headers Active + githubGoal CONTRIBUTING.md + database H2 ossdb + securityHeaders nosniff DENY XSS + databaseName ossdb + cacheSpec maximumSize=1000,expireAfterAccess=600s,recordStats - 11:41 PM FINAL)
│   ├── demo3.png (GET /api/tools - [] - Empty list before create - Browser localhost:8104/api/tools Pretty-print - 11:40 PM FINAL)
│   ├── demo4.png (POST /api/tools Body raw JSON name Lombok category DevTool description Java annotation library author ProjectLombok license MIT version 1.18.30 repoUrl https://github.com/projectlombok/lombok stars 13000 dataValue Lombok-DevTool viewCount 100 - 200 OK Time 438ms Size 483B - Returns id 1 name Lombok category DevTool author ProjectLombok license MIT version 1.18.30 repoUrl https://github.com/projectlombok/lombok stars 13000 viewCount 0 timestamp 2026-11-05T23:40:46.904102 dataValue Lombok-DevTool - Builder Pattern CLEAN - 11:40 PM FINAL)
│   ├── demo5.png (POST /api/tools Body raw JSON name MapStruct category CodeGen description Code generator author mapstruct license Apache-2.0 version 1.5.5 repoUrl https://github.com/mapstruct/mapstruct stars 6500 dataValue MapStruct-CodeGen viewCount 50 - 200 OK Time 18ms Size 477B - Returns id 2 name MapStruct category CodeGen author mapstruct license Apache-2.0 version 1.5.5 repoUrl https://github.com/mapstruct/mapstruct stars 6500 viewCount 0 timestamp 2026-11-05T23:41:08.272825 dataValue MapStruct-CodeGen - CLEAN - 11:41 PM FINAL)
│   ├── demo6.png (POST /api/tools Body raw JSON name Caffeine category Cache description High performance cache author ben-manes license Apache-2.0 version 3.1.8 repoUrl https://github.com/ben-manes/caffeine stars 15000 dataValue Caffeine-Cache viewCount 0 - 200 OK Time 17ms Size 488B - Returns id 3 name Caffeine category Cache author ben-manes license Apache-2.0 version 3.1.8 repoUrl https://github.com/ben-manes/caffeine stars 15000 viewCount 0 timestamp 2026-11-05T23:41:27.083332 dataValue Caffeine-Cache - CLEAN - ben-manes - 11:41 PM FINAL)
│   ├── demo7.png (POST /api/tools Body raw JSON name H2 Database category Database description In-memory DB author h2database license MPL-2.0 version 2.2.224 repoUrl https://github.com/h2database/h2database stars 4500 dataValue H2 Database-Database viewCount 0 - 200 OK Time 13ms Size 479B - Returns id 4 name H2 Database category Database author h2database license MPL-2.0 version 2.2.224 repoUrl https://github.com/h2database/h2database stars 4500 viewCount 0 timestamp 2026-11-05T23:41:51.038208 dataValue H2 Database-Database - CLEAN - H2 - 11:41 PM FINAL)
│   ├── demo8.png (GET /api/tools - 4 items id 4 H2 Database Database In-memory DB h2database MPL-2.0 2.2.224 https://github.com/h2database/h2database stars 4500 viewCount 0 timestamp 2026-11-05T23:41:51.038208 dataValue H2 Database-Database + id 3 Caffeine Cache High performance cache ben-manes Apache-2.0 3.1.8 https://github.com/ben-manes/caffeine stars 15000 viewCount 0 timestamp 2026-11-05T23:41:27.083332 dataValue Caffeine-Cache + id 2 MapStruct CodeGen Code generator mapstruct Apache 2.0 1.5.5 https://github.com/mapstruct/mapstruct stars 6500 viewCount 0 timestamp 2026-11-05T23:41:08.272825 dataValue MapStruct-CodeGen + id 1 Lombok DevTool Java annotation library ProjectLombok MIT 1.18.30 https://github.com/projectlombok/lombok stars 13000 viewCount 0 timestamp 2026-11-05T23:40:46.904102 dataValue Lombok-DevTool - List with viewCount + CLEAN without %20 + data_value fix + Ordered timestamp DESC id 4,3,2,1 - FINAL)
│   ├── demo9.png (GET /api/tools/category/DevTool - Category-Strategy - Status 200 OK - Returns count 1 id 1 Lombok DevTool Java annotation library ProjectLombok MIT 1.18.30 https://github.com/projectlombok/lombok stars 13000 viewCount 0 timestamp 2026-11-05T23:40:46.904102 dataValue Lombok-DevTool - CLEAN - Category isolation DevTool only - FINAL)
│   ├── demo10.png (GET /api/tools/author/ben-manes - Author-Strategy - Status 200 OK - Returns count 1 id 3 Caffeine Cache High performance cache ben-manes Apache-2.0 3.1.8 https://github.com/ben-manes/caffeine stars 15000 viewCount 0 timestamp 2026-11-05T23:41:27.083332 dataValue Caffeine-Cache - Author ben-manes only - CLEAN - id 3 - stars 15000 - FINAL)
│   ├── demo11.png (GET /api/tools/license/%20MIT - License-Strategy - Returns filter MIT with %20 space data count 1 id 1 Lombok DevTool Java annotation library ProjectLombok MIT 1.18.30 https://github.com/projectlombok/lombok stars 13000 viewCount 0 timestamp 2026-11-05T23:40:46.904102 dataValue Lombok-DevTool - FIXED FROM [] EMPTY - CRITICAL PROOF trim() fix - Was [] empty due to license=" MIT" bug %20MIT - Now CLEAN without %20 returns 1 item id 1 Lombok MIT 13000 stars 23:40:46.904102 - Core Tier 10 Fix - Same as 99 isolated fix + 100 resource fix + 101 tenant fix count 0->2 now MIT fix count 0->1 - Most important demo - Proof of Bug Fix - Pretty-print browser - FINAL)
│   ├── demo12.png (GET /api/tools/hybrid?category=Cache&author=ben-manes - Hybrid-Strategy filtered - Returns filter category Cache author ben-manes data count 1 id 3 Caffeine Cache High performance cache ben-manes Apache-2.0 3.1.8 https://github.com/ben-manes/caffeine stars 15000 viewCount 0 timestamp 2026-11-05T23:41:27.083332 dataValue Caffeine-Cache - Hybrid filtered Category + Author - Caffeine only - CLEAN - FINAL)
│   ├── demo13.png (GET /api/tools/hybrid - Hybrid-Strategy all - Returns count 4 id 4 H2 Database Database In-memory DB h2database MPL-2.0 2.2.224 4500 stars 23:41:51.038208 + id 3 Caffeine Cache High performance cache ben-manes Apache-2.0 3.1.8 15000 stars 23:41:27.083332 + id 2 MapStruct CodeGen Code generator mapstruct Apache 2.0 1.5.5 6500 stars 23:41:08.272825 + id 1 Lombok DevTool Java annotation library ProjectLombok MIT 1.18.30 13000 stars 23:40:46.904102 - Sorted by timestamp DESC 23:41:51.038208,23:41:27.083332,23:41:08.272825,23:40:46.904102 id 4,3,2,1 - Hybrid-Strategy - Core Tier 10 Feature - OSS Category Author License FINAL)
│   ├── demo14.png (GET /api/tools/count - Browser - 200 OK - Returns {"count":4} - Count proof - Pretty-print - Total 4 tools - Count endpoint - 05-11-2026 FINAL)
│   ├── demo15.png (GET /api/tools/info - Browser - 200 OK - Returns OssTool Service - Builder Pattern + Strategy Pattern Category vs Author vs License vs Hybrid sorted timestamp DESC + Repository Pattern + Caffeine 1000 max 600s Stats - Info proof - Tier 10 FINAL - FINAL)
│   ├── demo16.png (GET /api/tools/search?q=Caffeine - Browser - 200 OK - Returns data id 3 Caffeine Cache High performance cache ben-manes Apache-2.0 3.1.8 https://github.com/ben-manes/caffeine stars 15000 viewCount 0 timestamp 2026-11-05T23:41:27.083332 dataValue Caffeine-Cache query Caffeine count 1 - Search proof - Search by q Caffeine - FINAL)
│   ├── demo17.png (Eclipse Console - WARNING Byte-buddy-agent 1.14.13 + OpenJDK 64-Bit Server VM warning Sharing only supported for boot loader classes - Builder Pattern Test Passed: Caffeine + Search Test Passed: Found 1 rec for category DevTool + Mockito Test Passed: getAllTools - Mocked 2 tools + OssTool Entity Test Passed + Mockito Test Passed: getToolById + Format Tool Test Passed: Category DevTool: Lombok - MIT - 05-Nov-2026 11:46 pm - 11:46 pm elapsed 0:00 - Console - Logs proof FINAL)
│   └── demo18.png (Eclipse JUnit - Finished after 6.809 seconds - Runs: 6/6 Errors: 0 Failures: 0 Green Bar - OssToolServiceTest [Runner: JUnit 5] (6.200 s) - Failure Trace empty - Green Bar proof - Was 2/2 Tier 5 -> Now 6/6 Tier 10 - FIXED [] bug with trim() - Builder Pattern Caffeine + Search 1 rec + Mocked 2 tools + Entity + getById + Format DevTool Lombok MIT - 6.809s (6.200 s) - Same as 101 15.171s (6.828s) - JUnit Green - 11:46 PM 05-11-2026 FINAL)
│   └── demo19.png (Render Deploy Live FINAL - STATUS Deploy succeeded | Live Green Tick - DURATION 3m 50s - DEPLOYED Nov 5 2026 at 11:50 PM GMT+5:30 - TRIGGER First Deploy - SOURCE final102 - Tomcat started on port 10000 - Started OsstoolApplication in 89.101 seconds - Your service is live - Available at primary URL https://one02-capstone-oss-tool.onrender.com - Proof of Production Live - Same as 101 Live 3m50s - Tier 10 SCALE 102/102 100% - FINAL - final102 latest fix)
│
├── .gitignore (target/ .mvn/ settings/ .classpath .project .factorypath META-INF/ data/ uploads/ *.log)
├── CONTRIBUTING.md (Tier 10 GitHub Goal - 12466 chars - FINAL)
├── Dockerfile (Multi-Stage maven:3.9-eclipse-temurin-17 AS build + eclipse-temurin:17-jdk-alpine + mkdir -p data + COPY --from=build /app/target/*.jar app.jar - FINAL)
├── mvnw
├── mvnw.cmd
├── pom.xml (No Lombok - H2 + JPA + Validation + Cache + Caffeine + spring-boot-starter-cache + spring-boot-starter-test + JUnit5 + Mockito + OSS Pattern FINAL)
└── README.md (FINAL 102/102 100%)
```

---

# 📸 Screenshots - 18 Demos - Capstone OSS Tool Verified - Live on Render 3m50s - YOUR REAL DATA 05-11-2026 - FINAL

### Demo 1 – Browser - GET / - Home Live JSON - Capstone OSS Tool Tier 10 SCALE FINAL - 11:41 PM
[Demo1 Home](screenshots/demo1.png)

*GET http://localhost:8104/ - Browser - 200 OK - Returns {"project":"102-capstone-oss-tool","status":"Live - Capstone OSS Tool - Tier 10 Scale FINAL","tier":"10 - System Design Level - Caching + Security + Testing + Design Patterns - FINAL","port":"8104 local, 10000 on Render","author":"Ravi Teja","caching":"Caffeine Cache - tools cache - 1000 max, 600s expire - Stats enabled - Redis ready","oss":"OSS Pattern - Category Author License Hybrid","security":"Headers nosniff DENY XSS","designPatterns":"Builder Strategy Repository Caching","testing":"JUnit5 Mockito 6 tests","live_url":"https://one02-capstone-oss-tool.onrender.com"} - Proof of Home Live - Portfolio ready - Tier 10 SCALE 102/102 FINAL - 05-11-2026 11:41 PM*

### Demo 2 – Browser - GET /health - UP - Caching + Security + OSS Active - 11:41 PM
[Demo2 Health](screenshots/demo2.png)

*GET http://localhost:8104/health - Browser - 200 OK - Returns {"status":"UP","database":"H2","databaseName":"ossdb","caching":"Caffeine","cacheManager":"Caffeine","cacheSpec":"maximumSize=1000,expireAfterAccess=600s,recordStats","securityHeaders":"X-Content-Type-Options nosniff, X-Frame-Options DENY, X-XSS-Protection","patterns":["Builder","Strategy","Repository","Caching"],"features":["oss","category-author-license"],"oss":"Active - OSS Pattern - Category Author License Hybrid - Strategy Pattern","cache":"Active - Caffeine - tools, tool - Stats enabled","security":"Headers Active"} - Proof of Health Endpoint - Tier 10 Health Check - ossdb - FINAL*

### Demo 3 – Browser - GET /api/tools - Empty List - Before Create - 11:40 PM
[Demo3 Empty List](screenshots/demo3.png)

*GET http://localhost:8104/api/tools - Browser - 200 OK - Returns [] - Empty JSON array - Pretty-print - Proof of List Endpoint Working - No data yet - H2 file empty - Caching tools cache ready - localhost:8104 - FINAL*

### Demo 4 – Postman - POST /api/tools - 200 OK - id 1 - Lombok DevTool MIT 13000 stars - 438ms - CLEAN FINAL
[Demo4 Create Lombok](screenshots/demo4.png)

*POST http://localhost:8104/api/tools Body raw JSON {"name":"Lombok","category":"DevTool","description":"Java annotation library","author":"ProjectLombok","license":"MIT","version":"1.18.30","repoUrl":"https://github.com/projectlombok/lombok","stars":13000,"dataValue":"Lombok-DevTool","viewCount":100} - 200 OK Status: 200 OK Time: 438ms Size: 483B - Returns id:1, name:Lombok, category:DevTool, description:Java annotation library, author:ProjectLombok, license:MIT, version:1.18.30, repoUrl:https://github.com/projectlombok/lombok, stars:13000, viewCount:0 (100 input becomes 0), timestamp:2026-11-05T23:40:46.904102, dataValue:Lombok-DevTool - Builder Pattern - trim() fix - Lombok DevTool MIT 13000 - CLEAN without %20 - 11:40 PM 05-11-2026 FINAL*

### Demo 5 – Postman - POST /api/tools - 200 OK - id 2 - MapStruct CodeGen Apache-2.0 6500 stars - 18ms
[Demo5 Create MapStruct](screenshots/demo5.png)

*POST http://localhost:8104/api/tools Body raw JSON {"name":"MapStruct","category":"CodeGen","description":"Code generator","author":"mapstruct","license":"Apache-2.0","version":"1.5.5","repoUrl":"https://github.com/mapstruct/mapstruct","stars":6500,"dataValue":"MapStruct-CodeGen","viewCount":50} - 200 OK Time: 18ms Size: 477B - Returns id:2, name:MapStruct, category:CodeGen, description:Code generator, author:mapstruct, license:Apache-2.0, version:1.5.5, repoUrl:https://github.com/mapstruct/mapstruct, stars:6500, viewCount:0, timestamp:2026-11-05T23:41:08.272825, dataValue:MapStruct-CodeGen - CLEAN - MapStruct CodeGen 6500 - 11:41 PM FINAL*

### Demo 6 – Postman - POST /api/tools - 200 OK - id 3 - Caffeine Cache Apache-2.0 ben-manes 15000 stars - 17ms
[Demo6 Create Caffeine](screenshots/demo6.png)

*POST http://localhost:8104/api/tools Body raw JSON {"name":"Caffeine","category":"Cache","description":"High performance cache","author":"ben-manes","license":"Apache-2.0","version":"3.1.8","repoUrl":"https://github.com/ben-manes/caffeine","stars":15000,"dataValue":"Caffeine-Cache","viewCount":0} - 200 OK Time: 17ms Size: 488B - Returns id:3, name:Caffeine, category:Cache, description:High performance cache, author:ben-manes, license:Apache-2.0, version:3.1.8, repoUrl:https://github.com/ben-manes/caffeine, stars:15000, viewCount:0, timestamp:2026-11-05T23:41:27.083332, dataValue:Caffeine-Cache - CLEAN - ben-manes author - stars 15000 - 11:41 PM FINAL*

### Demo 7 – Postman - POST /api/tools - 200 OK - id 4 - H2 Database Database MPL-2.0 4500 stars - 13ms
[Demo7 Create H2](screenshots/demo7.png)

*POST http://localhost:8104/api/tools Body raw JSON {"name":"H2 Database","category":"Database","description":"In-memory DB","author":"h2database","license":"MPL-2.0","version":"2.2.224","repoUrl":"https://github.com/h2database/h2database","stars":4500,"dataValue":"H2 Database-Database","viewCount":0} - 200 OK Time: 13ms Size: 479B - Returns id:4, name:H2 Database, category:Database, description:In-memory DB, author:h2database, license:MPL-2.0, version:2.2.224, repoUrl:https://github.com/h2database/h2database, stars:4500, viewCount:0, timestamp:2026-11-05T23:41:51.038208, dataValue:H2 Database-Database - CLEAN - H2 Database latest - 11:41 PM FINAL*

### Demo 8 – Postman - GET /api/tools - With 4 Tools - viewCount 0 - CLEAN - 4 items timestamp DESC id 4,3,2,1 FINAL
[Demo8 List 4 Items](screenshots/demo8.png)

*GET http://localhost:8104/api/tools - Browser - 200 OK - Returns 4 tools id 4 H2 Database Database In-memory DB h2database MPL-2.0 2.2.224 https://github.com/h2database/h2database stars 4500 viewCount 0 timestamp 2026-11-05T23:41:51.038208 dataValue H2 Database-Database + id 3 Caffeine Cache High performance cache ben-manes Apache-2.0 3.1.8 https://github.com/ben-manes/caffeine stars 15000 viewCount 0 timestamp 2026-11-05T23:41:27.083332 dataValue Caffeine-Cache + id 2 MapStruct CodeGen Code generator mapstruct Apache-2.0 1.5.5 https://github.com/mapstruct/mapstruct stars 6500 viewCount 0 timestamp 2026-11-05T23:41:08.272825 dataValue MapStruct-CodeGen + id 1 Lombok DevTool Java annotation library ProjectLombok MIT 1.18.30 https://github.com/projectlombok/lombok stars 13000 viewCount 0 timestamp 2026-11-05T23:40:46.904102 dataValue Lombok-DevTool - Ordered by timestampDesc - viewCount 0 - Proof of List Persistence - H2 ossdb - idx_category + idx_author + X-Cache: Caffeine - CLEAN without %20 - data_value fix - Ordered DESC 4,3,2,1 timestamp 23:41:51.038208 to 23:40:46.904102 - FINAL*

### Demo 9 – Postman - GET /api/tools/category/DevTool - Category count 1 id 1 Lombok - FINAL
[Demo9 Category Strategy](screenshots/demo9.png)

*GET http://localhost:8104/api/tools/category/DevTool - Browser - 200 OK - Returns filter DevTool data id 1 Lombok DevTool Java annotation library ProjectLombok MIT 1.18.30 https://github.com/projectlombok/lombok stars 13000 viewCount 0 timestamp 2026-11-05T23:40:46.904102 dataValue Lombok-DevTool count 1 strategy category-Strategy - Category isolation - DevTool only - CLEAN - id 1 - FINAL*

### Demo 10 – Postman - GET /api/tools/author/ben-manes - Author count 1 id 3 Caffeine 15000 stars - FINAL
[Demo10 Author Strategy](screenshots/demo10.png)

*GET http://localhost:8104/api/tools/author/ben-manes - Browser - 200 OK - Returns filter ben-manes data id 3 Caffeine Cache High performance cache ben-manes Apache-2.0 3.1.8 https://github.com/ben-manes/caffeine stars 15000 viewCount 0 timestamp 2026-11-05T23:41:27.083332 dataValue Caffeine-Cache count 1 strategy author-Strategy - Author-Strategy - Only ben-manes author - CLEAN - id 3 Caffeine 15000 stars - FINAL*

### Demo 11 – Browser - GET /api/tools/license/%20MIT - License count 1 FIXED from [] - CRITICAL - YOUR REAL DATA - FINAL
[Demo11 License FIXED %20MIT](screenshots/demo11.png)

*GET http://localhost:8104/api/tools/license/%20MIT - Browser - 200 OK - Returns {"filter":"MIT","data":[{"id":1,"name":"Lombok","category":"DevTool","description":"Java annotation library","author":"ProjectLombok","license":"MIT","version":"1.18.30","repoUrl":"https://github.com/projectlombok/lombok","stars":13000,"viewCount":0,"timestamp":"2026-11-05T23:40:46.904102","dataValue":"Lombok-DevTool"}],"count":1,"strategy":"license-Strategy"} - FIXED FROM [] EMPTY - CRITICAL PROOF trim() fix - Was [] empty due to license=" MIT" bug %20MIT URL encoded space - Now CLEAN without %20 returns 1 item id 1 Lombok MIT 13000 stars 23:40:46.904102 - Core Tier 10 Fix - Same as 100 resource fix + 99 isolated fix + 101 tenant fix - Most important demo - Proof of Bug Fix - Pretty-print browser - %20MIT proof - FINAL 102/102 100%*

### Demo 12 – Browser - GET /api/tools/hybrid?category=Cache&author=ben-manes - Hybrid count 1 Caffeine - YOUR REAL DATA - FINAL
[Demo12 Hybrid Filtered](screenshots/demo12.png)

*GET http://localhost:8104/api/tools/hybrid?category=Cache&author=ben-manes - Browser - 200 OK - Returns {"filter":{"category":"Cache","author":"ben-manes"},"data":[{"id":3,"name":"Caffeine","category":"Cache","description":"High performance cache","author":"ben-manes","license":"Apache-2.0","version":"3.1.8","repoUrl":"https://github.com/ben-manes/caffeine","stars":15000,"viewCount":0,"timestamp":"2026-11-05T23:41:27.083332","dataValue":"Caffeine-Cache"}],"count":1,"strategy":"hybrid-Strategy"} - Hybrid filtered Category Cache + Author ben-manes - Returns 1 item id 3 Caffeine Cache High performance cache ben-manes Apache-2.0 3.1.8 15000 stars 23:41:27.083332 - Caffeine only - Core Tier 10 Feature - Hybrid filtered - FINAL*

### Demo 13 – Browser - GET /api/tools/hybrid - Hybrid count 4 sorted timestamp DESC id 4,3,2,1 - Core Feature - YOUR REAL DATA - FINAL
[Demo13 Hybrid Sorted](screenshots/demo13.png)

*GET http://localhost:8104/api/tools/hybrid - Browser - 200 OK - Returns {"filter":null,"data":[{"id":4,"name":"H2 Database","category":"Database","description":"In-memory DB","author":"h2database","license":"MPL-2.0","version":"2.2.224","repoUrl":"https://github.com/h2database/h2database","stars":4500,"viewCount":0,"timestamp":"2026-11-05T23:41:51.038208","dataValue":"H2 Database-Database"},{"id":3,"name":"Caffeine","category":"Cache","description":"High performance cache","author":"ben-manes","license":"Apache-2.0","version":"3.1.8","repoUrl":"https://github.com/ben-manes/caffeine","stars":15000,"viewCount":0,"timestamp":"2026-11-05T23:41:27.083332","dataValue":"Caffeine-Cache"},{"id":2,"name":"MapStruct","category":"CodeGen","description":"Code generator","author":"mapstruct","license":"Apache-2.0","version":"1.5.5","repoUrl":"https://github.com/mapstruct/mapstruct","stars":6500,"viewCount":0,"timestamp":"2026-11-05T23:41:08.272825","dataValue":"MapStruct-CodeGen"},{"id":1,"name":"Lombok","category":"DevTool","description":"Java annotation library","author":"ProjectLombok","license":"MIT","version":"1.18.30","repoUrl":"https://github.com/projectlombok/lombok","stars":13000,"viewCount":0,"timestamp":"2026-11-05T23:40:46.904102","dataValue":"Lombok-DevTool"}],"count":4,"strategy":"hybrid-Strategy"} - Sorted by timestamp DESC 23:41:51.038208 H2 Database + 23:41:27.083332 Caffeine + 23:41:08.272825 MapStruct + 23:40:46.904102 Lombok - id 4,3,2,1 - Hybrid-Strategy - Core Tier 10 Feature - OSS sorted timestamp DESC - Most important demo - Same as 99 hybrid sorted 4.8 4.5 4.2 + 100 sorted timestamp DESC 22:36:31 22:36:01 + 101 sorted price DESC 299.99,99.99,29.99,9.99 but for timestamp - CLEAN - Pretty-print - FINAL*

### Demo 14 – Browser - GET /api/tools/count - Count 4 - YOUR REAL DATA - FINAL
[Demo14 Count](screenshots/demo14.png)

*GET http://localhost:8104/api/tools/count - Browser - 200 OK - Returns {"count":4} - Count proof - Pretty-print - Total 4 tools - Count endpoint - localhost:8104/api/tools/count - 05-11-2026 FINAL - Image: image_c503ae.png YOUR REAL DATA count 4*

### Demo 15 – Browser - GET /api/tools/info - Info Tier 10 SCALE FINAL - YOUR REAL DATA - FINAL
[Demo15 Info](screenshots/demo15.png)

*GET http://localhost:8104/api/tools/info - Browser - 200 OK - Returns {"info":"OssTool Service - Builder Pattern + Strategy Pattern Category vs Author vs License vs Hybrid sorted timestamp DESC + Repository Pattern + Caffeine 1000 max 600s Stats"} - Info proof - Tier 10 FINAL - Same as 101 info - localhost:8104/api/tools/info - Image: image_ee45a9.png YOUR REAL DATA FINAL*

### Demo 16 – Browser - GET /api/tools/search?q=Caffeine - Search count 1 id 3 Caffeine - YOUR REAL DATA - FINAL
[Demo16 Search](screenshots/demo16.png)

*GET http://localhost:8104/api/tools/search?q=Caffeine - Browser - 200 OK - Returns {"data":[{"id":3,"name":"Caffeine","category":"Cache","description":"High performance cache","author":"ben-manes","license":"Apache-2.0","version":"3.1.8","repoUrl":"https://github.com/ben-manes/caffeine","stars":15000,"viewCount":0,"timestamp":"2026-11-05T23:41:27.083332","dataValue":"Caffeine-Cache"}],"query":"Caffeine","count":1} - Search proof - Search by q Caffeine - id 3 Caffeine Cache ben-manes Apache-2.0 3.1.8 15000 stars 23:41:27.083332 - viewCount 0 - Pretty-print - Image: image_73e1e5.png YOUR REAL DATA FINAL*

### Demo 17 – Eclipse Console - JUnit Logs - 5 Tests Logs - BUILDER Caffeine + Mocked 2 tools - YOUR REAL DATA - FINAL
[Demo17 JUnit Logs](screenshots/demo17.png)

*Eclipse Console - WARNING A Java agent has been loaded dynamically (C:\Users\Ravi Teja\.m2\repository\net\bytebuddy\byte-buddy-agent\1.14.13\byte-buddy-agent-1.14.13.jar) WARNING If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading WARNING If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage WARNING Dynamic loading of agents will be disallowed by default in a future release OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended - Builder Pattern Test Passed: Caffeine + Search Test Passed: Found 1 rec for category DevTool + Mockito Test Passed: getAllTools - Mocked 2 tools + OssTool Entity Test Passed + Mockito Test Passed: getToolById + Format Tool Test Passed: Category DevTool: Lombok - MIT - 05-Nov-2026 11:46 pm - 11:46 pm elapsed 0:00 - Console - Logs proof FINAL - Same as 101 logs Builder Pattern Test Passed: PRO*

### Demo 18 – Eclipse JUnit - Green Bar - 6/6 Tests Passed - 6.809s (6.200s) - FIXED [] bug %20MIT proof - YOUR REAL DATA - FINAL
[Demo18 JUnit Green](screenshots/demo18.png)

*Eclipse JUnit - Finished after 6.809 seconds - Runs: 6/6 Errors: 0 Failures: 0 Green Bar - OssToolServiceTest [Runner: JUnit 5] (6.200 s) - Failure Trace empty - Green Bar proof - Was 2/2 Tier 5 -> Now 6/6 Tier 10 - FIXED [] bug with trim() %20MIT proof - Builder Pattern Caffeine + Search 1 rec + Mocked 2 tools + Entity + getById + Format DevTool Lombok MIT - 6.809s (6.200 s) - Same as 101 15.171s (6.828s) + 100 5.328s - JUnit Green - 11:46 PM 05-11-2026 - 05-Nov-2026 - 26°C - ENG IN - FINAL - Image: image_858c8a.png YOUR REAL DATA FINAL - 6.809s vs 101 15.171s*

### Demo 19 – Render - Deploy succeeded Live - DURATION 3m50s - Your service is live - final102 - 89.101s - FINAL
[Demo19 Render Live 3m50s FINAL](screenshots/demo19.png)

*Render Dashboard - 102-capstone-oss-tool - STATUS Deploy succeeded | Live Green Tick - DURATION 3m50s - DEPLOYED Nov 5 2026 at 11:50 PM GMT+5:30 - TRIGGER First Deploy - SOURCE final102 - Tomcat started on port 10000 - Started OsstoolApplication in 89.101 seconds (process running for 99.293) - Your service is live - Available at primary URL https://one02-capstone-oss-tool.onrender.com - Initializing Spring DispatcherServlet - Completed initialization in 94 ms - Proof of Production Live - Same as 101 Live 3m50s + 100 Live 3m49s - Tier 10 SCALE 102/102 100% - FINAL - final102 latest fix - FINAL PROJECT*

---

# ▶ How to Run - Capstone OSS Tool Repo - FINAL

## 1⃣ Clone the Repository - FINAL

```bash
git clone https://github.com/raviteja-dev950/102-capstone-oss-tool.git
cd 102-capstone-oss-tool
```

## 2⃣ Verify application.properties & Controllers - FINAL

```properties
server.port=${PORT:8104}
spring.datasource.url=jdbc:h2:file:./data/ossdb
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.cache.type=caffeine
spring.cache.caffeine.spec=maximumSize=1000,expireAfterAccess=600s,recordStats
spring.application.name=102-capstone-oss-tool
```

## 3⃣ Run in Eclipse IDE (No Docker Needed) - FINAL

```text
File -> New -> Spring Starter Project
  Name: 102-capstone-oss-tool
  Group: com.osstool
  Artifact: 102-capstone-oss-tool
  Package: com.osstool
  Java: 17
  Dependencies: H2, Spring Data JPA, Spring Web, Validation, Cache, Caffeine
Finish
Replace src + pom.xml from this repo
Delete META-INF folder if exists (Eclipse bug - Same as 93/94/95/96/97/98/99/100/101)
Project -> Clean -> Clean all
Right Click Project -> Maven -> Update Project -> Force Update -> OK
Right Click Project -> Run As -> Maven clean -> Maven install
Right Click Project -> Run As -> Spring Boot App -> Or java -jar target/*.jar
```

## 4⃣ Test with Browser + Postman - 12 Endpoints + Category Author License Hybrid - FINAL

- GET http://localhost:8104/ -> Live JSON Tier 10 SCALE FINAL + live_url https://one02-capstone-oss-tool.onrender.com
- GET http://localhost:8104/health -> UP + cache Active Caffeine Stats enabled + oss Active OSS Pattern + database H2 ossdb
- GET http://localhost:8104/api/tools -> [] empty then 4 tools viewCount 0 + X-Cache CLEAN without %20
- POST http://localhost:8104/api/tools?category=DevTool&name=Lombok&description=Java annotation library&author=ProjectLombok&license=MIT&version=1.18.30&repoUrl=https://github.com/projectlombok/lombok&stars=13000&dataValue=Lombok-DevTool -> 200 OK id 1 CLEAN without %20 - trim() fix - Lombok 13000 stars 23:40:46.904102
- POST http://localhost:8104/api/tools?category=CodeGen&name=MapStruct&description=Code generator&author=mapstruct&license=Apache-2.0&version=1.5.5&repoUrl=https://github.com/mapstruct/mapstruct&stars=6500&dataValue=MapStruct-CodeGen -> 200 OK id 2 CLEAN - MapStruct 6500 stars 23:41:08.272825
- POST http://localhost:8104/api/tools?category=Cache&name=Caffeine&description=High performance cache&author=ben-manes&license=Apache-2.0&version=3.1.8&repoUrl=https://github.com/ben-manes/caffeine&stars=15000&dataValue=Caffeine-Cache -> 200 OK id 3 ben-manes isolation 15000 stars
- POST http://localhost:8104/api/tools?category=Database&name=H2 Database&description=In-memory DB&author=h2database&license=MPL-2.0&version=2.2.224&repoUrl=https://github.com/h2database/h2database&stars=4500&dataValue=H2 Database-Database -> 200 OK id 4 CLEAN - H2 4500 stars 23:41:51.038208 latest
- GET http://localhost:8104/api/tools -> 4 tools viewCount 0 + X-Cache CLEAN without %20 - data_value fix - id 4,3,2,1 timestamp DESC
- GET http://localhost:8104/api/tools/category/DevTool -> Category count 1 - Only DevTool - Lombok
- GET http://localhost:8104/api/tools/author/ben-manes -> Author count 1 - Only ben-manes - Caffeine 15000 stars
- GET http://localhost:8104/api/tools/license/MIT -> License count 1 FIXED from [] empty - CRITICAL trim() fix %20MIT proof - Core Bug Fix FINAL
- GET http://localhost:8104/api/tools/hybrid?category=Cache&author=ben-manes -> Hybrid count 1 Caffeine filtered - Category + Author
- GET http://localhost:8104/api/tools/hybrid -> Hybrid count 4 sorted timestamp DESC 23:41:51.038208,23:41:27.083332,23:41:08.272825,23:40:46.904102 - Core OSS sorted
- GET http://localhost:8104/api/tools/search?q=Caffeine -> count 1 Caffeine
- GET http://localhost:8104/api/tools/count -> 4
- GET http://localhost:8104/api/tools/info -> Tier 10 SCALE FINAL info
- Browser refresh list multiple times -> X-Cache: Caffeine hit

## 5⃣ Test JUnit - 6/6 Green Bar - Tier 10 - FIXED [] bug %20MIT proof - FINAL

```text
Right Click OssToolServiceTest.java -> Run As -> JUnit Test
Expected: Runs 6/6 Errors 0 Failures 0 Green Bar Finished after 6.809 seconds (6.200 s) + Console Builder Pattern Test Passed: Caffeine + Format Tool Test Passed: Category DevTool: Lombok - MIT + OssTool Entity Test Passed + Mockito Test Passed: getToolById + Search Test Passed: Found 1 rec for category DevTool + Mockito Test Passed: getAllTools - Mocked 2 tools + OssToolServiceTest [Runner: JUnit 5] (6.200 s) - FIXED [] bug with trim() %20MIT proof - FINAL
```

## 6⃣ Deploy to Render (Live) - TIER 10 SCALE - Docker Multi-Stage - FINAL

```text
Runtime: Docker (Multi-Stage)
Build: Docker builds maven:3.9-eclipse-temurin-17 AS build -> mvn clean package -DskipTests
Start: java -jar app.jar
Port: 8104 local, 10000 Render (Tomcat auto)
Env: PORT=10000 (Render sets)
Live: https://one02-capstone-oss-tool.onrender.com
Deploy succeeded Live - 3m50s - FINAL 102/102 100%
```

Dockerfile:
```dockerfile
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
RUN mkdir -p data
COPY --from=build /app/target/*.jar app.jar
EXPOSE 10000
ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

# 🔄 Flow Diagram - How Capstone OSS Tool Works - Tier 10 SCALE FINAL

```text
    User Laptop (Eclipse + Browser + Postman)
        |
        +-- 102-capstone-oss-tool - FINAL CAPSTONE
        |       +-- OsstoolApplication.java (Main + Tomcat 8104 local 10000 Render + Started 13.37s local 89.101s Render FINAL)
        |       +-- CacheConfig.java (@Configuration @EnableCaching + CaffeineCacheManager maximumSize=1000 expireAfterAccess=600s recordStats() FINAL)
        |       +-- SecurityHeadersConfig.java (@Configuration implements WebMvcConfigurer + HandlerInterceptor + nosniff DENY XSS FINAL)
        |       +-- OssTool.java (Entity + id + name + category + description + author + license + version + repoUrl + stars + viewCount + timestamp + createdAt 2026-11-05T23:40:46.904102 + data_value column fix + @JsonIgnore alias fix + Inner Builder - Builder Pattern + trim() fix FINAL)
        |       +-- OssToolRepository.java (JpaRepository + findAllByOrderByTimestampDesc + findByCategoryOrderByStarsDesc + findByAuthorContainingIgnoreCase + findByLicense + findByCategory + findByAuthor + idx_category + idx_author - Repository Pattern - OSS pattern ready FINAL)
        |       +-- OssToolService.java (Builder Pattern createTool + trim() fix cleanCategory category.trim() cleanAuthor author.trim() cleanLicense license.trim() + CacheEvict tools tool + viewCount + idx_category + idx_author + Cacheable tools + Cacheable tool + formatToolInfo Category DevTool: Lombok + isRelevant category contains + Strategy Pattern getToolByStrategy category vs author vs license vs hybrid + trim() fix cleanType + filter category author license trim() FIXED [] bug MIT %20MIT proof count 1 + hybrid sorted timestamp DESC 23:41:51.038208,23:41:27.083332,23:41:08.272825,23:40:46.904102 FINAL)
        |       +-- OssToolController.java (12 endpoints + Home Live JSON Tier 10 FINAL + Health UP cache Active oss Active + ossdb + Live URL one02 + Create POST Builder + trim() fix CLEAN + List GET @Cacheable X-Cache + Category GET Category-Strategy count 1 id 1 Lombok + Author GET Author-Strategy count 1 id 3 Caffeine 15000 stars + License GET License-Strategy count 1 id 1 Lombok FIXED from [] empty %20MIT proof + Hybrid GET filtered Category Cache Author ben-manes count 1 Caffeine + Hybrid GET all count 4 sorted timestamp DESC id 4,3,2,1 H2, Caffeine, MapStruct, Lombok + Search q=Caffeine count 1 + Count GET 4 + Info GET + X-Strategy Category vs Author vs License vs Hybrid - Strategy Pattern core - OSS Category Author License FINAL)
        |       +-- OssToolServiceTest.java (JUnit 5 + Mockito - 6 tests green - Runs 6/6 Errors 0 Failures 0 Green Bar Finished after 6.809s (6.200s) - FIXED [] bug %20MIT proof FINAL)
        |       +-- application.properties (server.port=${PORT:8104} + datasource jdbc:h2:file:./data/ossdb FIXED from dbc typo + jpa ddl-auto update show-sql true + h2 console enabled + cache type caffeine + caffeine spec maximumSize=1000,expireAfterAccess=600s,recordStats FINAL)
        |       +-- screenshots (demo1-19 fresh clean CLEAN without %20 + license %20MIT FIXED from [] to 1 item FINAL)
        |       +-- Dockerfile (Multi-Stage - Fix for openjdk not found + COPY target error + data not found - FINAL)
        |       +-- CONTRIBUTING.md (12466 chars - Tier 10 GitHub Goal - FINAL)
        |       +-- .github/ISSUE_TEMPLATE (bug_report.md + feature_request.md - license %20MIT trim fix - FINAL)
        |
        v
    git push origin main -> GitHub raviteja-dev950/102-capstone-oss-tool -> Render Auto Deploy Docker Multi-Stage -> Tomcat 10000 -> Started Application 89.101s -> Your service is live https://one02-capstone-oss-tool.onrender.com - STATUS Deploy succeeded | Live - DURATION 3m50s - FINAL 102/102 100%
        |
        v
    Browser / Portfolio - localhost:8104/ Live JSON Tier 10 FINAL + localhost:8104/health UP + localhost:8104/api/tools [] then 4 tools CLEAN without %20 + POST tools 200 OK id 1 CLEAN trim() fix Lombok 13000 stars + GET tools 4 tools id 4,3,2,1 timestamp DESC + GET category/DevTool count 1 Lombok + GET author/ben-manes count 1 Caffeine 15000 stars + GET license/%20MIT count 1 FIXED from [] empty CRITICAL %20MIT proof FINAL + GET hybrid?category=Cache&author=ben-manes count 1 Caffeine + GET hybrid count 4 sorted timestamp DESC 23:41:51.038208,23:41:27.083332,23:41:08.272825,23:40:46.904102 + GET search?q=Caffeine count 1 + GET count 4 + GET info Tier 10 SCALE FINAL + JUnit Green Bar 6/6 6.809s (6.200s) + Render Live https://one02-capstone-oss-tool.onrender.com/ + Live health - Portfolio ready - Tier 10 SCALE 102/102 - 100% - FINAL PROJECT - Only 0 left to 100% - DONE
```

---

# 🧪 API Testing Examples - FINAL

```bash
# Home - Tier 10 SCALE FINAL
curl http://localhost:8104/
curl https://one02-capstone-oss-tool.onrender.com/

# Health - UP + cache Active + oss Active + ossdb
curl http://localhost:8104/health
curl https://one02-capstone-oss-tool.onrender.com/health

# List - Empty [] before create
curl http://localhost:8104/api/tools

# Create - Builder Pattern + trim() fix + CLEAN without %20 - Lombok DevTool MIT 13000 stars 23:40:46.904102
curl -X POST "http://localhost:8104/api/tools?category=DevTool&name=Lombok&description=Java%20annotation%20library&author=ProjectLombok&license=MIT&version=1.18.30&repoUrl=https://github.com/projectlombok/lombok&stars=13000&dataValue=Lombok-DevTool"

# Create - MapStruct CodeGen Apache-2.0 6500 stars 23:41:08.272825 CLEAN
curl -X POST "http://localhost:8104/api/tools?category=CodeGen&name=MapStruct&description=Code%20generator&author=mapstruct&license=Apache-2.0&version=1.5.5&repoUrl=https://github.com/mapstruct/mapstruct&stars=6500&dataValue=MapStruct-CodeGen"

# Create - Caffeine Cache Apache-2.0 ben-manes 15000 stars - ben-manes isolation
curl -X POST "http://localhost:8104/api/tools?category=Cache&name=Caffeine&description=High%20performance%20cache&author=ben-manes&license=Apache-2.0&version=3.1.8&repoUrl=https://github.com/ben-manes/caffeine&stars=15000&dataValue=Caffeine-Cache"

# Create - H2 Database Database MPL-2.0 4500 stars 23:41:51.038208 latest
curl -X POST "http://localhost:8104/api/tools?category=Database&name=H2%20Database&description=In-memory%20DB&author=h2database&license=MPL-2.0&version=2.2.224&repoUrl=https://github.com/h2database/h2database&stars=4500&dataValue=H2%20Database-Database"

# List After Create - 4 tools viewCount 0 + CLEAN without %20 + data_value fix + X-Cache + timestamp DESC id 4,3,2,1
curl http://localhost:8104/api/tools

# Category - 200 OK Category count 1 - Only DevTool - Lombok
curl http://localhost:8104/api/tools/category/DevTool

# Author - 200 OK Author count 1 - Only ben-manes - Caffeine 15000 stars
curl http://localhost:8104/api/tools/author/ben-manes

# License - 200 OK License count 1 FIXED from [] empty - CRITICAL trim() fix %20MIT proof FINAL
curl http://localhost:8104/api/tools/license/MIT
curl http://localhost:8104/api/tools/license/%20MIT

# Hybrid filtered - 200 OK Hybrid count 1 Caffeine - Category Cache + Author ben-manes
curl "http://localhost:8104/api/tools/hybrid?category=Cache&author=ben-manes"

# Hybrid all - 200 OK Hybrid count 4 sorted timestamp DESC 23:41:51.038208,23:41:27.083332,23:41:08.272825,23:40:46.904102 - Core OSS sorted FINAL
curl http://localhost:8104/api/tools/hybrid

# Search q - 200 OK count 1 Caffeine
curl http://localhost:8104/api/tools/search?q=Caffeine

# Count - 200 OK 4
curl http://localhost:8104/api/tools/count

# Info - 200 OK Tier 10 SCALE FINAL
curl http://localhost:8104/api/tools/info

# Render Live FINAL
curl https://one02-capstone-oss-tool.onrender.com/
curl https://one02-capstone-oss-tool.onrender.com/health
curl https://one02-capstone-oss-tool.onrender.com/api/tools
```

---

# 👨💻 Author - FINAL

Ravi Teja

Java Full Stack Developer

102 Java Full Stack Projects Challenge

Project 102 / 102 - FINAL - 100%

---

## ⭐ Support - FINAL

If you found this project helpful, consider giving it a ⭐ Star on GitHub.

**Single Repo:** [102-capstone-oss-tool](https://github.com/raviteja-dev950/102-capstone-oss-tool)

**Live URL:** https://one02-capstone-oss-tool.onrender.com/

**Deploy:** Deploy succeeded | Live Green Tick - DURATION 3m50s - DEPLOYED Nov 5 2026 at 11:50 PM GMT+5:30 - TRIGGER First Deploy - SOURCE final102 - Your service is live - Available at primary URL https://one02-capstone-oss-tool.onrender.com - Docker Multi-Stage - Same as 101 Live 3m50s - License %20MIT FIXED from [] empty to 1 item - trim() fix - OSS Pattern Category Author License Hybrid sorted timestamp DESC 23:41:51.038208,23:41:27.083332,23:41:08.272825,23:40:46.904102 id 4,3,2,1! FINAL 102/102 100%!

**Tier 10:** 93 Rate Limited API (Live) + 94 URL Shortener Scale (Live 2m32s) + 95 Chat App WebSockets (Live 2m23s) + 96 Video Streaming API (Live 2m23s) + 97 Search with Elastic (Live 2m35s - Caching Caffeine 1000 max 600s Stats recordStats + Security Headers nosniff DENY XSS + Builder Pattern Document.Builder + Strategy Pattern Exact vs Fuzzy vs Autocomplete + Repository + Caching + JUnit5 Mockito 6/6 Green + viewCount + idx_title + idx_content + Elasticsearch Pattern Exact Fuzzy Autocomplete edge_ngram + completion suggester + fuzziness AUTO + isFuzzyMatch fix count 0 -> 1) + 98 Recommendation Engine (Live 2m23s - Caching Caffeine 1000 max 600s Stats recordStats + Security Headers nosniff DENY XSS + Builder Pattern Recommendation.Builder + Strategy Pattern Collaborative vs Content vs Hybrid + Repository + Caching + JUnit5 Mockito 6/6 Green + viewCount + idx_user + idx_category + Recommendation Pattern Collaborative Content Hybrid sorted 4.8 4.5) + 99 Multi-tenant SaaS (Live 2m50s - Caching Caffeine 1000 max 600s Stats recordStats + Security Headers nosniff DENY XSS + Builder Pattern TenantData.Builder + Strategy Pattern Tenant vs Shared vs Isolated vs Hybrid + Repository + Caching + JUnit5 Mockito 6/6 Green + viewCount + idx_tenant + idx_category + Multi-tenant Pattern Tenant Shared Isolated Hybrid sorted 4.8 4.5 4.2 + data_value fix + trim() fix FIXED [] empty to 1 item) + 100 Audit Log (Live 3m49s - Caching Caffeine 1000 max 600s Stats recordStats + Security Headers nosniff DENY XSS + Builder Pattern AuditLog.Builder + Strategy Pattern User vs Action vs Resource vs Hybrid + Repository + Caching + JUnit5 Mockito 6/6 Green + viewCount + idx_user + idx_action + Audit Log Pattern User Action Resource Hybrid sorted timestamp DESC 22:36:31 22:36:01 22:35:38 22:34:39 + data_value fix + trim() fix FIXED [] empty to 1 item) + 101 Subscription SaaS (Live 3m50s - Caching Caffeine 1000 max 600s Stats recordStats + Security Headers nosniff DENY XSS + Builder Pattern Subscription.Builder + Strategy Pattern Plan vs Status vs Tenant vs Hybrid + Repository + Caching + JUnit5 Mockito 6/6 Green + viewCount + idx_plan + idx_tenant + Subscription Pattern Plan Status Tenant Hybrid sorted price DESC 299.99,99.99,29.99,9.99 + data_value fix + @JsonIgnore alias fix + trim() fix FIXED [] empty to 2 items) + 102 Capstone OSS (Live 3m50s FINAL - Caching Caffeine 1000 max 600s Stats recordStats + Security Headers nosniff DENY XSS + Builder Pattern OssTool.Builder + Strategy Pattern Category vs Author vs License vs Hybrid + Repository + Caching + JUnit5 Mockito 6/6 Green Finished after 6.809s (6.200s) + viewCount + idx_category + idx_author + OSS Pattern Category Author License Hybrid sorted timestamp DESC 23:41:51.038208,23:41:27.083332,23:41:08.272825,23:40:46.904102 id 4,3,2,1 + data_value fix + @JsonIgnore alias fix + trim() fix FIXED [] empty to 1 item %20MIT proof) = **TIER 10 FINAL 10 PROJECTS - 100% DONE - FINAL - 102/102 100% - CAPSTONE COMPLETE**

# 🎉 102/102 100% - CHALLENGE COMPLETE - THANK YOU - FINAL
