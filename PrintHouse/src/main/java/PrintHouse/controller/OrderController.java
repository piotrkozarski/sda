package PrintHouse.controller;

import PrintHouse.model.Material;
import PrintHouse.model.Order;
import PrintHouse.model.OrderedProduct;
import PrintHouse.model.Product;
import PrintHouse.service.MaterialService;
import PrintHouse.service.OrderService;

import java.util.List;

public class OrderController {
    private OrderService service;


    private OrderService orderService;
    private MaterialService materialService;

    public OrderController(OrderService orderService, MaterialService materialService) {
        this.orderService = orderService;
        this.materialService = materialService;
    }

    public void create(Order order) {
        List<OrderedProduct> orderedProducts = order.getOrderedProducts();
        if (correctOrderedProducts(orderedProducts)) {
            orderService.save(order);
        }
    }

    private boolean correctOrderedProducts(List<OrderedProduct> orderedProducts) {
        for (OrderedProduct orderedProduct : orderedProducts) {
            List<Material> possibleMaterials = materialService.getByProduct(orderedProduct.getProduct());
            if (possibleMaterials.contains(orderedProduct.getMaterial())) {
                return true;
            }
        }
        return false;
    }
}
