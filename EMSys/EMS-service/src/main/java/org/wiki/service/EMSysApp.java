package org.wiki.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Packagename: org.wiki.service
 * @Classname: EMSysApp
 * @Description: 程序主入口
 * @Author: WiKi
 * @Date: 23/08/17 2:22 PM
 */
@SpringBootApplication
public class EMSysApp {
    
    public static void main(String[] args) {
        SpringApplication.run(EMSysApp.class, args);
        System.out.println("EMSys启动成功！");
    }
    
}
