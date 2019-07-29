package pl.coderslab.lesinski.piotr.service;

import pl.coderslab.lesinski.piotr.dto.UserDto;
import pl.coderslab.lesinski.piotr.model.User;

import java.util.List;

public interface UserService {


    void saveUser(UserDto userDto);

    void editUser(UserDto userDto);

    User findByName(String name);

    UserDto findByUser(String name);

    List<UserDto> showAllUsers();

    void deleteUser(Long id);
}
