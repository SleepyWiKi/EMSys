package org.wiki.service.module.personnel.model.dto.role;

import lombok.Data;

/**
 * @Packagename: org.wiki.admin.model.dto
 * @Classname: UserQueryRequestDto
 * @Description: 角色查询请求dto
 * @Author: WiKi
 * @Date: 23/08/14 11:43 AM
 */
@Data
public class RoleQueryRequestDto {
    
    /**
     * 父级角色ID
     */
    private String pid;
    
    /**
     * 角色名称
     */
    private String roleName;
    
    /**
     * 权限ID
     */
    private String permissionId;
    
    /**
     * 权限名称
     */
    private String permissionName;
    
}
