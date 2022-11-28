package co.edu.icesi.JCStore.controller;

import co.edu.icesi.JCStore.api.UserApi;
import co.edu.icesi.JCStore.dto.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController implements UserApi {


    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return null;
    }

    private void verifyEmailOrPhone(UserDTO userDTO){
        
    }

}
