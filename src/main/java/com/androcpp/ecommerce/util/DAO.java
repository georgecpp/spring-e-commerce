package com.androcpp.ecommerce.util;

import java.util.Collection;

public interface DAO<T> {
    T get(int id);
    Collection<T> getAll();
    int save(T t);
    void update(T t);
    void delete(int id);
}
