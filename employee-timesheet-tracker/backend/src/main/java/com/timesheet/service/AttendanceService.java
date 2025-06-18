package com.timesheet.service;

import com.timesheet.model.Attendance;
import com.timesheet.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    public Attendance checkIn(Long employeeId) {
        Attendance attendance = new Attendance();
        attendance.setEmployeeId(employeeId);
        attendance.setCheckInTime(LocalDateTime.now());
        return attendanceRepository.save(attendance);
    }

    public Attendance checkOut(Long employeeId) {
        Attendance attendance = attendanceRepository.findTopByEmployeeIdOrderByIdDesc(employeeId);
        attendance.setCheckOutTime(LocalDateTime.now());
        return attendanceRepository.save(attendance);
    }
}