package com.androcpp.ecommerce.service;

import com.androcpp.ecommerce.model.Product;
import com.androcpp.ecommerce.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class ProductsService {

    ProductDAO productsDAO;

    @Autowired
    public ProductsService(ProductDAO products) {
        this.productsDAO = products;
    }

    public Collection<Product> getAllProducts() {
        return productsDAO.getAll();
    }

    public int saveProduct(Product p) {
        return productsDAO.save(p);
    }

    public void deleteProduct(int pid) {
        productsDAO.delete(pid);
    }
    public void updateProduct(Product newProduct) {
        productsDAO.update(newProduct);
    }

    public Product getProduct(int pid) {
        return productsDAO.get(pid);
    }

    public Collection<Product> getAllProductsOfCategory(String category) {
        return productsDAO.getAll().stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public Collection<Product> getAllProductsOfCategoryBrand(String category, String brandName) {
        return productsDAO.getAll().stream()
                .filter(product -> product.getCategory().equals(category) && product.getBrand().equals(brandName))
                .collect(Collectors.toList());
    }
}
