package com.example.demo.service;

import com.example.demo.dto.TimesheetDto;
import com.example.demo.model.Timesheet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TimesheetService {
    public TimesheetDto createTimesheet(TimesheetDto timesheetDto);
    public List<TimesheetDto> getTimesheetByContractor(Long contactorId);
}
