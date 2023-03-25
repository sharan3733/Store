package com.example.store.controller;

import com.example.store.domain.Kategories;
import com.example.store.domain.Store;
import com.example.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {

    @Autowired
    private StoreRepository storeRepository;

    @Value("${tutorial.hs.name}")
    String tutorialName;
    @PostMapping("/api/v1/store")
    public ResponseEntity<Store> createstore(@RequestBody Store store){
        /*store.setName(tutorialName);*/

        Store save = storeRepository.save(store);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/api/v1/store")
    public ResponseEntity<List<Store>> getAllStore(){
        List<Store> all = storeRepository.findAll();
        return  ResponseEntity.ok(all);


    }
    @GetMapping("/{owner}")
    public ResponseEntity<List<Store>> getStoreByOwnerNameStartWith(@PathVariable String owner){
        List<Store> allByOwnerStartsWith = (List<Store>) storeRepository.findAllByOwnerNameStartsWith(owner);
        return ResponseEntity.ok(allByOwnerStartsWith);
    }





}
