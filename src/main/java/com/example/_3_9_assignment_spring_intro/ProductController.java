package com.example._3_9_assignment_spring_intro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products/{productId}")
    public String GetProduct(@PathVariable int productId) {
        String product = null;

        switch (productId) {
        case 1 -> {
        product = "Apple";
        }
        case 2 -> {
        product = "Banana";
        }
        case 3 -> {
        product = "Carrot";
        }
        default -> {
        product = "No product found";
        }
        }

        if (productId > 0 && productId < 4){
            return "This is detail for ID: " + productId + "\nProduct Name: " + product;
        } else {
            return product;
        }
    }

}
