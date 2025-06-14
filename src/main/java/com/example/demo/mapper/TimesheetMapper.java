package com.example.demo.mapper;

import com.example.demo.dto.TimesheetDto;
import com.example.demo.model.Timesheet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TimesheetMapper {
    TimesheetMapper INSTANCE= Mappers.getMapper(TimesheetMapper.class);
    TimesheetDto toDto(Timesheet timesheet);
    Timesheet toEntity(TimesheetDto timesheetDto);
    List<TimesheetDto> toDtoList(List<Timesheet> timesheets);
    Timesheet toEntityList(TimesheetDto timesheetDto);

}
