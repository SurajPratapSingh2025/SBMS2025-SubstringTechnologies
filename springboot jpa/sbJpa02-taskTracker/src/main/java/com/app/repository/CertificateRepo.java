package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Certificate;

public interface CertificateRepo extends JpaRepository<Certificate,Integer>{

}
