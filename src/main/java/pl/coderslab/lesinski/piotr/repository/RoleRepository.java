package pl.coderslab.lesinski.piotr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.lesinski.piotr.model.Role;


public interface RoleRepository extends JpaRepository <Role, Long> {
}
