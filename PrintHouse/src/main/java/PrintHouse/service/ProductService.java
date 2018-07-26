package PrintHouse.service;

import PrintHouse.model.Material;
import PrintHouse.model.Product;
import PrintHouse.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public Product getById(int id) {
        return repository.getById(id);
    }



}
