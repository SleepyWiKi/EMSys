package org.wiki.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.wiki.admin.model.dto.user.UserQueryRequestDto;
import org.wiki.admin.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.wiki.admin.model.vo.UserVo;

import java.util.List;

/**
* @author WiKi
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-08-14 11:24:42
*/
public interface UserService extends IService<User> {
    
    List<UserVo> getUserListVo(UserQueryRequestDto userQueryRequestDto);
    
    Page<UserVo> getUserPageVo(Page<User> page,UserQueryRequestDto userQueryRequestDto);
}
