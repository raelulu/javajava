package sesac.sesac_gorae.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping()
    public String getHi(Model model){
        model.addAttribute("msg","HELLO!");
        return  "hi";
    }
}
