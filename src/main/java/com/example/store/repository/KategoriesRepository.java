package com.example.store.repository;

import com.example.store.domain.Kategories;
import com.example.store.domain.Produkt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriesRepository extends JpaRepository <Kategories, Long>{
}
