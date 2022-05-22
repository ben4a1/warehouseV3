package by.paramonov.warehousev3.controller;

import by.paramonov.warehousev3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {

   private final UserService userService;

   @Autowired
    public StartController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/")
    public String startPage(Model model){
       return "start";
    }
}
