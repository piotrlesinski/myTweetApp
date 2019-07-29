package pl.coderslab.lesinski.piotr.model;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Data
@Table(name = "user")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "firstname")
    private String firstName;

    @NotNull
    @Column(name = "lastname")
    private String lastName;

    @Column(unique = true)
    @UniqueElements
    private String user;

    @Column(nullable = true, unique = true)
    @Email
    @UniqueElements
    private String email;

    private String password;

    private boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Role> roles;

}
