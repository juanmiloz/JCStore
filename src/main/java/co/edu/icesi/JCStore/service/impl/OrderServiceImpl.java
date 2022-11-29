package co.edu.icesi.JCStore.service.impl;

import co.edu.icesi.JCStore.model.Order;
import co.edu.icesi.JCStore.repository.OrderRepository;
import co.edu.icesi.JCStore.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    public final OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        return StreamSupport.stream(orderRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public Order getOrder(UUID orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    public Order updateOrderStatus(UUID orderId, Order order) {
        Order updatedOrder = orderRepository.findById(orderId).orElse(null);
        if(updatedOrder != null){
            updatedOrder.setStatus(order.getStatus());
        }
        return updatedOrder;
    }
}
