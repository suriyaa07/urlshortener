package com.example.urlshortener.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatusDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    private String status;
    private String message;
}
