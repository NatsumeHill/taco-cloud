package cn.edu.ustc.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 该注解的主要目的是告知组件扫描，这个类是一个组件；和其他类似的注解@Component,@Service,
 * @Repository没有什么区别，甚至这里直接将注解替换为任何其他上面提到的注解并不会产生任何影
 * 响，应用将会正常启动.这里之所以使用@Controller，是为了能表明该类所处的角色。
 */
@Controller
public class IndexController{
    @GetMapping("/")
    public String index(){
        return "index";
    }
}