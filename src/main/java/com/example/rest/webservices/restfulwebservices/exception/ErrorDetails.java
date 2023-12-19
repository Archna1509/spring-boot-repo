package com.example.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;

public class ErrorDetails {
    private LocalDate timeStamp;
    private String message;
    private String details;

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public ErrorDetails(LocalDate timeStamp, String message, String details) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.details = details;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
