package org.wiki.admin.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @Packagename: org.wiki.admin.model.vo
 * @Classname: UserVo
 * @Description: 用户vo
 * @Author: WiKi
 * @Date: 23/08/14 11:43 AM
 */
@Data
public class UserVo {
    
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
     * 用户状态（0-停用,1-启用）
     */
    private String status;
    
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
