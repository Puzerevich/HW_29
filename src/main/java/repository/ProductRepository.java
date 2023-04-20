package repository;

import product.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getProductList();

    Product getById(int id);
}
