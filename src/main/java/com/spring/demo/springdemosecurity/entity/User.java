package com.spring.demo.springdemosecurity.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chenzt
 * @date 2022/5/27
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -5440372534300871944L;

    private Integer id;
    private String userName;
    private String password;
    private Date createTime;
    private String status;
}
