package com.raxrot.sb_thymelaef.controller;

import com.raxrot.sb_thymelaef.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("variable-exp")
    public String variableExp(Model model) {
        User user = new User("Vlad","das@gmail.com","ADMIN","male");
        model.addAttribute("user", user);
        return "variable-exp";
    }

    @GetMapping("selection-exp")
    public String selectionExp(Model model) {
        User user = new User("Vlad","das@gmail.com","ADMIN","male");
        model.addAttribute("user", user);
        return "selection-exp";
    }
}
