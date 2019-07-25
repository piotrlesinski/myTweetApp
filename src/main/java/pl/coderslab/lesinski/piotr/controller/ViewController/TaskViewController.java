package pl.coderslab.lesinski.piotr.controller.ViewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.lesinski.piotr.model.Task;
import pl.coderslab.lesinski.piotr.model.TaskStatus;
import pl.coderslab.lesinski.piotr.model.TaskType;

@Controller
public class TaskViewController {

    private Task task;
    private TaskStatus taskStatus;
    private TaskType taskType;


    public TaskViewController() {
    }

    public TaskViewController(Task task, TaskStatus taskStatus, TaskType taskType) {
        this.task = task;
        this.taskStatus = taskStatus;
        this.taskType = taskType;
    }

    @GetMapping("/createtask")
    public String createTaskView(Model model){
        model.addAttribute("task", new Task());
        return "task/addtask";
    }
}

//    @GetMapping("/create_book")
//    public String createBookView(Model model) {
//        model.addAttribute("book", new Book());
//        return "create_book";
//    }
