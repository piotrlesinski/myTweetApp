package pl.coderslab.lesinski.piotr.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import pl.coderslab.lesinski.piotr.dto.UserDto;
import pl.coderslab.lesinski.piotr.model.Role;
import pl.coderslab.lesinski.piotr.model.User;
import pl.coderslab.lesinski.piotr.repository.RoleRepository;
import pl.coderslab.lesinski.piotr.repository.UserRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
                           BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void saveUser (UserDto userDto) {
        User user = new User( );
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUser(userDto.getUser());
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setEnabled(true);
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }

    @Override
    public void editUser(UserDto userDto) {
        User userEdited = userRepository.getOne(userDto.getId());
        userEdited.setFirstName(userDto.getFirstName());
        userEdited.setLastName(userDto.getLastName());
        userEdited.setUser(userDto.getUser());
        userEdited.setEmail(userDto.getEmail());
        userEdited.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userEdited.setEnabled(true);
        Role userRole = roleRepository.findByName("ROLE_USER");
        userEdited.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(userEdited);
    }


    @Override
    public UserDto findByUser(String username) {
        User user = userRepository.findByUser(username);
        return new UserDto(user);
    }


    public User findByName(String username) {
        return userRepository.findByUser(username);
    }

    @Override
    public List<UserDto> showAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
