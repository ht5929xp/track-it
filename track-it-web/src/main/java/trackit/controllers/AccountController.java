package trackit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("account")
@Controller
public class AccountController {

    @RequestMapping({"/", ""})
    public String main(){
        return "account/form";
    }
}
