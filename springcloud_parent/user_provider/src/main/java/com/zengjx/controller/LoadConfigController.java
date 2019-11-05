package com.zengjx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/5  14:52
 * @Version V1.0
 */
@RestController
@RequestMapping(value = "config")
@RefreshScope// 用于启用刷新配置文件信息
public class LoadConfigController {
   @Value("${test.message}")
    private String msg;
   @Value("${test.message2}")
/***
 * 读取配置文件数据
 */
@RequestMapping(value = "load")
public String load(){
    return msg;
}


@RequestMapping(value = "load2")
public  String  laod2(){

    return   msg;
}

}
