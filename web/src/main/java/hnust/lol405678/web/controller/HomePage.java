package hnust.lol405678.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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
    public String toHomePage(Model model) {
        model.addAttribute("admin", "zl1112323");
        return "home";
    }

    /**
     * 用户登录
     *
     * @param userName 用户名
     * @param password 用户密码
     * */
    @ResponseBody
    @PostMapping("/login")
    public Map<String, Object> login(@RequestParam String userName, @RequestParam String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {

            if (StringUtils.isBlank(userName)) {
                map.put("msg", "用户名不能为空");
                map.put("code", "300");
                return map;
            }

            if (StringUtils.isBlank(password)) {
                map.put("msg", "密码不能为空");
                map.put("code", "300");
                return map;
            }

            map.put("msg", "登录成功");
            map.put("code", "200");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 用户注册
     *
     * @param userNameNew 用户名
     * @param passwordNew 用户密码
     * @param verifyCode 验证码
     * */
    @ResponseBody
    @PostMapping("/register")
    public Map<String, Object> register(@RequestParam String userNameNew, @RequestParam String passwordNew, @RequestParam String verifyCode) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {

            if (StringUtils.isBlank(userNameNew)) {
                map.put("msg", "用户名不能为空");
                map.put("code", "300");
                return map;
            }

            if (StringUtils.isBlank(passwordNew)) {
                map.put("msg", "密码不能为空");
                map.put("code", "300");
                return map;
            }

            if (StringUtils.isBlank(verifyCode)) {
                map.put("msg", "验证码为空");
                map.put("code", "300");
                return map;
            }

            map.put("msg", "注册成功");
            map.put("code", "200");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
