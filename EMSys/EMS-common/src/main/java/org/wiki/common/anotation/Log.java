package org.wiki.common.anotation;

import org.wiki.common.constant.AnnotationLogConstant;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    
    /**
     * 日志类型 1-登录日志  2-操作日志(默认)
     **/
    public String logType() default AnnotationLogConstant.LOG_TYPE_OPERATE;
    
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
