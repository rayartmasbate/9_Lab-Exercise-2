package com.example.firstspringbootapp.repository;

import com.example.firstspringbootapp.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ItemRepository extends JpaRepository<ItemEntity, Integer>{
}