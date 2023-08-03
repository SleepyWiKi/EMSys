package org.wiki.common.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Author: WiKi
 * @Description: 自定义注解，用于切换数据源
 * @Date: 23/06/19 7:31 PM
 **/
@Target({ElementType.METHOD})
public @interface DataSource {
    
    /**
     * 数据源标识
     **/
    public String source() default "master";
    
    /**
     * 数据行为类型
     **/
    public String type() default "write";
    
    
}
