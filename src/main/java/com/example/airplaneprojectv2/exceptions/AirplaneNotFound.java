package com.example.airplaneprojectv2.exceptions;

public class AirplaneNotFound extends RuntimeException {
    public AirplaneNotFound(int id) {
        super("Airplane not found :"+ id);
    }
}
