package com.example.demo;

import com.example.demo.dto.TimesheetDto;
import com.example.demo.mapper.TimesheetMapper;
import com.example.demo.model.Timesheet;
import com.example.demo.model.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.example.demo.mapper.TimesheetMapper.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimesheetTest {
    @Test
    public void testToModelList() {
        User u = new User();
        u.setId(1l);
        u.setName("Sujit");
        Timesheet ts1 = new Timesheet();
        ts1.setId(1L);
        ts1.setContractor(u);
        Timesheet ts2 = new Timesheet();
        ts2.setId(2L);
        List<Timesheet> timesheets = Arrays.asList(ts1, ts2);
        List<TimesheetDto> models = INSTANCE.toDtoList(timesheets);
        assertEquals(2, models.size());
        TimesheetDto model1 = models.get(0);
        assertEquals(1L, model1.getId());
        TimesheetDto model2 = models.get(1);
    }
}
