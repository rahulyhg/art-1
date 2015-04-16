package com.kampherbeek.art.services.impl;

import com.kampherbeek.art.handlers.DateTimeHandler;
import com.kampherbeek.art.services.DateTimeService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class DateTimeServiceImplTest {
    @Mock
    private DateTimeHandler dateTimeHandlerMock = Mockito.mock(DateTimeHandler.class);
    @InjectMocks
    private DateTimeServiceImpl dateTimeService;
    private final double jdnr = 2123456.7;
    private final double margin = 0.000000001;

    @Before
     public void setUp() {
        Mockito.when(dateTimeHandlerMock.calculateJdNr(Matchers.anyString())).thenReturn(jdnr);
    }
    @Test
    public void testGetJdNr() throws Exception {
        assertEquals(jdnr, dateTimeService.getJdNr("2000-01-01 00:00:00"), margin);
    }
}