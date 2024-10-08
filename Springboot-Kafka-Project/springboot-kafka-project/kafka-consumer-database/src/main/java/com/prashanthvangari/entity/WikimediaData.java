package com.prashanthvangari.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Table(name="wikimedia_kafka")
@Getter
@Setter
public class WikimediaData {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @Lob
    private String wikiEventData;
}
