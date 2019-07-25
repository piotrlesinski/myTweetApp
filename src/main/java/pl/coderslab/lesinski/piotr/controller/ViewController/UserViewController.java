package pl.coderslab.lesinski.piotr.controller.ViewController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.coderslab.lesinski.piotr.dto.UserDto;
import pl.coderslab.lesinski.piotr.service.UserService;

@Controller
public class UserViewController {


    private UserService userService;

    @Autowired
    public UserViewController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/api/user/add")
    public String addUser(Model model) {
        model.addAttribute("user", new UserDto( ));
        return "adduser";
    }

    @GetMapping("/api/user/all")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.showAllUsers());
        return "all_users";
    }

    @GetMapping("/api/user/edit/{id}")
    public String editUser(@PathVariable("id")Long id, Model model){
        model.addAttribute("user", userService.findUserById(id));
        return "edituser";
    }
}
