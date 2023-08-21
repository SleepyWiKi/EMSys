package org.wiki.service.module.personnel.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import org.wiki.common.anotation.Log;
import org.wiki.common.constant.AnnotationLogConstant;
import org.wiki.common.core.domain.AjaxResult;
import org.wiki.service.module.personnel.model.dto.user.UserAddRequestDto;
import org.wiki.service.module.personnel.model.dto.user.UserQueryRequestDto;
import org.wiki.service.module.personnel.model.dto.user.UserUpdateRequestDto;
import org.wiki.service.module.personnel.model.entity.User;
import org.wiki.service.module.personnel.model.vo.UserVo;
import org.wiki.service.module.personnel.service.UserService;

import javax.annotation.Resource;

/**
 * @Packagename: org.wiki.admin.controller
 * @Classname: UserController
 * @Description: 用户管理控制器
 * @Author: WiKi
 * @Date: 23/08/14 11:29 AM
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    
    
    @PostMapping("/add")
    @Log(module = "用户管理", OpType = AnnotationLogConstant.OP_TYPE_CREATE, OpName = "新增用户")
    public AjaxResult addUser(@RequestBody UserAddRequestDto userAddRequestDto) {
        //todo 校验工具类编写
        User newUser = BeanUtil.copyProperties(userAddRequestDto, User.class);
        userService.save(newUser);
        return AjaxResult.success("新增用户成功");
    }
    
    
    @DeleteMapping("/delete/{id}")
    @Log(module = "用户管理", OpType = AnnotationLogConstant.OP_TYPE_DELETE, OpName = "删除用户")
    public AjaxResult deleteUser(@PathVariable("id") String id) {
        //todo 校验工具类编写
        User dbUser = userService.getById(id);
        if (ObjectUtil.isEmpty(dbUser)) {
            return AjaxResult.error("用户不存在");
        } else {
            userService.removeById(id);
            return AjaxResult.success("删除用户成功");
        }
    }
    
    
    @PostMapping("/update")
    @Log(module = "用户管理", OpType = AnnotationLogConstant.OP_TYPE_UPDATE, OpName = "修改用户")
    public AjaxResult updateUser(@RequestBody UserUpdateRequestDto userUpdateRequestDto) {
        //todo 校验工具类编写
        User dbUser = userService.getById(userUpdateRequestDto.getId());
        if (ObjectUtil.isEmpty(dbUser)) {
            return AjaxResult.error("用户不存在");
        } else {
            BeanUtil.copyProperties(userUpdateRequestDto, dbUser);
            userService.updateById(dbUser);
            return AjaxResult.success("修改用户成功");
        }
    }
    
    
    @GetMapping("/getSingle")
    @Log(module = "用户管理", OpType = AnnotationLogConstant.OP_TYPE_QUERY_SINGLE, OpName = "查询单个用户")
    public AjaxResult getSingleUser(@RequestParam String id) {
        //todo 校验工具类编写
        User dbUser = userService.getById(id);
        if (ObjectUtil.isEmpty(dbUser)) {
            return AjaxResult.error("用户不存在");
        } else {
            UserVo userVo = BeanUtil.copyProperties(dbUser, UserVo.class);
            return AjaxResult.success("操作成功",userVo);
        }
    }
    
    
    @GetMapping("/userList")
    @Log(module = "用户管理", OpType = AnnotationLogConstant.OP_TYPE_QUERY_LIST, OpName = "查询用户列表")
    public AjaxResult getUserList(@RequestParam UserQueryRequestDto userQueryRequestDto) {
        //todo 校验工具类编写
        return AjaxResult.success("操作成功",userService.getUserListVo(userQueryRequestDto));
    }
    
    
    @GetMapping("/userPage")
    @Log(module = "用户管理", OpType = AnnotationLogConstant.OP_TYPE_QUERY_PAGE, OpName = "查询用户分页")
    public AjaxResult getUserPage(Page<User> page,@RequestParam UserQueryRequestDto userQueryRequestDto) {
        //todo 校验工具类编写
        return AjaxResult.success("操作成功",userService.getUserPageVo(page,userQueryRequestDto));
    }
    
}

