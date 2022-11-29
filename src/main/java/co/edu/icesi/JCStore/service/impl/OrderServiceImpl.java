package co.edu.icesi.JCStore.service.impl;

import co.edu.icesi.JCStore.model.Order;
import co.edu.icesi.JCStore.repository.OrderRepository;
import co.edu.icesi.JCStore.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    public final OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return null;
    }

    @Override
    public List<Order> getOrders() {
        return null;
    }

    @Override
    public Order getOrder(UUID orderId) {
        return null;
    }
}
