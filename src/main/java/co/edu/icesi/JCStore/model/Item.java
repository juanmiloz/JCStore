package co.edu.icesi.JCStore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Table(name = "item")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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

    @Column(name = "url")
    private String url;

    @PrePersist
    public void generateId() { this.itemId = UUID.randomUUID();}

}
