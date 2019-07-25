package pl.coderslab.lesinski.piotr.service;

import pl.coderslab.lesinski.piotr.model.Task;

public interface TaskService {

    Task findAllByUserId(String id);

    void saveTask (Task task);



}
