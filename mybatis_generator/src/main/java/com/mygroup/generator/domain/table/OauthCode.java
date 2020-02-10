package com.mygroup.generator.domain.table;

import javax.persistence.*;
import lombok.Data;

@Table(name = "spring_security..oauth_code")
@Data
public class OauthCode {
    private String code;

    private byte[] authentication;
}