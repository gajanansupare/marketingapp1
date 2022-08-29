package com.example.demo.marketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.marketing.entites.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
