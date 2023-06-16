package com.example.demosprinbootexceptionhandler.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private Integer code;

    public ErrorDetails(Date timestamp, String message, Integer details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.code = details;
    }
}