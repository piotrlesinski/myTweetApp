package pl.coderslab.lesinski.piotr.dto;

import lombok.Data;
import pl.coderslab.lesinski.piotr.model.TaskStatus;

@Data
public class TaskStatusDto {

    private String id;
    private String statusTaskName;

    public TaskStatusDto () {
    }

    public TaskStatusDto(TaskStatus that) {
        this.id = that.getId().toString();
        this.statusTaskName = that.getStatusTaskName();
    }
}
