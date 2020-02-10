package com.mygroup.generator.domain.table;

import javax.persistence.*;
import lombok.Data;

@Table(name = "spring_security..tb_role_permission")
@Data
public class TbRolePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色 ID
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 权限 ID
     */
    @Column(name = "permission_id")
    private Long permissionId;
}