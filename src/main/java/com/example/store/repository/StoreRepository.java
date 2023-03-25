package com.example.store.repository;

import com.example.store.domain.Kategories;
import com.example.store.domain.Owner;
import com.example.store.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository <Store, Long>{

}
