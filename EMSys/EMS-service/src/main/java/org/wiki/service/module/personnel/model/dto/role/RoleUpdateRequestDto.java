package org.wiki.service.module.personnel.model.dto.role;

import lombok.Data;

/**
 * @Packagename: org.wiki.admin.model.dto
 * @Classname: UserUpdateRequestDto
 * @Description: 更新角色请求dto
 * @Author: WiKi
 * @Date: 23/08/14 11:42 AM
 */
@Data
public class RoleUpdateRequestDto {
    
    /**
     * 用户id
     */
    private String id;
    
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
    
    /**
     * 备注
     */
    private String remark;
    
}
