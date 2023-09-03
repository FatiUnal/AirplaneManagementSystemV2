package com.example.airplaneprojectv2.exceptions;

public class ExpeditionNotFound extends RuntimeException{
    public ExpeditionNotFound(int id) {
        super("Expedition not found : "+id);
    }
}
