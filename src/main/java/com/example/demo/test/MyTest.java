package com.example.demo.test;

import com.example.demo.controller.QQmailController;

public class MyTest {

    public static void main(String[] args) {
        StringBuilder emailContent = new StringBuilder("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>快来买桃子</title><style type='text/css'>        .container{            font-family: 'Microsoft YaHei';            width: 600px;            margin: 0 auto;            padding: 8px;            border: 3px dashed #db303f;            border-radius: 6px;        }        .title{            text-align: center;            color: #db303f;        }        .content{            text-align: justify;            color: #717273;            font-weight: 600;        }        footer{            text-align: right;            color: #db303f;            font-weight: 600;            font-size: 18px;        }</style></head><body><div class='container'><h2 class='title'>好吃的桃子</h2><p class='content'>桃子含有维生素A、维生素B和维生素C,儿童多吃桃子可使身体健康成长,因为桃子含有的多种维生索可以直接强化他们的身体和智力。</p><footer>联系桃子：11110000</footer></div></body></html>");
        QQmailController qQmailController = new QQmailController("170584078@qq.com", "面试邀约", emailContent.toString(), "D:\\下载.jpg");
        qQmailController.send();

    }

}