package com.androcpp.ecommerce.repository;

import com.androcpp.ecommerce.beans.Datasource;
import com.androcpp.ecommerce.beans.DevDatasource;
import com.androcpp.ecommerce.exception.NoProductException;
import com.androcpp.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private Datasource datasource;

    public ProductRepository(Datasource datasource) {
        this.datasource = datasource;
        this.datasource.createDb("phonesdb", "/usr/app/phones.db");
    }

    public List<Product> findAllProducts() {
        return datasource.getProductItems();
    }
}
