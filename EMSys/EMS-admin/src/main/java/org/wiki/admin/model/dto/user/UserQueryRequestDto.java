package org.wiki.admin.model.dto.user;

import lombok.Data;

/**
 * @Packagename: org.wiki.admin.model.dto
 * @Classname: UserQueryRequestDto
 * @Description: 用户查询请求dto
 * @Author: WiKi
 * @Date: 23/08/14 11:43 AM
 */
@Data
public class UserQueryRequestDto {
    
    /**
     * 用户名
     */
    private String userName;
    
    /**
     * 账户名
     */
    private String account;
    
    /**
     * 所属部门id
     */
    private String departId;
    
    /**
     * 所属项目id
     */
    private String projectId;
    
}
