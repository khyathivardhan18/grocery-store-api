package com.grocerystore.config;

import com.grocerystore.model.Category;
import com.grocerystore.model.Product;
import com.grocerystore.repository.CategoryRepository;
import com.grocerystore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        // Clear existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // Create categories
        Map<String, Category> categories = new HashMap<>();
        String[] categoryNames = {
            "Fruits", "Dairy", "Bakery", "Meat", "Beverages",
            "Snacks", "Canned Goods", "Vegetables"
        };

        for (String name : categoryNames) {
            Category category = new Category(name, "Products in " + name + " category");
            category = categoryRepository.save(category);
            categories.put(name, category);
        }

        // Create sample products
        Product[] products = {
            new Product("Fresh Apples", 2.99, "Sweet and crispy red apples", categories.get("Fruits"), 100),
            new Product("Organic Bananas", 1.99, "Organic yellow bananas", categories.get("Fruits"), 150),
            new Product("Fresh Milk", 3.49, "Whole milk 1 gallon", categories.get("Dairy"), 50),
            new Product("Whole Wheat Bread", 2.49, "Freshly baked whole wheat bread", categories.get("Bakery"), 30),
            new Product("Chicken Breast", 5.99, "Boneless chicken breast", categories.get("Meat"), 40),
            new Product("Orange Juice", 4.29, "100% pure orange juice", categories.get("Beverages"), 60),
            new Product("Potato Chips", 2.99, "Classic salted potato chips", categories.get("Snacks"), 80),
            new Product("Canned Tuna", 1.99, "Premium canned tuna in water", categories.get("Canned Goods"), 70),
            new Product("Fresh Spinach", 2.49, "Organic baby spinach", categories.get("Vegetables"), 45),
            new Product("Greek Yogurt", 3.99, "Plain Greek yogurt", categories.get("Dairy"), 55)
        };

        // Save all products
        for (Product product : products) {
            productRepository.save(product);
        }
    }
} 