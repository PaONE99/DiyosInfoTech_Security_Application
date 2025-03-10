package com.diyosinfotech.entitie;

import lombok.Data;
import lombok.experimental.Accessors;
@Accessors(chain = true)
@Data
public class LoginUserDto {
    private String email;
    
    private String password;
    
    
}