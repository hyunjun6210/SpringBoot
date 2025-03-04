package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello") //WEBADDR/hello maping
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello"; //resources/templates/hello(view name).html 로 rendering
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) { //require == false로 하면 default 값이 true 라 ?name="VALUE" 로 값 넘겨줌
        model.addAttribute("name", name);
        return "hello-template";
    }
}
