package pl.coderslab.lesinski.piotr.dto;

import lombok.Data;
import pl.coderslab.lesinski.piotr.model.Task;
import pl.coderslab.lesinski.piotr.model.TaskStatus;
import pl.coderslab.lesinski.piotr.model.TaskType;
import pl.coderslab.lesinski.piotr.model.User;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
public class TaskDto {

    private String id;
    private User user;
    private TaskType type;
    private TaskStatus taskStatusId;
    private String title;
    private String description;
    private String planningStartDate;
    private String planningEndDate;
    private String endedDate;

    public TaskDto () {
    }

    public TaskDto(Task that) {
        this.id = that.getId().toString();
        this.user = that.getUser();
        this.type = that.getType();
        this.taskStatusId = that.getTaskStatusId();
        this.title = that.getTitle();
        this.description = that.getDescription();
        this.planningStartDate = that.getPlanningStartDate().toString();
        this.planningEndDate = that.getPlanningEndDate().toString();
        this.endedDate = that.getEndedDate().toString();
    }
}
