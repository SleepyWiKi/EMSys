package org.wiki.service.module.personnel.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @Packagename: org.wiki.admin.model.vo
 * @Author: WiKi
 * @Date: 23/08/14 11:43 AM
 */
@Data
public class RoleVo {
    
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
    
    /**
     * 更新时间
     */
    private Date updateTime;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 是否删除(0-未删, 1-已删)
     */
    private Integer isDeleted;
    
}
