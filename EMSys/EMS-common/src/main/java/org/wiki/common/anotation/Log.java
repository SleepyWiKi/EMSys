package org.wiki.common.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Log {
    
    /**
     * 模块名称
     **/
    public String module() default "";
    
    /**
     * 操作类型 CRUD
     **/
    public String OpType() default "";
    
    /**
     * 操作描述
     **/
    public String OpName() default "";
    
    
    
    
}
