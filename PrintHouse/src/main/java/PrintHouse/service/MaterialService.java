package PrintHouse.service;

import PrintHouse.model.Material;
import PrintHouse.repository.MaterialRepository;

import java.util.List;

public class MaterialService {

    private MaterialRepository repository;

    public MaterialService(MaterialRepository repository) {
        this.repository = repository;
    }

    public List<Material> getAll() {
        return repository.getAll();
    }

    public Material getById(int id) {
        return repository.getById(id);
    }
}