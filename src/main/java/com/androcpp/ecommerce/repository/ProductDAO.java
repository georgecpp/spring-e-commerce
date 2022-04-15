package com.androcpp.ecommerce.repository;

import com.androcpp.ecommerce.exception.DuplicateProductException;
import com.androcpp.ecommerce.exception.NoProductException;
import com.androcpp.ecommerce.model.Product;
import com.androcpp.ecommerce.util.DAO;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductDAO implements DAO<Product> {

    List<Product> products = new ArrayList<>();

    @Override
    public Product get(int id) {
        boolean exists = products.stream()
                .anyMatch(product1 -> product1.getId() == id);
        if (!exists) {
            throw new NoProductException("No product with this id!");
        }
        return products.get(id);
    }

    @Override
    public Collection<Product> getAll() {
        return products;
    }

    @Override
    public int save(Product product) {
        boolean isAlreadyThere = products.stream()
                .anyMatch(product1 -> product1.getProductName().equals(product.getProductName()));

        if (isAlreadyThere) {
            throw new DuplicateProductException("Product already stored!");
        }
        products.add(product);
        int indx = products.size() - 1;
        product.setId(indx);
        return indx;
    }

    @Override
    public void update(Product product) {
        boolean exists = products.stream()
                .anyMatch(product1 -> product1.getId() == product.getId());
        if (!exists) {
            throw new NoProductException("No product with this id!");
        }
        products.set(product.getId(), product);
    }

    @Override
    public void delete(int id) {
        boolean exists = products.stream()
                .anyMatch(product1 -> product1.getId() == id);
        if (!exists) {
            throw new NoProductException("No product with this id!");
        }
        products.remove(id);
    }
}
