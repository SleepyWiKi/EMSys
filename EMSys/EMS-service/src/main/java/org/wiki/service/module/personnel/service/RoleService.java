package org.wiki.service.module.personnel.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.wiki.service.module.personnel.model.dto.role.RoleQueryRequestDto;
import org.wiki.service.module.personnel.model.entity.Role;
import org.wiki.service.module.personnel.model.vo.RoleVo;

import java.util.List;

/**
* @author WiKi
* @description 针对表【role(角色表)】的数据库操作Service
* @createDate 2023-08-21 14:16:37
*/
public interface RoleService extends IService<Role> {
    
    List<RoleVo> getRoleListVo(RoleQueryRequestDto roleQueryRequestDto);
    
    Page<RoleVo> getRolePageVo(Page<Role> page, RoleQueryRequestDto roleQueryRequestDto);
}
