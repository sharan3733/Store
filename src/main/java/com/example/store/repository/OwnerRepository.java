package com.example.store.repository;

import com.example.store.domain.Kategories;
import com.example.store.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository <Owner, Long>{
}
