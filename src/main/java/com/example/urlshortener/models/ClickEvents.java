package com.example.urlshortener.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class ClickEvents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private LocalDateTime clickDate;

    @ManyToOne
    @JoinColumn(name = "url_mapping_id")
    private UrlMapping urlMapping;
}
