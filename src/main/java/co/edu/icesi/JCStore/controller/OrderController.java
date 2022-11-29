package co.edu.icesi.JCStore.controller;

import co.edu.icesi.JCStore.api.OrderAPI;
import co.edu.icesi.JCStore.dto.OrderDTO;
import co.edu.icesi.JCStore.mapper.OrderMapper;
import co.edu.icesi.JCStore.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
public class OrderController implements OrderAPI {

    public final OrderService orderService;
    public final OrderMapper orderMapper;

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public List<OrderDTO> getOrders() {
        return null;
    }

    @Override
    public OrderDTO getOrderDTO(UUID orderId) {
        return null;
    }
}
