package com.kampherbeek.art.datetime.impl;

import com.kampherbeek.art.datetime.DateTimeHandler;
import com.kampherbeek.art.datetime.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DateTimeServiceImpl implements DateTimeService {

    @Autowired
    private DateTimeHandler dateTimeHandler;

    @Override
    public String getJdNr(String dateTime) {

        return dateTimeHandler.calculateJdNr(dateTime);

    }
}