package com.spring.demo.springdemosecurity.service;

import com.spring.demo.springdemosecurity.dao.UserMapper;
import com.spring.demo.springdemosecurity.dao.UserPermissionMapper;
import com.spring.demo.springdemosecurity.entity.Permission;
import com.spring.demo.springdemosecurity.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenzt
 * @date 2022/6/1
 */
@Component
@Slf4j
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserPermissionMapper userPermissionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 点击页面实际要做的事情
        // 1. 拿着用户名去数据库查询密码
        // 2. 将拿到的用户名密码封装到user中进行返回

        log.info("--loadUserByUsername--  收到username:" + username);
        User user = userMapper.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException(" 找不到用户: " + username);
        }

        //设置权限
        List<Permission> permissions = userPermissionMapper.findByUserName(username);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(permissions.size());
        List<String> permistionUrls = permissions.stream().map(Permission::getUrl).collect(Collectors.toList());

        for (String authority : permistionUrls) {
            grantedAuthorities.add(new SimpleGrantedAuthority(authority));
        }

        return new AuthUser(username, user.getPassword(), grantedAuthorities);
    }
}
