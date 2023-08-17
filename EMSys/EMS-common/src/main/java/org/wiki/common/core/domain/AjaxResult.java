package org.wiki.common.core.domain;

/**
 * @Packagename: org.wiki.common.core.domain
 * @Classname: AjaxResult
 * @Description: 通用返回结果
 * @Author: WiKi
 * @Date: 23/06/19 4:22 PM
 */
public class AjaxResult {

    private String code;
    
    private String msg;
    
    private Object data;
    
    public AjaxResult() {}
    
    public AjaxResult(String code, String msg,Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    
    
    public static AjaxResult success() {
        return new AjaxResult("200", "操作成功", null);
    }
    
    public static AjaxResult success(String msg) {
        return new AjaxResult("200", msg, null);
    }
    
    public static AjaxResult success(String msg, Object data) {
        return new AjaxResult("200", msg, data);
    }
    
    public static AjaxResult error() {
        return new AjaxResult("500", "操作失败", null);
    }
    
    public static AjaxResult error(String msg) {
        return new AjaxResult("500", msg, null);
    }
    
    public static AjaxResult error(String code, String msg) {
        return new AjaxResult(code, msg, null);
    }
    
}
