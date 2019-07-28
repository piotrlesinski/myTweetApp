package pl.coderslab.lesinski.piotr.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.lesinski.piotr.dto.RoleDto;
import pl.coderslab.lesinski.piotr.model.Role;
import pl.coderslab.lesinski.piotr.repository.RoleRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void createRole (RoleDto roleDto) {
        Role role = new Role();
        role.setName(roleDto.getName());
        roleRepository.save(role);
    }

//    public RoleDto createRole(Role role) {
//        Role newRole = roleRepository.save(role);
//        return new RoleDto(newRole);
//    }
  


    public void editRole (RoleDto roleDto) {
        Role editedRole = new Role();
        editedRole.setId(roleDto.getId());
        editedRole.setName(roleDto.getName());
        roleRepository.save(editedRole);
    }

//    public RoleDto findRoleById(Long id) {
//        Role role = roleRepository.findOne(id).);
////inferred type 'S' for parameter 'S' is not within its bound; should extend model.Role
//        return new RoleDto(role);
//    }


    public List<RoleDto> findAllRoles(){
        List<Role> roles = roleRepository.findAll();
        return roles.stream()
                .map(RoleDto::new)
                .collect(Collectors.toList());
    }

    public void deleateRole(Long id){
        roleRepository.deleteById(id);
    }
}
