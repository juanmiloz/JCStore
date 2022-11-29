package co.edu.icesi.JCStore.repository;

import co.edu.icesi.JCStore.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<Order, UUID> {
}
