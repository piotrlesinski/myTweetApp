package pl.coderslab.lesinski.piotr.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.lesinski.piotr.dto.RoleDto;
import pl.coderslab.lesinski.piotr.service.RoleService;

@Controller
@RequestMapping("/role")
@Log4j2
public class RoleViewController {

    private RoleService roleService;

    @Autowired
    public RoleViewController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/add")
    public String addRole(Model model){
        model.addAttribute("role", new RoleDto());
        log.info("addRole working :-)");
        return "role/add_role";
    }

    @GetMapping("/all")
    public String allRoles(Model model) {
        model.addAttribute("roles", roleService.findAllRoles());
        return "all_roles";
    }



}
