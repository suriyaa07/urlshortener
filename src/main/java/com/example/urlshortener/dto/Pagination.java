package com.example.urlshortener.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Pagination implements Serializable {

    private static final long serialVersionUID = 696405988386808989L;
    private int currentPage;
    private int perPage;
    private int totalpages;
    private long totalObjects;
}
