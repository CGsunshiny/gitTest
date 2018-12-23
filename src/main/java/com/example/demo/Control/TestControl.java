package com.example.demo.Control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping("/test")
public class TestControl {

    @RequestMapping("/use_git")
    public String gitTest(){

        return "你好这是我的第一次使用git在idea上面2232333";

    }

}
