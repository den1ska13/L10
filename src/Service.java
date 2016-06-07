

import java.math.BigDecimal;

/**
 *
 */
public interface Service {
    Long getCountryPopulation(String name);
    Country getOvercrowdedCountry();
    Double getCountrySquare(String name);
    Double getTotalDensityOfPeople(String name);
    Double getAverageDensityOfPeopleByStates(String name);
    String getOvercrowdedState(String name);
    String getBiggestState(String name);
}
