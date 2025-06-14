package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityDto {
    
    private Long id;
    private String activityCode;
    private String activityName;
    private String description;
    private boolean active;
} 