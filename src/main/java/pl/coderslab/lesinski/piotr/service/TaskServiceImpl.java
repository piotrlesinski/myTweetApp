package pl.coderslab.lesinski.piotr.service;

import org.springframework.stereotype.Service;
import pl.coderslab.lesinski.piotr.repository.TaskRepository;

@Service
public class TaskServiceImpl {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}
