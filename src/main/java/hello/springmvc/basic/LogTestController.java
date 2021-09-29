package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // LOMBOK 에서 자동으로 지원을 해준다
@RestController
//만약에 여기서 Controller라고 하면 spring에서 view로 리턴을하는데
//RestController로 하면 그냥 반환타입으로 그냥 반환을 해준다
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.trace("trace log={}",name);//레벨이 제일높다 그리고 점점 낮아진다
        log.debug("debug log={}",name);
        log.info(" info log={}",name);
        log.warn("warn log={}",name);
        log.error("error log={}",name);


        return "ok";
    }
}
