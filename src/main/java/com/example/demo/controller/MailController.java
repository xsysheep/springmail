package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/mail")
public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping("/sendmail")
    public void sendmail(){
        try{
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage .setFrom("170584078@qq.com");
            simpleMailMessage .setTo("170584078@qq.com");
            simpleMailMessage.setSubject("主题");
            simpleMailMessage.setText("内容");
            javaMailSender.send(simpleMailMessage);//发送
        }catch(Exception e){

        }
        System.out.println("hello");
    }
}
