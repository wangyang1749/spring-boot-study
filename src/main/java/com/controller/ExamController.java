package com.controller;

import com.pojo.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExamController {

    @RequestMapping("/hello")
    public R hello(){
        return R.ok("success");
    }
}
