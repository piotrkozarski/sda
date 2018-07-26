package PrintHouse.service;

import PrintHouse.model.Order;
import PrintHouse.repository.OrderRepository;

import java.util.List;

public class OrderService {


    private OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public void save(Order order) {
        repository.save(order);
    }

    public List<Order> getByUserId(int id) {
        return repository.getByUserId(id);

    }

    public List<Order> getById(int id) {
        return repository.getById(id);

    }

    public List<Order> getAll() {
        return repository.getAll();
    }
}
