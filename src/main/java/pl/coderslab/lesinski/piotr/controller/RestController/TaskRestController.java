package pl.coderslab.lesinski.piotr.controller.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.lesinski.piotr.model.Task;
import pl.coderslab.lesinski.piotr.model.TaskStatus;
import pl.coderslab.lesinski.piotr.model.TaskType;
import pl.coderslab.lesinski.piotr.model.User;
import pl.coderslab.lesinski.piotr.service.TaskService;


@Controller
@RequestMapping("/api/task")
public class TaskRestController {

    private TaskService taskService;

    @GetMapping("/list")
    public String  hello(){
        return "tasklist";
    }

    private Task task;
    private TaskStatus taskStatus;
    private TaskType taskType;


    public TaskRestController() {
    }

    public TaskRestController(Task task, TaskStatus taskStatus, TaskType taskType) {
        this.task = task;
        this.taskStatus = taskStatus;
        this.taskType = taskType;
    }

    @GetMapping("/create")
    public Task createTask(@RequestParam String title,
                           @RequestParam String description,
                           @RequestParam User user){
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setUser(user);

        taskService.saveTask(task);
        return task;
    }

}
////
//public Book createBook(@RequestParam String title,
//                       @RequestParam String description,
//                       @RequestParam Long publisherId) {
//    Publisher publisher = publisherDao.findOneById(publisherId);
//
//    Book book = new Book();
//    book.setTitle(title);
//    book.setPublisher(publisher);
//    book.setDescription(description);
//
//    bookDao.saveBook(book);
//
//    return book;
//}