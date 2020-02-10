package com.mygroup.generator.domain.table;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Table(name = "spring_security..oauth_approvals")
@Data
public class OauthApprovals {
    @Column(name = "userId")
    private String userid;

    @Column(name = "clientId")
    private String clientid;

    private String scope;

    private String status;

    @Column(name = "expiresAt")
    private Date expiresat;

    @Column(name = "lastModifiedAt")
    private Date lastmodifiedat;
}