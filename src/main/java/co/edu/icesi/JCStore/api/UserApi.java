package co.edu.icesi.JCStore.api;

import co.edu.icesi.JCStore.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
public interface UserApi {

    @PostMapping()
    UserDTO createUser(@RequestBody UserDTO userDTO);

}
