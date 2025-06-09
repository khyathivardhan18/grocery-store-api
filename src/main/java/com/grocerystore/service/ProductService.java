package com.grocerystore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocerystore.model.Product;
import com.grocerystore.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    
    public Optional<Product> updateProduct(Long id, Product productDetails) {
        return productRepository.findById(id)
            .map(existingProduct -> {
                existingProduct.setName(productDetails.getName());
                existingProduct.setPrice(productDetails.getPrice());
                existingProduct.setDescription(productDetails.getDescription());
                existingProduct.setCategory(productDetails.getCategory());
                // Removed setStock as getStock() is undefined for Product
                return productRepository.save(existingProduct);
            });
    }
    public boolean deleteProduct(Long id) {
        return productRepository.findById(id)
            .map(product -> {
                productRepository.delete(product);
                return true;
            })
            .orElse(false);
    }
} 