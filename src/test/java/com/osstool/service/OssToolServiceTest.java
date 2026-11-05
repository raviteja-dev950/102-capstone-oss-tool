package com.osstool.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.osstool.entity.OssTool;
import com.osstool.repository.OssToolRepository;

@ExtendWith(MockitoExtension.class)
public class OssToolServiceTest {

    @Mock
    private OssToolRepository repository;

    @InjectMocks
    private OssToolService service;

    private OssTool tool;

    @BeforeEach
    void setUp() {
        tool = new OssTool.Builder()
                .name("TestTool")
                .category("DevTool")
                .description("Test Description")
                .author("Ravi")
                .license("【entity-MIT¦canonical_name=MIT】")
                .version("1.0.0")
                .repoUrl("https://github.com/test/tool")
                .stars(100)
                .build();
        tool.setId(1L);
    }

    @Test
    void testCreateTool() {
        when(repository.save(any(OssTool.class))).thenReturn(tool);
        OssTool result = service.createTool("TestTool", "DevTool", "Test Description", "Ravi", "【entity-MIT¦canonical_name=MIT】", "1.0.0", "https://github.com/test/tool", 100);
        assertNotNull(result);
        assertEquals("TestTool", result.getName());
    }

    @Test
    void testGetAllTools() {
        when(repository.findAllByOrderByTimestampDesc()).thenReturn(Arrays.asList(tool));
        List<OssTool> result = service.getAllTools();
        assertEquals(1, result.size());
    }

    @Test
    void testGetToolById() {
        when(repository.findById(1L)).thenReturn(Optional.of(tool));
        when(repository.save(any(OssTool.class))).thenReturn(tool);
        OssTool result = service.getToolById(1L);
        assertNotNull(result);
    }

    @Test
    void testGetToolsByCategory() {
        when(repository.findByCategory("DevTool")).thenReturn(Arrays.asList(tool));
        List<OssTool> result = service.getToolsByCategory("DevTool");
        assertEquals(1, result.size());
    }

    @Test
    void testSearchTools() {
        when(repository.findByNameContainingIgnoreCase("Test")).thenReturn(Arrays.asList(tool));
        List<OssTool> result = service.searchTools("Test");
        assertEquals(1, result.size());
    }

    @Test
    void testGetCount() {
        when(repository.count()).thenReturn(1L);
        long count = service.getCount();
        assertEquals(1L, count);
    }
}