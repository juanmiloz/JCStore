package co.edu.icesi.JCStore.mapper;

import co.edu.icesi.JCStore.dto.UserDTO;
import co.edu.icesi.JCStore.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User fromDTO(UserDTO userDTO);
    UserDTO fromUser(User user);

}
