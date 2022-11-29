package co.edu.icesi.JCStore.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "user_permission")
@Entity
@Data
public class Permission {

    @Id
    @Type(type="org.hibernate.type.PostgresUUIDType")
    private UUID permissionId;

    private String uri;

    private String permissionKey;

    @Column(name = "permission_method")
    private String method;
}
