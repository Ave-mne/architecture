package HomeWork10.model.dao;

import HomeWork10.model.Product;

import java.util.List;
/**
 * интерфейс для реализации паттерна Data Access Object
 */
public interface IProductDAO {
    void add(Product product);
    Product find(int productId);
    List<Product> findAll();
    void remove(int productId);
}