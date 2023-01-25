package com.example.bootinaction.repository;


import com.example.bootinaction.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, String> {

}