package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//만약에 여기서 Controller라고 하면 spring에서 view로 리턴을하는데
//RestController로 하면 그냥 반환타입으로 그냥 반환을 해준다
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        log.info(" info log={}",name);
        return "ok";
    }
}
