package co.edu.icesi.JCStore.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Table(name = "`orders`")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @Type(type = "org.hibernate.type.PostgresUUIDType")
    private UUID orderId;

    @Column(name = "total")
    private double total;

    @Column(name = "status")
    private String status;

    /*@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    }, fetch = FetchType.EAGER)
    @JoinTable(
            name = "order_item",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> orderItems;*/

    @ManyToOne(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE
    }, fetch = FetchType.EAGER, targetEntity = User.class)
    @JoinColumn(name = "id")
    @Type(type = "org.hibernate.type.PostgresUUIDType")
    private UUID userId;

}