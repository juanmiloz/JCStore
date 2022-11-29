package co.edu.icesi.JCStore.service;

import co.edu.icesi.JCStore.model.Order;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    public Order createOrder(@PathVariable Order order);

    public List<Order> getOrders();

    public Order getOrder(@PathVariable UUID orderId);
}
