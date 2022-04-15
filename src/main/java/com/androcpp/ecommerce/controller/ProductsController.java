package com.androcpp.ecommerce.controller;

import com.androcpp.ecommerce.exception.NoProductException;
import com.androcpp.ecommerce.model.Product;
import com.androcpp.ecommerce.service.ProductsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ProductsController {
    private static final Logger logger = LoggerFactory.getLogger(ProductsController.class);

    private final ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/products")
    List<Product> getAllProducts() {
        try {
            return productsService.getAllProducts();
        } catch (NoProductException ex) {
            logger.error(ex.getMessage());
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No products! Switch back to dev profile!", ex);
        }
    }

    @GetMapping("/products/{brand}")
    List<Product> getSpecificProducts(@PathVariable String brand) {
        try {
            return productsService.getProductsByBrand(brand);
        } catch (NoProductException ex) {
            logger.error(ex.getMessage());
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No products! Switch back to dev profile!", ex);
        }
    }

    @GetMapping("/products/{brand}/asString")
    String getSpecificProductsAsString(@PathVariable String brand) {
        try {
            String res = "";
            List<Product> products = productsService.getProductsByBrand(brand);
            for(int i=0;i<products.size();i++) {
                res += products.get(i).toString() + "\n";
            }
            return res;
        } catch (NoProductException ex) {
            logger.error(ex.getMessage());
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No products! Switch back to dev profile!", ex);
        }
    }

}
