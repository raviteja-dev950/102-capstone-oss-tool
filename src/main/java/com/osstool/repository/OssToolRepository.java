package com.osstool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osstool.entity.OssTool;

@Repository
public interface OssToolRepository extends JpaRepository<OssTool, Long> {

    List<OssTool> findByCategory(String category);

    List<OssTool> findByAuthor(String author);

    List<OssTool> findByLicense(String license);

    List<OssTool> findByNameContainingIgnoreCase(String name);

    List<OssTool> findByCategoryAndAuthor(String category, String author);

    List<OssTool> findAllByOrderByTimestampDesc();

    List<OssTool> findAllByOrderByStarsDesc();
}