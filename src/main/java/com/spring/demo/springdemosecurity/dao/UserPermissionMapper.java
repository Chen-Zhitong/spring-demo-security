package com.spring.demo.springdemosecurity.dao;

import com.spring.demo.springdemosecurity.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserPermissionMapper {

    List<Permission> findByUserName(String userName);
}
