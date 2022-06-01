package com.spring.demo.springdemosecurity.dao;

import com.spring.demo.springdemosecurity.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenzt
 * @date 2022/5/27
 */
@Mapper
public interface UserMapper {
    User findByUserName(String userName);
}
