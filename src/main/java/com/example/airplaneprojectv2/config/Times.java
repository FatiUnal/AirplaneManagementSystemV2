package com.example.airplaneprojectv2.config;

import java.time.LocalDateTime;

public class Times {
    public static LocalDateTime getLocalDateTime(String localDateTime){
        // 15/03/26/06/2002
        String date = localDateTime.trim();
        String[] dates = date.split("/");
        LocalDateTime localDateTime1 = LocalDateTime.of(Integer.parseInt(dates[4]),Integer.parseInt(dates[3]),Integer.parseInt(dates[2]),Integer.parseInt(dates[1]),Integer.parseInt(dates[0]));
        return localDateTime1;
    }
}
