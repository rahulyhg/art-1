package com.kampherbeek.art.endpoints;

import com.kampherbeek.art.datetime.DateTimeService;
import com.kampherbeek.art.datetime.model.DateTimeValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Endpoint for date and time related calculations.
 */
@RestController
public class DateTimeEndpoint {
@Autowired
private DateTimeService dateTimeService;

    /**
     * Rest service for calculation of Julian Day Number.
     * @param dateTime date and time, formatted as: yyyy-mm-dd hh:mm:ss
     * @return julian day number
     */
    @RequestMapping("/datetime/jdnr")
    public DateTimeValues getJdnr(@RequestParam("datetime") final String dateTime) {
        double jdNr = dateTimeService.getJdNr(dateTime);
        return new DateTimeValues(jdNr);
    }
}