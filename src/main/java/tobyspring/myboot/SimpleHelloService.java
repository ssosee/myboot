package tobyspring.myboot;

public class SimpleHelloService implements HelloService {
    public String sayHello(String name) {
        return "hello "+ name;
    }
}
