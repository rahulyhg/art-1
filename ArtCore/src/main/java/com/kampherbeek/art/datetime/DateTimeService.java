package com.kampherbeek.art.datetime;


import org.springframework.stereotype.Component;

/**
 * Service for date and time related calculations.
 */
public interface DateTimeService {

    /**
     * Retrieve Julian Day Number.
     * @param dateTime Date in the format yyyy-mm-dd hh:mm:ss
     * @return calculated Julian Day Number
     * TODO add support for calendar.
     */
    double getJdNr(String dateTime);
}
