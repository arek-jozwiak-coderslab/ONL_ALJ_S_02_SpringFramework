package pl.coderslab.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/start")
public class HomeController {

    Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    @ResponseBody
    public String home() {
        int a = 5;
        int b = 15;
        log.info("home {} qweqw  {}", a , b);
        return "hello world";
    }

    @GetMapping("/home")
    @ResponseBody
    public String home2() {
        return "hello world";
    }

}
