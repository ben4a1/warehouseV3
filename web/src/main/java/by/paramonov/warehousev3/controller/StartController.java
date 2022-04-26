package by.paramonov.warehousev3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping("/start")
    public String start(@RequestParam(required = false) String name) {
        return "Hello, " + name;
    }
}
