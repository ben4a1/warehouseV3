package by.paramonov.warehousev3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StartController {
private final UserService
    @GetMapping("/start")
    public String start(@RequestParam(required = false) String name) {
        return "Hello, " + name;
    }
}
