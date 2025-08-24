package com.example.urlshortener.dto;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Meta implements Serializable {

    private static final long serialVersionUID = 5704625800106194586L;
    private Pagination pagination;
}
