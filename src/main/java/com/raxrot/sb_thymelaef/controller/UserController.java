package com.raxrot.sb_thymelaef.controller;

import com.raxrot.sb_thymelaef.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("message-exp")
    public String messageExp() {
        return "message-exp";
    }

    @GetMapping("link-exp")
    public String linkExp() {
        return "link-exp";
    }

    @GetMapping("/users")
    public String users(Model model) {
        List<User> users = getUsers();
        model.addAttribute("users", users);
        return "users";
    }


    @GetMapping("if")
    public String ifExp(Model model) {
        List<User> users = getUsers();
        model.addAttribute("users", users);
        return "if";
    }

    private static List<User> getUsers() {
        User user = new User("Vlad","das@gmail.com","ADMIN","male");
        User user1= new User("Daria","adeaw@gmail.com","Lol","female");
        User user2=new User("Oleg","defawf@gmail.com","lox","male");
        List<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        return users;
    }
}
