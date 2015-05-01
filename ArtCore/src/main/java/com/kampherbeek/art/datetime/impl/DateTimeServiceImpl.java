package com.kampherbeek.art.datetime.impl;

import com.kampherbeek.art.datetime.DateTimeHandler;
import com.kampherbeek.art.datetime.DateTimeService;
import com.kampherbeek.art.util.conversions.DateTimeConversions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DateTimeServiceImpl implements DateTimeService {

    @Autowired
    private DateTimeConversions dateTimeConversions;
    @Autowired
    private DateTimeHandler dateTimeHandler;

    @Override
    public double getJdNr(String dateTime) {
        return dateTimeHandler.calculateJdNr(dateTimeConversions.textToSweDate(dateTime));
    }
}
