package com.example.store.controller;

import com.example.store.domain.Owner;
import com.example.store.domain.Store;
import com.example.store.repository.OwnerRepository;
import com.example.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @PostMapping("/api/v1/owner")
    public ResponseEntity<Owner> createowner(@RequestBody Owner owner){

        Owner save = ownerRepository.save(owner);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/api/v1/owner")
    public ResponseEntity<List<Owner>> getAllOwner(){
        List<Owner> all = ownerRepository.findAll();
        return  ResponseEntity.ok(all);
    }

}
