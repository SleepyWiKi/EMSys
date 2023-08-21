package org.wiki.service.module.personnel.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.wiki.service.module.personnel.mapper.RoleMapper;
import org.wiki.service.module.personnel.model.dto.role.RoleQueryRequestDto;
import org.wiki.service.module.personnel.model.entity.Role;
import org.wiki.service.module.personnel.model.entity.User;
import org.wiki.service.module.personnel.model.vo.RoleVo;
import org.wiki.service.module.personnel.model.vo.UserVo;
import org.wiki.service.module.personnel.service.RoleService;

import javax.annotation.Resource;
import java.util.List;

/**
* @author WiKi
* @description 针对表【role(角色表)】的数据库操作Service实现
* @createDate 2023-08-21 14:16:37
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService {
    
    @Resource
    private RoleMapper roleMapper;
    
    @Override
    public List<RoleVo> getRoleListVo(RoleQueryRequestDto roleQueryRequestDto) {
        QueryWrapper<Role> queryWrapper = Wrappers.query();
        if (StrUtil.isNotBlank(roleQueryRequestDto.getRoleName())) {
            queryWrapper.like("role_name", roleQueryRequestDto.getRoleName());
        }
        if (StrUtil.isNotBlank(roleQueryRequestDto.getPermissionName())) {
            queryWrapper.like("permission_name", roleQueryRequestDto.getPermissionName());
        }
        if (StrUtil.isNotBlank(roleQueryRequestDto.getPid())) {
            queryWrapper.eq("pid", roleQueryRequestDto.getPid());
        }
        List<Role> dbRoles = roleMapper.selectList(queryWrapper);
        List<RoleVo> roleVos = BeanUtil.copyToList(dbRoles, RoleVo.class);
        return roleVos;
    }
    
    @Override
    public Page<RoleVo> getRolePageVo(Page<Role> page, RoleQueryRequestDto roleQueryRequestDto) {
        QueryWrapper<Role> queryWrapper = Wrappers.query();
        if (StrUtil.isNotBlank(roleQueryRequestDto.getRoleName())) {
            queryWrapper.like("role_name", roleQueryRequestDto.getRoleName());
        }
        if (StrUtil.isNotBlank(roleQueryRequestDto.getPermissionName())) {
            queryWrapper.like("permission_name", roleQueryRequestDto.getPermissionName());
        }
        if (StrUtil.isNotBlank(roleQueryRequestDto.getPid())) {
            queryWrapper.eq("pid", roleQueryRequestDto.getPid());
        }
        Page<Role> rolePage = roleMapper.selectPage(page, queryWrapper);
        List<RoleVo> roleVos = BeanUtil.copyToList(rolePage.getRecords(), RoleVo.class);
        Page<RoleVo> roleVoPage = new Page<>();
        BeanUtil.copyProperties(rolePage, roleVoPage);
        return roleVoPage.setRecords(roleVos);
    }
}




