package pl.coderslab.lesinski.piotr.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.coderslab.lesinski.piotr.dto.UserDto;
import pl.coderslab.lesinski.piotr.model.Role;
import pl.coderslab.lesinski.piotr.model.User;
import pl.coderslab.lesinski.piotr.repository.RoleRepository;
import pl.coderslab.lesinski.piotr.repository.UserRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService{


    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, RoleRepository roleRepository,
                       BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }


    public UserDto saveUser (UserDto userDto) {
        User user = new User( );
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setEnabled(true);
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);

        return new UserDto(user);
    }

    public UserDto editUser(UserDto userDto) {

        User userEdited = userRepository.findByUser(userDto.getId());
        userEdited.setFirstName(userDto.getFirstName());
        userEdited.setLastName(userDto.getLastName());
        userEdited.setEmail(userDto.getEmail());
        userEdited.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userEdited.setEnabled(true);
        Role userRole = roleRepository.findByName("ROLE_USER");
        userEdited.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(userEdited);

        return new UserDto(userEdited);
    }

    public UserDto findUserById(Long id) {
        User user = userRepository.findByUser(id);
        return new UserDto(user);
    }

    public List<UserDto> showAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserDto::new)
                .collect(Collectors.toList());
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


    public void createAdmin(User user) {
        user.setFirstName("admin");
        user.setLastName("admin");
        user.setEmail("abc@g.pl");
        user.setPassword("admin");
        user.setEnabled(true);
        userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}

//    public UserDto findUserById(Long id) {
//        User user = userRepository.findByUser(id);
//        return new UserDto(user);
//    }

//    public UserDto editUser(UserDto userDto) {
//
//        User userEdited = userRepository.findByUser(userDto.getId());
//        userEdited.setFirstName(userDto.getFirstName());
//        userEdited.setLastName(userDto.getLastName());
//        userEdited.setEmail(userDto.getEmail());
//        userEdited.setPassword(passwordEncoder.encode(userDto.getPassword()));
//        userEdited.setEnabled(true);
//        Role userRole = roleRepository.findByName("ROLE_USER");
//        userEdited.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
//        userRepository.save(userEdited);
//
//        return new UserDto(userEdited);
//    }