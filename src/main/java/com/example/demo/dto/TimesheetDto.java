package com.example.demo.dto;

import com.example.demo.enums.TimesheetStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimesheetDto {
    
    private Long id;
    private Long contractorId;
    private String contractorName;
    private LocalDate weekStartDate;
    private TimesheetStatus status;
    private String managerComment;
    private String reviewedByName;
    private LocalDate reviewedDate;
    private List<TimesheetEntryDto> entries;
    private Double totalHours;
} 