package com.example.demo.dto;

import com.example.demo.enums.ProjectStatus;
import com.example.demo.model.Project;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
    
    private Long id;
    private String projectCode;
    private String name;
    private String client;
    private ProjectStatus status;

} 