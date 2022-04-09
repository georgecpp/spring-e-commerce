package com.androcpp.ecommerce.beans;

import com.androcpp.ecommerce.exception.NoProductException;
import com.androcpp.ecommerce.model.Brand;
import com.androcpp.ecommerce.model.Phone;
import com.androcpp.ecommerce.model.Product;
import com.androcpp.ecommerce.util.Database;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Component
public abstract class Datasource implements Database {

    protected List<Product> productItems = new ArrayList<>();
    protected String dbName ="";

    @Override
    public void createDb(String name, String fromFile) {
        dbName = name;
        try {
            File filedb = new File(fromFile);
            FileReader fileReader = new FileReader(filedb);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] attributes = line.split(" ");
                Phone phone = new Phone(
                        Integer.parseInt(attributes[0]),
                        attributes[1],
                        Float.parseFloat(attributes[2]),
                        Brand.valueOf(attributes[3]),
                        attributes[4]
                );
                productItems.add(phone);
            }
            reader.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public abstract List<Product> getProductItems();
}
