package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") //Controller 부터 홈화면 확인 후 없으면 static
    public String home() {
        return "home";
    }
}
