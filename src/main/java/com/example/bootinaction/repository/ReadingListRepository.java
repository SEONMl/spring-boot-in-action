package com.example.bootinaction.repository;

import java.util.List;

import com.example.bootinaction.entity.Book;
import com.example.bootinaction.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(Reader reader);
}
