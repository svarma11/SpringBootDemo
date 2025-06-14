package com.example.demo.controller;

import com.example.demo.dto.TimesheetDto;
import com.example.demo.service.TimesheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timesheet")
public class TimesheetController {
    
    @Autowired
    private TimesheetService timesheetService;
    
    @PostMapping
    public ResponseEntity<TimesheetDto> createTimesheet(
            @RequestBody TimesheetDto timesheetDto) {
        try {
            TimesheetDto timesheet = timesheetService.createTimesheet(timesheetDto);
            return ResponseEntity.ok(timesheet);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @GetMapping
    public ResponseEntity<List<TimesheetDto>> getTimesheet(
            @RequestParam Long contractorId) {
        try {
            List<TimesheetDto> timesheet = timesheetService.getTimesheetByContractor(contractorId);
            return ResponseEntity.ok(timesheet);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }
    

} 