package com.nutrihive.controller;

import com.nutrihive.model.UserHealthData;
import com.nutrihive.repository.UserHealthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/health")
@CrossOrigin(origins = "*") // allow frontend
public class HealthController {

    @Autowired
    private UserHealthRepository repository;

    @PostMapping("/submit")
    public UserHealthData submitData(@RequestBody UserHealthData data) {
        return repository.save(data);
    }

    @GetMapping("/all")
    public List<UserHealthData> getAll() {
        return repository.findAll();
    }
}
