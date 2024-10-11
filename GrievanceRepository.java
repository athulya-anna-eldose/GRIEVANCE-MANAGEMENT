

package com.example.grievance_management.repository;

import com.example.grievance_management.entity.Grievance;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;




@Repository
public interface GrievanceRepository extends JpaRepository<Grievance, Long> {
    // Custom query methods can be added here
}