package com.diyosinfotech.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration // ✅ Marks it as a Spring configuration bean
@ConfigurationProperties(prefix = "security.jwt") // ✅ Reads properties starting with "security.jwt"
public class JwtProperties {

    private String secretKey;
    private long expirationTime;

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }
}
