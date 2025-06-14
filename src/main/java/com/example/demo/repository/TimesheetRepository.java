package com.example.demo.repository;

import com.example.demo.enums.TimesheetStatus;
import com.example.demo.model.Timesheet;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {
    
    List<Timesheet> findByContractor(User contractor);

} 