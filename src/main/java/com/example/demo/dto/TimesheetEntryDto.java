package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimesheetEntryDto {

    private Long id;
    private Long projectId;
    private String projectCode;
    private String projectName;
    private Long activityId;
    private String activityCode;
    private String activityName;
    private LocalDate date;
    private Double hoursWorked;
    private String comments;
}