package tobyspring.myboot;

import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RequestMapping
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello(String name) {
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
