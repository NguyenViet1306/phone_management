package com.example.phonemanagement.service;

import com.example.phonemanagement.model.Smartphone;

import java.util.Optional;

public interface SmartphoneService {
    Iterable<Smartphone> findAll();
    Optional<Smartphone> findById(Integer id);
    Smartphone save(Smartphone phone);
    Optional<Smartphone> remove(Integer id);
}
