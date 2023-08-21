package org.wiki.service.module.personnel.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wiki.service.module.personnel.mapper.UserMapper;
import org.wiki.service.module.personnel.model.dto.user.UserQueryRequestDto;
import org.wiki.service.module.personnel.model.entity.User;
import org.wiki.service.module.personnel.model.vo.UserVo;
import org.wiki.service.module.personnel.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
* @author WiKi
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-08-14 11:24:42
*/
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {
    
    @Resource
    private UserMapper userMapper;
    
    @Override
    public List<UserVo> getUserListVo(UserQueryRequestDto userQueryRequestDto) {
        QueryWrapper<User> queryWrapper = Wrappers.query();
        if (StrUtil.isNotBlank(userQueryRequestDto.getUserName())) {
            queryWrapper.like("user_name", userQueryRequestDto.getUserName());
        }
        if (StrUtil.isNotBlank(userQueryRequestDto.getAccount())) {
            queryWrapper.like("account", userQueryRequestDto.getAccount());
        }
        if (StrUtil.isNotBlank(userQueryRequestDto.getDepartId())) {
            queryWrapper.eq("depart_id", userQueryRequestDto.getDepartId());
        }
        if (StrUtil.isNotBlank(userQueryRequestDto.getProjectId())) {
            queryWrapper.eq("project_id", userQueryRequestDto.getProjectId());
        }
        List<User> dbUsers = userMapper.selectList(queryWrapper);
        List<UserVo> userVos = BeanUtil.copyToList(dbUsers, UserVo.class);
        return userVos;
    }
    
    @Override
    public Page<UserVo> getUserPageVo(Page<User> page,UserQueryRequestDto userQueryRequestDto) {
        QueryWrapper<User> queryWrapper = Wrappers.query();
        if (StrUtil.isNotBlank(userQueryRequestDto.getUserName())) {
            queryWrapper.like("user_name", userQueryRequestDto.getUserName());
        }
        if (StrUtil.isNotBlank(userQueryRequestDto.getAccount())) {
            queryWrapper.like("account", userQueryRequestDto.getAccount());
        }
        if (StrUtil.isNotBlank(userQueryRequestDto.getDepartId())) {
            queryWrapper.eq("depart_id", userQueryRequestDto.getDepartId());
        }
        if (StrUtil.isNotBlank(userQueryRequestDto.getProjectId())) {
            queryWrapper.eq("project_id", userQueryRequestDto.getProjectId());
        }
        Page<User> userPage = userMapper.selectPage(page, queryWrapper);
        List<UserVo> userVos = BeanUtil.copyToList(userPage.getRecords(), UserVo.class);
        Page<UserVo> userVoPage = new Page<>();
        BeanUtil.copyProperties(userPage, userVoPage);
        return userVoPage.setRecords(userVos);
    }
}




