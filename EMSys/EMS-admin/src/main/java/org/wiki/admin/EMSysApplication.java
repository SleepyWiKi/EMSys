package org.wiki.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Packagename: org.wiki.admin
 * @Classname: EMSysApplication
 * @Description: EMSysApplication
 * @Author: WiKi
 * @Date: 23/06/19 6:46 PM
 */
@SpringBootApplication
public class EMSysApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(EMSysApplication.class, args);
        System.out.println("EMSys启动成功！");
    }
    
}
