package com.diyosinfotech.entitie;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class RegisterUserDto {
    private String email;
    
    private String password;
    
    private String fullName;
    
 
}
