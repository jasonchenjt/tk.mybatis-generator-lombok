package com.mygroup.generator.domain.table;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Table(name = "spring_security..tb_permission")
@Data
public class TbPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 父权限
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限英文名称
     */
    private String enname;

    /**
     * 授权路径
     */
    private String url;

    /**
     * 备注
     */
    private String description;

    private Date created;

    private Date updated;
}