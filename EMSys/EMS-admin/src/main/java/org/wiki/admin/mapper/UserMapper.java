package org.wiki.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.wiki.admin.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author WiKi
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2023-08-14 11:24:42
* @Entity org.wiki.admin.model.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




