package com.nutrihive.repository;

import com.nutrihive.model.UserHealthData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHealthRepository extends JpaRepository<UserHealthData, Long> {
}
