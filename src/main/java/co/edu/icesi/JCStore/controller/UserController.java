package co.edu.icesi.JCStore.controller;

import co.edu.icesi.JCStore.api.UserApi;
import co.edu.icesi.JCStore.constants.CodesError;
import co.edu.icesi.JCStore.dto.UserDTO;
import co.edu.icesi.JCStore.error.exception.UserDemoError;
import co.edu.icesi.JCStore.error.exception.UserDemoException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController implements UserApi {


    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return null;
    }

    private void verifyEmailOrPhone(UserDTO userDTO){
        if(userDTO.getEmail() == null && userDTO.getPhone() == null){
            throw new UserDemoException(HttpStatus.BAD_REQUEST,
                    new UserDemoError(CodesError.CODE_O1.getCode(),CodesError.CODE_O1.getMessage()));
        }
    }

}
