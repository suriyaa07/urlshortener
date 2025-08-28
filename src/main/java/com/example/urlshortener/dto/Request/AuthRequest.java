package com.example.urlshortener.dto.Request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuthRequest {
    private Long id;
    private String email;
    private String username;
    private String password;
    private String role;
}
