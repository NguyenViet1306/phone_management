package com.example.phonemanagement.repository;

import com.example.phonemanagement.model.Smartphone;
import org.springframework.data.repository.CrudRepository;

public interface SmartphoneRepository extends CrudRepository<Smartphone, Integer> {
    void delete(Integer id);
}
