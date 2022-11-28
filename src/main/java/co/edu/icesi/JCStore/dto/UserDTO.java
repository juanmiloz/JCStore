package co.edu.icesi.JCStore.dto;

import co.edu.icesi.JCStore.model.Role;
import com.sun.istack.NotNull;

import java.util.UUID;

public class UserDTO {

    private UUID id;

    @NotNull
    private String name;

    private String email;

    private String password;

    private String address;

    private String phone;

    @NotNull
    private Role role;

}
