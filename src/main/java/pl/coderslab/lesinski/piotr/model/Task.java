package pl.coderslab.lesinski.piotr.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "task")
public class Task{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private TaskType type;

   @ManyToOne
    private TaskStatus taskStatusId;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "description", length = 1000)
    private String description;

    private LocalDateTime planningStartDate;
    private LocalDateTime planningEndDate;
    private LocalDateTime endedDate;



}

