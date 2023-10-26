package HomeWork10;


import HomeWork10.exceptions.ProductAddException;
import HomeWork10.exceptions.ProductServiceDeleteException;
import HomeWork10.model.Product;
import HomeWork10.model.UnitOfWork;
import HomeWork10.model.dao.IProductDAO;
import HomeWork10.model.dao.InMemoryProductDao;
import HomeWork10.model.repository.IRepository;
import HomeWork10.model.repository.ProductRepository;
import HomeWork10.model.ProductService;

public class Main {
    public static void main(String[] args) throws ProductAddException, ProductServiceDeleteException {
        IProductDAO productDAO = new InMemoryProductDao();
        IRepository<Product> productRepository = new ProductRepository(productDAO);
        ProductService productService = new ProductService(productRepository);
        UnitOfWork unitOfWork = new UnitOfWork(productService);

        Product productOne = new Product(1, "HP 141w", 17000);
        Product productTwo = new Product(2, "HP 141a", 16000);

        //add two products
        unitOfWork.addProduct(productOne);
        unitOfWork.addProduct(productTwo);

        //print repository size
        System.out.println(productRepository.getAll().size());

        //revert all operations
        unitOfWork.revertAllOperations();

        //commit
        unitOfWork.commit();

        //print repository size
        System.out.println(productRepository.getAll().size());

        //add product again
        unitOfWork.addProduct(productOne);

        //commit
        unitOfWork.commit();

        //print repository size
        System.out.println(productRepository.getAll().size());
    }
}