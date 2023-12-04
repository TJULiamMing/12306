package train.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 这个注解表明这个控制器的每个方法都会返回响应体
public class TestController {
    @GetMapping("/hello")
    public String hello() {return "Hello World!";}

}
