package org.wiki.admin.model.dto.user;

import lombok.Data;

/**
 * @Packagename: org.wiki.admin.model.dto
 * @Classname: UserAddRequestDto
 * @Description: 新增用户请求dto
 * @Author: WiKi
 * @Date: 23/08/14 11:42 AM
 */
@Data
public class UserAddRequestDto {
    
    /**
     * 用户名
     */
    private String userName;
    
    /**
     * 账户名
     */
    private String account;
    
    /**
     * 密码
     */
    private String password;
    
    /**
     * 联系电话
     */
    private String phone;
    
    /**
     * 所属部门id
     */
    private String departId;
    
    /**
     * 所属项目id
     */
    private String projectId;
    
    /**
     * 备注
     */
    private String remark;
    
}
