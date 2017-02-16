package io.muic.ooc.spring.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by DevSingh on 2/16/17.
 */
@Controller
public class HelloController {

    @GetMapping(value={"/","/hello"},headers=("text/html"))
    public String index(Model model){
        model.addAttribute("username","admin");
        return "hello";
    }

    @GetMapping("/xxx")
    public String method(Model model){
        model.addAttribute("username","xxx");
        return "hello";
    }

}
