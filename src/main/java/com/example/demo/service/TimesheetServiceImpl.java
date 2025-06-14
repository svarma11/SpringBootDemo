package com.example.demo.service;

import com.example.demo.dto.TimesheetDto;
import com.example.demo.mapper.TimesheetMapper;
import com.example.demo.model.Timesheet;
import com.example.demo.model.User;
import com.example.demo.repository.TimesheetRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimesheetServiceImpl implements TimesheetService {
    @Autowired
    private TimesheetRepository timesheetRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TimesheetMapper timesheetMapper;
    @Override
    public TimesheetDto createTimesheet(TimesheetDto timesheetDto) {
        Timesheet savedTimeSheet =  timesheetRepository.save(timesheetMapper.toEntity(timesheetDto));
        return timesheetMapper.toDto(savedTimeSheet);
    }

    @Override
    public List<TimesheetDto> getTimesheetByContractor(Long contactorId) {
        User user = userRepository.findById(contactorId)
                .orElseThrow(() -> new RuntimeException("Contarctor is not found"));
        List<Timesheet> timesheets = timesheetRepository.findByContractor(user);
        return timesheetMapper.toDtoList(timesheets);
    }

}
