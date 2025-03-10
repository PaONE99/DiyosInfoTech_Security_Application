package com.diyosinfotech.entitie;

import lombok.Data;
import lombok.experimental.Accessors;
@Accessors(chain = true)
@Data
public class LoginResponse {
    private String token;

    private long expiresIn;

    public String getToken() {
        return token;
    }

}