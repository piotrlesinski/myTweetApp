package pl.coderslab.lesinski.piotr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.lesinski.piotr.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    User findByUser(String username);
}
