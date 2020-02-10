package com.mygroup.generator.domain.table;

import javax.persistence.*;
import lombok.Data;

@Table(name = "spring_security..tb_user_role")
@Data
public class TbUserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户 ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色 ID
     */
    @Column(name = "role_id")
    private Long roleId;
}