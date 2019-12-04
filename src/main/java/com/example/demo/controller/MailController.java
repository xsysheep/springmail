package com.example.demo.controller;

import com.example.demo.bean.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeUtility;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("mail")
public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;

   /* @Resource
    private Email email;*/


    @RequestMapping("/sendmail")
    public void sendmail(String date) throws UnsupportedEncodingException {

        //临时写死
        //String message = email.getMessage();
        StringBuffer messagebuffer = new StringBuffer();
        messagebuffer.append("xx");
        messagebuffer.append("您好！\n" +
                "\n" +
                "这里是北京新松融通机器人科技有限公司人力资源部，很荣幸与您电话沟通交流，特邀您来我公司参加面试，现将具体情况如下：\n" +
                "\n" +
                "1、面试时间：");
        messagebuffer.append(date+"\n");
        messagebuffer.append("2、面试地址：北京市丰台区丰台科技园汉威国际广场4区三号楼二层\n" +
                "\n" +
                "请您准时参加，如因其他原因无法前来面试，请提前以邮件或电话形式告知，谢谢！\n" +
                "\n" +
                "备注：参加面试，请携带一份简历,谢谢配合！\n" +
                "\n" +
                "乘车路线：\n" +
                "\n" +
                "乘坐地铁9号线在丰台科技园站下车D口出（向南走）\n" +
                "\n" +
                "联系电话： 15810826192\n" +
                "\n" +
                "联 系 人：\n" +
                "\n" +
                "人力资源管理中心（袁静）\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "                                                   北京新松融通机器人有限公司");
        String sendName = MimeUtility.encodeText("联创瑞鑫");

        try{
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            //simpleMailMessage .setFrom(String.valueOf(new InternetAddress(sendName+"170584078@qq.com")));
            simpleMailMessage.setFrom(String.valueOf(new InternetAddress("170584078@qq.com", "联创瑞鑫", "UTF-8")));
            simpleMailMessage .setTo("170584078@qq.com");
            simpleMailMessage.setBcc("170584078@qq.com");
            simpleMailMessage.setCc("170584078@qq.com");
            simpleMailMessage.setSubject("面试邀约");
            simpleMailMessage.setText(messagebuffer.toString());
            javaMailSender.send(simpleMailMessage);//发送
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
