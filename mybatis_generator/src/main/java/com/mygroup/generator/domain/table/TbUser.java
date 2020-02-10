package com.mygroup.generator.domain.table;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Table(name = "spring_security..tb_user")
@Data
public class TbUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码，加密存储
     */
    private String password;

    /**
     * 注册手机号
     */
    private String phone;

    /**
     * 注册邮箱
     */
    private String email;

    private Date created;

    private Date updated;
}