package com.example.reminder.remotedeadline.utils;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class TimezoneConverter {

    public static String convertToLocalTime(String utcDate, String timezone) {
        ZonedDateTime utcDateTime = ZonedDateTime.parse(utcDate, DateTimeFormatter.ISO_DATE_TIME);
        return utcDateTime.withZoneSameInstant(ZoneId.of(timezone)).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
