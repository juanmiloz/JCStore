package co.edu.icesi.JCStore.service.impl;

import co.edu.icesi.JCStore.model.Role;
import co.edu.icesi.JCStore.model.User;
import co.edu.icesi.JCStore.repository.RoleRepository;
import co.edu.icesi.JCStore.repository.UserRepository;
import co.edu.icesi.JCStore.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;


    @Override
    public User createUser(User user, UUID roleId) {
        Role role = roleRepository.findById(roleId).orElseThrow();
        user.setRole(role);

        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
