package com.example.phonemanagement.service;

import com.example.phonemanagement.model.Smartphone;
import com.example.phonemanagement.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SmartphoneServiceImpl implements SmartphoneService {

    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Integer id) {
        Optional<Smartphone> smartphone = smartphoneRepository.findById(id);
        if (smartphone == null) {
            return null;
        }
        return smartphone;
    }

    @Override
    public Smartphone save(Smartphone phone) {
        return smartphoneRepository.save(phone);
    }

    @Override
    public Optional<Smartphone> remove(Integer id) {
        Optional<Smartphone> smartphone = findById(id);
        smartphoneRepository.delete(id);
        return smartphone;
    }
}
