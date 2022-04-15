package com.androcpp.ecommerce.controller;

import com.androcpp.ecommerce.model.Product;
import com.androcpp.ecommerce.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ProductsController {

    private final ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/products")
    public Collection<Product> getAllProducts() {
        return productsService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Integer id) {
        return productsService.getProduct(id);
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public int postProduct(@RequestBody Product p) {
        return productsService.saveProduct(p);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product p) {
        productsService.updateProduct(p);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productsService.deleteProduct(id);
    }

    @GetMapping(value = "/products", params = {"category"})
    public Collection<Product> getProductsOfCategory(@RequestParam(value = "category") String category) {
        return productsService.getAllProductsOfCategory(category);
    }

    @GetMapping(value = "/products", params = {"category", "brandName"})
    public Collection<Product> getProductsOfCategory(@RequestParam(value = "category") String category, @RequestParam(value = "brandName") String brandName) {
        return productsService.getAllProductsOfCategoryBrand(category, brandName);
    }

}