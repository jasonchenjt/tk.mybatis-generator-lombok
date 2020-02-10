package com.mygroup.generator.domain.table;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Table(name = "spring_security..tb_role")
@Data
public class TbRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 父角色
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色英文名称
     */
    private String enname;

    /**
     * 备注
     */
    private String description;

    private Date created;

    private Date updated;
}