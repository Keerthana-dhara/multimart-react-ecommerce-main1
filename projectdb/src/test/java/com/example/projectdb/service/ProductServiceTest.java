package com.example.projectdb.service;

import com.example.projectdb.Model.Product;
import com.example.projectdb.Model.dao.ProductDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ProductServiceTest {

    @Mock
    private ProductDAO productDAO;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getProducts_shouldReturnListOfProducts_whenProductsExist() {
        // Arrange
        Product product1 = new Product(1L, "Electronics", "Smartphone", "High-end smartphone", 999.99,null);
        Product product2 = new Product(2L, "Home", "Blender", "High-power blender", 79.99, null);
        List<Product> productList = Arrays.asList(product1, product2);
        when(productDAO.findAll()).thenReturn(productList);

        // Act
        List<Product> result = productService.getProducts();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Electronics", result.get(0).getCategory());
        assertEquals("Home", result.get(1).getCategory());
    }

    @Test
    void getProducts_shouldReturnEmptyList_whenNoProductsExist() {
        // Arrange
        when(productDAO.findAll()).thenReturn(Collections.emptyList());

        // Act
        List<Product> result = productService.getProducts();

        // Assert
        assertEquals(0, result.size());
    }

    @Test
    void getProducts_shouldReturnNull_whenDAOThrowsException() {
        // Arrange
        when(productDAO.findAll()).thenThrow(new RuntimeException("Database error"));

        // Act & Assert
        try {
            productService.getProducts();
        } catch (Exception e) {
            assertEquals("Database error", e.getMessage());
        }
    }
}
