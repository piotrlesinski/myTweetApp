package pl.coderslab.lesinski.piotr.dto;

import lombok.Data;
import pl.coderslab.lesinski.piotr.model.Role;
import pl.coderslab.lesinski.piotr.model.User;
import java.util.Set;

@Data
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String user;
    private String email;
    private String password;
    private boolean enabled;
    private Set<Role> roles;

    public UserDto() {
    }

    public UserDto(User that) {
        this.id = that.getId();
        this.firstName = that.getFirstName();
        this.lastName = that.getLastName();
        this.user = that.getUser();
        this.email = that.getEmail();
        this.password = that.getPassword();
        this.enabled = that.isEnabled();
        this.roles = that.getRoles();
    }
}
