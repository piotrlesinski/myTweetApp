package pl.coderslab.lesinski.piotr.controller.RestController;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.lesinski.piotr.dto.UserDto;
import pl.coderslab.lesinski.piotr.model.User;
import pl.coderslab.lesinski.piotr.service.UserService;

import javax.validation.Valid;

@Controller
@Slf4j
@RequestMapping("/api/user")
public class UserRestController {

    private Logger LOG = LoggerFactory.getLogger(UserRestController.class);
    private UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }
    //admin tworzony jako pierwszy na potrzebę uruchomienia widoku logowania za Spring Boot
    @GetMapping("/addadmin")
    @ResponseBody
    public String createAdmin(Model model) {
        User user = new User( );
        userService.createAdmin(user);
        model.addAttribute("user", new UserDto(user));
        return "allusers";
    }

    @PutMapping("/add")
    public String addUser(@ModelAttribute("user") @Valid UserDto userDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error(bindingResult.toString());
            return "redirect:api/user/add";
        }
        userService.saveUser(userDto);
        return "redirect:api/user/all";
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        model.addAttribute("users", userService.showAllUsers());
        return "/allusers";
    }


    @PostMapping("/edit")
    public String editUserDone(@ModelAttribute(name = "user")
                               @Valid UserDto userDto,
                               BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            log.error(bindingResult.toString());
            return "redirect:/api/user/all";
        }
        userService.editUser(userDto);
        return "redirect:api/user/all";
    }


    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
//        User user = userService.findUserById(id);
//        user.setTaks(new HashSet<>());        //rozw. Uli. Dodać jeśli trzeba by było usunąć wszystkie taski
//        userService.save(user);               //powiązane z urzytkownikiem
        userService.deleteUser(id);
        return "redirect:api/user/all";
    }


}
