package com.example.demo.model;

import com.example.demo.enums.TimesheetStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "timesheet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Timesheet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "contractor_id", nullable = false)
    private User contractor;

    @Column
    private LocalDate weekStartDate;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TimesheetStatus status = TimesheetStatus.DRAFT;
    
    @Column
    private String managerComment;

    @ManyToOne
    @JoinColumn(name = "reviewed_by")
    private User reviewedBy;
    
    @Column
    private LocalDate reviewedDate;
    
    @OneToMany(mappedBy = "timesheet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TimesheetEntry> entries;
}