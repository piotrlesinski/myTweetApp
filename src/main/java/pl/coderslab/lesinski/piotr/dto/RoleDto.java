package pl.coderslab.lesinski.piotr.dto;

import lombok.Data;
import pl.coderslab.lesinski.piotr.model.Role;

@Data
public class RoleDto {

    private Long id;
    private String name;

    public RoleDto () {
    }

    public RoleDto(Role that) {
        this.id = that.getId();
        this.name = that.getName();
    }
}
