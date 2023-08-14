package org.wiki.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.wiki.admin.model.entity.User;
import org.wiki.admin.service.UserService;
import org.wiki.admin.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author WiKi
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-08-14 11:24:42
*/
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




