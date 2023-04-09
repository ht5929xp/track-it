package trackit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import trackit.services.UserService;

@RequestMapping("login")
@Controller
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"/", "", "index", "Index"})
    public String main(){
        return "";
    }
}
