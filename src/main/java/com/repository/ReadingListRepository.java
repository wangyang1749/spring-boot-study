package com.repository;

import com.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByRender(String render);
}
