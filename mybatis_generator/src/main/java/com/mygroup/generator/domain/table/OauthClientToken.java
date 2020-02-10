package com.mygroup.generator.domain.table;

import javax.persistence.*;
import lombok.Data;

@Table(name = "spring_security..oauth_client_token")
@Data
public class OauthClientToken {
    @Id
    @Column(name = "authentication_id")
    private String authenticationId;

    @Column(name = "token_id")
    private String tokenId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "client_id")
    private String clientId;

    private byte[] token;
}