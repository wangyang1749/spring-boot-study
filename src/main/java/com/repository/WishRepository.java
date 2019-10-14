package com.repository;

import com.pojo.Wish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WishRepository extends JpaRepository<Wish,Integer> {
    @Query(value = "select distinct message from wish",nativeQuery = true)
    List<String> findAllMessage();
}
