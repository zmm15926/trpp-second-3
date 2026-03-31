package ru.mirea.trpp_second_3.controllers;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class HealthResponse {
    private String status;

    public HealthResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
