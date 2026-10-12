package com.zz.mapper;

import com.zz.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @className: UserMapper
 * @author: zhangzhou
 * @date: 2026/10/10 下午4:01
 * @description:
 */
@Mapper
public interface UserMapper {

    List<User> queryUserBySchoolName(User user);
}
