package trackit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import trackit.model.User;
import trackit.services.UserService;

import java.util.Set;

@Controller
@RequestMapping({"users"})
public class UserController {
    
    private final UserService UserService;

    public UserController(UserService UserService) {
        this.UserService = UserService;
    }
    
    @RequestMapping({"/", ""})
    public String getUsers(Model model){
        Set<User> users = UserService.findAll();
        
        model.addAttribute("users", users);
        
        return "users/usersList";
    }
}
