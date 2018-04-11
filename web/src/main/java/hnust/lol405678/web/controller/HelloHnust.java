package hnust.lol405678.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panxin
 */
@RequestMapping
@RestController
public class HelloHnust {

    @GetMapping("/index")
    public String hello() {
        return "你好呀, 很高兴见到你 :)";
    }

    @GetMapping("/lol/hnust/{name}")
    public String hello(@PathVariable String name) {
        return "哟 >>>>> " + name;
    }

}
