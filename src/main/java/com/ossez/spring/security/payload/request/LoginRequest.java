package com.ossez.spring.security.payload.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Login Request Obj
 *
 * @author YuCheng Hu
 */
@Data
public class LoginRequest {
    @NotBlank
    private String userName;

    @NotBlank
    private String userPassword;
}
