package pl.coderslab.lesinski.piotr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.lesinski.piotr.model.Role;
import pl.coderslab.lesinski.piotr.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleViewController {

    private RoleService roleService;

    @Autowired
    public RoleViewController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/add")
    @ResponseBody
    public String addRole(Model model){
        model.addAttribute("role", new Role());
        //return "role/add_role";
        return "addRole working :-)";
    }
}
