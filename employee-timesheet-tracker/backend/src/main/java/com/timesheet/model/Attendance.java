package com.timesheet.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;

    // Getters and Setters
}