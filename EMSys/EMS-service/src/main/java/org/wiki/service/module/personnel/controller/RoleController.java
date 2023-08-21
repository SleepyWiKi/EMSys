package org.wiki.service.module.personnel.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import org.wiki.common.anotation.Log;
import org.wiki.common.constant.AnnotationLogConstant;
import org.wiki.common.core.domain.AjaxResult;
import org.wiki.service.module.personnel.model.dto.role.RoleAddRequestDto;
import org.wiki.service.module.personnel.model.dto.role.RoleQueryRequestDto;
import org.wiki.service.module.personnel.model.dto.role.RoleUpdateRequestDto;
import org.wiki.service.module.personnel.model.entity.Role;
import org.wiki.service.module.personnel.model.vo.RoleVo;
import org.wiki.service.module.personnel.service.RoleService;

import javax.annotation.Resource;

/**
 * @Packagename: org.wiki.admin.controller
 * @Classname: RoleController
 * @Description: 角色管理控制器
 * @Author: WiKi
 * @Date: 23/08/14 11:29 AM
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleService roleService;
    
    
    @PostMapping("/add")
    @Log(module = "角色管理", OpType = AnnotationLogConstant.OP_TYPE_CREATE, OpName = "新增角色")
    public AjaxResult addRole(@RequestBody RoleAddRequestDto roleAddRequestDto) {
        //todo 校验工具类编写
        Role newRole = BeanUtil.copyProperties(roleAddRequestDto, Role.class);
        roleService.save(newRole);
        return AjaxResult.success("新增角色成功");
    }
    
    
    @DeleteMapping("/delete/{id}")
    @Log(module = "角色管理", OpType = AnnotationLogConstant.OP_TYPE_DELETE, OpName = "删除角色")
    public AjaxResult deleteRole(@PathVariable("id") String id) {
        //todo 校验工具类编写
        Role dbRole = roleService.getById(id);
        if (ObjectUtil.isEmpty(dbRole)) {
            return AjaxResult.error("角色不存在");
        } else {
            roleService.removeById(id);
            return AjaxResult.success("删除角色成功");
        }
    }
    
    
    @PostMapping("/update")
    @Log(module = "角色管理", OpType = AnnotationLogConstant.OP_TYPE_UPDATE, OpName = "修改角色")
    public AjaxResult updateRole(@RequestBody RoleUpdateRequestDto roleUpdateRequestDto) {
        //todo 校验工具类编写
        Role dbRole = roleService.getById(roleUpdateRequestDto.getId());
        if (ObjectUtil.isEmpty(dbRole)) {
            return AjaxResult.error("角色不存在");
        } else {
            BeanUtil.copyProperties(roleUpdateRequestDto, dbRole);
            roleService.updateById(dbRole);
            return AjaxResult.success("修改角色成功");
        }
    }
    
    
    @GetMapping("/getSingle")
    @Log(module = "角色管理", OpType = AnnotationLogConstant.OP_TYPE_QUERY_SINGLE, OpName = "查询单个角色")
    public AjaxResult getSingleRole(@RequestParam String id) {
        //todo 校验工具类编写
        Role dbRole = roleService.getById(id);
        if (ObjectUtil.isEmpty(dbRole)) {
            return AjaxResult.error("角色不存在");
        } else {
            RoleVo roleVo = BeanUtil.copyProperties(dbRole, RoleVo.class);
            return AjaxResult.success("操作成功",roleVo);
        }
    }
    
    
    @GetMapping("/roleList")
    @Log(module = "角色管理", OpType = AnnotationLogConstant.OP_TYPE_QUERY_LIST, OpName = "查询角色列表")
    public AjaxResult getRoleList(@RequestParam RoleQueryRequestDto roleQueryRequestDto) {
        //todo 校验工具类编写
        return AjaxResult.success("操作成功",roleService.getRoleListVo(roleQueryRequestDto));
    }
    
    
    @GetMapping("/rolePage")
    @Log(module = "角色管理", OpType = AnnotationLogConstant.OP_TYPE_QUERY_PAGE, OpName = "查询角色分页")
    public AjaxResult getRolePage(Page<Role> page,@RequestParam RoleQueryRequestDto roleQueryRequestDto) {
        //todo 校验工具类编写
        return AjaxResult.success("操作成功",roleService.getRolePageVo(page,roleQueryRequestDto));
    }
    
}

