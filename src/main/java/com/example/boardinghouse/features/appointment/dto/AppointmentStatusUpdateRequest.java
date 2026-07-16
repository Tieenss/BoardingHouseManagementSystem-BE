package com.example.boardinghouse.features.appointment.dto;

import lombok.Data;

@Data
public class AppointmentStatusUpdateRequest {
    private String status; // CONFIRMED, CANCELLED, COMPLETED
}
