package pl.coderslab.lesinski.piotr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.lesinski.piotr.model.Task;

import java.time.LocalDateTime;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Task findAllByUserId(Long id);
    Task findAllByPlanningStartDate(LocalDateTime planningStartDate);
    Task findAllByPlanningEndDate(LocalDateTime planningEndDate);
    Task findAllByEndedDate(LocalDateTime endedDate);

}
