package com.example.urlshortener.jwt;

import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.security.Key;

@Service
public class JwtService {

    private final Key key;
    private final long jwtExpiration;

    JwtService(
            @Value("${jwt.secret}") String secret,
            @Value("${jwt.expiration}") long expiration
    ){
        this.key = Keys.hmacShaKeyFor(secret.getBytes());
        this.jwtExpiration = expiration;
    }


}
