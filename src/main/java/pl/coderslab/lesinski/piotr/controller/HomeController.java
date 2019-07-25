package pl.coderslab.lesinski.piotr.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/home")
    public String  hello(){
        log.info("info message");
        log.error("error message");
        log.warn("warn message");
        return "home";

    }
}
