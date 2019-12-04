package com.example.demo.controller;

import com.example.demo.bean.Test;
import com.example.demo.mapper.SqlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("sql")
public class sql {

    @Resource
    private SqlMapper sqlMapper;

    @RequestMapping("/find")
    public void find(){
        Test test= sqlMapper.find();
        System.out.println(test.getId());
        System.out.println(test.getName());
    }
}
