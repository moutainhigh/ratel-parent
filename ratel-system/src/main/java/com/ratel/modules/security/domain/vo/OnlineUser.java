package com.ratel.modules.security.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.Authentication;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OnlineUser implements Serializable {
    private Authentication authentication;

    private String userName;

    private String nickName;

    private String deptName;

    private String browser;

    private String ip;

    private String address;

    private String key;

    private Date loginTime;

    private JwtUser jwtUser;


}
