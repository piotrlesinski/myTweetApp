package pl.coderslab.lesinski.piotr.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "task_status")
public class TaskStatus{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status", length = 20)
    @NotNull
    private String statusTaskName;

}
