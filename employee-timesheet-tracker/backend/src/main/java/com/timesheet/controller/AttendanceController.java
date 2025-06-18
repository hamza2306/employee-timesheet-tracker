package com.timesheet.controller;

import com.timesheet.model.Attendance;
import com.timesheet.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/checkin")
    public ResponseEntity<Attendance> checkIn(@RequestParam Long employeeId) {
        Attendance attendance = attendanceService.checkIn(employeeId);
        return ResponseEntity.ok(attendance);
    }

    @PostMapping("/checkout")
    public ResponseEntity<Attendance> checkOut(@RequestParam Long employeeId) {
        Attendance attendance = attendanceService.checkOut(employeeId);
        return ResponseEntity.ok(attendance);
    }
}