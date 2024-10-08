package com.prashanthvangari.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashanthvangari.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Long>{
    
}
