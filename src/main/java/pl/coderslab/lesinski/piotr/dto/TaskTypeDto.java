package pl.coderslab.lesinski.piotr.dto;

import lombok.Data;
import pl.coderslab.lesinski.piotr.model.TaskType;


@Data
public class TaskTypeDto {

    private String id;
    private String taskName;

    public TaskTypeDto () {
    }

    public TaskTypeDto(TaskType that) {
        this.id = that.getId().toString();
        this.taskName = that.getTaskName();
    }
}
