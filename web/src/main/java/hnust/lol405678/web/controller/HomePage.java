package hnust.lol405678.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页
 *
 * @author zl
 * @since 2018年4月18日23:26:39
 * */
@Controller
@RequestMapping
public class HomePage {
    /**
     * 跳转主页
     * */
    @GetMapping("/goHome")
    public String toHomePage() {
        return "home";
    }
}
