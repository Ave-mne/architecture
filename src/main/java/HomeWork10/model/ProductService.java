package HomeWork10.model;

import HomeWork10.exceptions.ProductAddException;
import HomeWork10.exceptions.ProductServiceDeleteException;
import HomeWork10.model.repository.IRepository;

import java.util.List;

/**
 * Класс реализации сервиса по работа с продуктами, в конструкторе принимает репозиторий товаров, поддерживает дополнительную логику при работе с товарами.
 */
public class ProductService {
    private final IRepository<Product> productRepository;

    public ProductService(IRepository<Product> productRepository) {
        this.productRepository = productRepository;
    }

    public void addProductWithLogic(Product product) throws ProductAddException {
        if (product.getId() > 0) {
            productRepository.add(product);
        }
    }

    public void deleteProductWithLogic(int id) throws ProductServiceDeleteException {
        if (productRepository.getById(id).getPrice() < 1000) {
            productRepository.delete(id);
        }
        throw new ProductServiceDeleteException("delete error - price more than 1000");
    }

    public List<Product> getAllProducts() {
        return productRepository.getAll();
    }

}