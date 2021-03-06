package com.kampherbeek.art.domains.astroadditional.impl;

import com.kampherbeek.art.ArtCoreApplication;
import com.kampherbeek.art.domains.astroadditional.AstroAdditionalCalculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import swisseph.SweDate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = ArtCoreApplication.class,
        loader = SpringApplicationContextLoader.class)
public class AstroAdditionalCalculatorImplTest {
    private final double margin = 0.000000001;
    @Autowired
    private AstroAdditionalCalculator calculator;


    @Test
    public void testCalcObliquity() throws Exception {
        SweDate sweDate = new SweDate(1900, 1, 1, 0.0);
        double expected = 23.452288880338656;
        double actual = calculator.calcObliquity(sweDate);
        assertEquals(expected, actual, margin);
    }
}

