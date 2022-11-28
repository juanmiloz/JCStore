package co.edu.icesi.JCStore.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Table(name = "item")
@Entity
public class Item {

    @Id
    @Type(type = "org.hibernate.type.PostgresUUIDType")
    private UUID itemId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @PrePersist
    public void generateId() { this.itemId = UUID.randomUUID();}

}
