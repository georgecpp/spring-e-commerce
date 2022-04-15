package com.androcpp.ecommerce.beans;

import com.androcpp.ecommerce.exception.NoProductException;
import com.androcpp.ecommerce.model.Product;
import com.androcpp.ecommerce.util.Database;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("!dev")
public class NotDevDatasource extends Datasource implements Database {

    @Override
    public List<Product> getProductItems() {
        throw new NoProductException("No Products! Switch back to dev profile!");
    }
}
