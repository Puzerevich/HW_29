package services;

import product.Product;

public interface Cart {

    void add(Product product);

    void remove(int id);
}
