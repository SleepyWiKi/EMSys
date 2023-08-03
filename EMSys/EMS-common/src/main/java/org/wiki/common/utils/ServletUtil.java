package org.wiki.common.utils;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Packagename: org.wiki.common.utils
 * @Classname: ServletUtil
 * @Description: Servlet工具类
 * @Author: WiKi
 * @Date: 23/06/19 4:31 PM
 */
public class ServletUtil {

    public static String getParams(String name){
        return getRequest().getParameter(name);
    }
    
    public static HttpServletRequest getRequest() {
        return getRequestAttributes().getRequest();
    }
    
    public static ServletRequestAttributes getRequestAttributes() {
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        return (ServletRequestAttributes) attributes;
    }





}
