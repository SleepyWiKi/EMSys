package org.wiki.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Packagename: org.wiki.admin
 * @Classname: EMSApp
 * @Description: 服务主入口
 * @Author: WiKi
 * @Date: 23/08/21 3:41 PM
 */
@SpringBootApplication
public class EMSysApp {
    
    public static void main(String[] args) {
        SpringApplication.run(EMSysApp.class, args);
        System.out.println("EMSys启动成功！");
    }
    
}
