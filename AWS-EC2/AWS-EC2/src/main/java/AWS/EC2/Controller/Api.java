package AWS.EC2.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    public String hello(){
        return "Hello World";
    }
}
