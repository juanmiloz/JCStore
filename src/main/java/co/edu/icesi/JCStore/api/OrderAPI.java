package co.edu.icesi.JCStore.api;

import co.edu.icesi.JCStore.dto.OrderDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/order")
public interface OrderAPI {

    @PostMapping
    public OrderDTO createOrder(@RequestBody OrderDTO orderDTO);

    @GetMapping
    public List<OrderDTO> getOrders();

    @GetMapping("/{orderId}")
    public OrderDTO getOrderDTO(@PathVariable UUID orderId);

    @PatchMapping("/{orderId}")
    public OrderDTO updateOrderStatus(@PathVariable UUID orderId, @RequestBody OrderDTO orderDTO);
}
