package pl.coderslab.lesinski.piotr.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.lesinski.piotr.dto.RoleDto;
import pl.coderslab.lesinski.piotr.service.RoleService;

@RequestMapping("/role")
public class RoleRestController {

    private RoleService roleService;

    @PostMapping("/add")
    public String addRole(RoleDto roleDto) {
        roleService.createRole(roleDto);
        return "redirect:/role/all";
    }

}