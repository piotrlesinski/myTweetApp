package pl.coderslab.lesinski.piotr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.lesinski.piotr.model.Drink;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {

}
