package com.mygroup.generator.domain.table;

import javax.persistence.*;
import lombok.Data;

@Table(name = "spring_security..clientdetails")
@Data
public class Clientdetails {
    @Id
    @Column(name = "appId")
    private String appid;

    @Column(name = "resourceIds")
    private String resourceids;

    @Column(name = "appSecret")
    private String appsecret;

    private String scope;

    @Column(name = "grantTypes")
    private String granttypes;

    @Column(name = "redirectUrl")
    private String redirecturl;

    private String authorities;

    @Column(name = "access_token_validity")
    private Integer accessTokenValidity;

    @Column(name = "refresh_token_validity")
    private Integer refreshTokenValidity;

    @Column(name = "additionalInformation")
    private String additionalinformation;

    @Column(name = "autoApproveScopes")
    private String autoapprovescopes;
}