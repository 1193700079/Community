package life.yrq.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yangruiqing
 * @creed: Talk is cheap,show me the code
 * @date 2019/7/13 14:14
 */

@Controller
public class HelloController {

    @GetMapping("/hello")      //@GetMapping("/hello") 表示服务器所访问的hello 路径
    public String Hello(@RequestParam(name ="name") String name, Model model){
        //@RequestParam 表示服务器接收到的参数
        model.addAttribute("name",name);  //将参数要注入视图模型之中
        return "index";  //自动去templates找hello模板
    }
}
