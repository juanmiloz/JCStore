package co.edu.icesi.JCStore.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    private UUID orderItemId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "order_id")
    private UUID orderId;

    @Column(name = "item_id")
    private UUID itemId;
}
