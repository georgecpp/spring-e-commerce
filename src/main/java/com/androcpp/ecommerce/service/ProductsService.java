package com.androcpp.ecommerce.service;

import com.androcpp.ecommerce.model.Product;
import com.androcpp.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductsService {

    ProductRepository products;

    @Autowired
    public ProductsService(ProductRepository products) {
        this.products = products;
    }

    public List<Product> getProductsByBrand(String brandName) {
        return products.findAllProducts()
                .stream()
                .filter(product -> product.getBrand().getBrandName().equals(brandName))
                .collect(Collectors.toList());
    }

    public List<Product> getAllProducts() {
        return products.findAllProducts();
    }
}
