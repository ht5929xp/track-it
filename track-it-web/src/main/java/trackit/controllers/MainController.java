package trackit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping({"/", "", "index", "Index", "home", "Home", "main"})
    public String main(){
        return "index";
    }
}
