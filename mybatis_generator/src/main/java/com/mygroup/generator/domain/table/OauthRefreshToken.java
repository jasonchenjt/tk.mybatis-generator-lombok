package com.mygroup.generator.domain.table;

import javax.persistence.*;
import lombok.Data;

@Table(name = "spring_security..oauth_refresh_token")
@Data
public class OauthRefreshToken {
    @Column(name = "token_id")
    private String tokenId;

    private byte[] token;

    private byte[] authentication;
}