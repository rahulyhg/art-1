package com.kampherbeek.art.domains.astroadditional;

import com.kampherbeek.art.ArtCoreApplication;
import com.kampherbeek.art.domains.astroadditional.model.AstroAdditionalValues;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@SpringApplicationConfiguration(classes = {ArtCoreApplication.class})
@IntegrationTest
@WebAppConfiguration
@RunWith(ConcordionRunner.class)
public class AstroAdditionalFixture {
    public double getObliquity(String jdnr) {
        RestTemplate restTemplate = new RestTemplate();
        AstroAdditionalValues values = restTemplate.getForObject("http://localhost:8080/astroadditional/obliquity?jdnr=" + jdnr.trim(), AstroAdditionalValues.class);
        return values.getObliquity();
    }

}


/*


@SpringApplicationConfiguration(classes={ArtCoreApplication.class})
@IntegrationTest
@WebAppConfiguration
@RunWith(ConcordionRunner.class)
public class DateTimeIntFixture {

    public double getJdNr(String dateTime) {
        RestTemplate restTemplate = new RestTemplate();
        DateTimeValues values = restTemplate.getForObject("http://localhost:8080/datetime/jdnr?datetime=" + dateTime.trim(), DateTimeValues.class);
        return values.getJdNr();
    }
}

 */