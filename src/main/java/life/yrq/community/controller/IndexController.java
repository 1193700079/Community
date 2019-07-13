package life.yrq.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @param null
 * @return
 * @author yangruiqing
 * @creed: Talk is cheap,show me the code
 * @date 2019/7/13 16:29
 */

@Controller
public class IndexController {
    @GetMapping("/")    //表示根目录
    public String Index(){
        return  "index";
    }
}
