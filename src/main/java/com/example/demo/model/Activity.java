package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "activities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false)
    private String activityCode;
    
    @Column
    private String activityName;
    
    @Column
    private String description;
    
    @Column
    private boolean active = true;

    @Column
    @CreationTimestamp
    private Timestamp createdAt;
    @Column
    @UpdateTimestamp
    private Timestamp updateAt;
} 