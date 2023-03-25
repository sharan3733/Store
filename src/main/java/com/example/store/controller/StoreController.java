package com.example.store.controller;

import com.example.store.domain.Kategories;
import com.example.store.domain.Store;
import com.example.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {

    @Autowired
    private StoreRepository storeRepository;

    @PostMapping("/api/v1/store")
    public ResponseEntity<Store> createstore(@RequestBody Store store){

        Store save = storeRepository.save(store);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/api/v1/store")
    public ResponseEntity<List<Store>> getAllStore(){
        List<Store> all = storeRepository.findAll();
        return  ResponseEntity.ok(all);


    }





}
