package com.example.csit321g3.repository;

import com.example.csit321g3.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ItemRepository extends JpaRepository<ItemEntity, Integer>{
}