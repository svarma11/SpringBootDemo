package com.example.demo.repository;

import com.example.demo.model.Activity;
import com.example.demo.model.Project;
import com.example.demo.model.TimesheetEntry;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TimesheetEntryRepository extends JpaRepository<TimesheetEntry, Long> {
    
    List<TimesheetEntry> findByTimesheetId(Long timesheetId);

} 