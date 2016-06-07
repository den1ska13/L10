

/**
 * Created by Source IT on 16.05.16.
 */
public class ServiceImpl implements Service{
    CountryImpl [] countries;
    @Override
    public CountryImpl getOvercrowdedCountry() {
        CountryImpl res = null;
        double max = 0;
        for(int i = 0; i< countries.length; i++) {
                if ((countries[i].getPopulation()/countries[i].getSquare())>max) {
                    max = countries[i].getPopulation()/countries[i].getSquare();
                    res = countries[i];
                }
        }
        return res;
    }


    @Override
    public Double getAverageDensityOfPeopleByStates(String name) {
        int k = 0;
        Double sum = 0D;
        for(int i = 0; i< countries.length; i++)
            if (countries[i].getName() == name) {
                for (int j = 0; j < countries[i].States.length; j++) {
                    sum += countries[i].States[j].getPopulation() / countries[i].States[j].getSquare();
                    k++;
                }
            }
        return sum/k;
    }

    @Override
    public Double getCountrySquare(String name) {
        Double res = 0D;
        for(int i = 0; i< countries.length; i++) {
            if (countries[i].getName() == name) res = countries[i].getSquare();
        }
        return res;
    }

    @Override
    public Double getTotalDensityOfPeople(String name) {
        Double res = 0D;
        for(int i = 0; i< countries.length; i++) {
            if (countries[i].getName() == name) {
                res = countries[i].getPopulation() / countries[i].getSquare();

            }
        }


        return res;
    }

    @Override
    public Long getCountryPopulation(String name) {
        Long res = 0L;
        for(int i = 0; i< countries.length; i++) {
            if (countries[i].getName() == name) res = countries[i].getPopulation();
        }
        return res;
    }

    @Override
    public String getBiggestState(String name) {
        String res = "";
        Double max = 0D;
        for(int i = 0; i< countries.length; i++)
            if (countries[i].getName() == name) {
                for (int j = 0; j < countries[i].States.length; j++) {
                    if (countries[i].States[j].getSquare() > max) {
                        max = countries[i].States[j].getSquare();
                        res = countries[i].States[j].getName();
                    }

                }
            }
        return res;
    }

    @Override
    public String getOvercrowdedState(String name) {
        String res = "";
        Double max = 0D;
        for(int i = 0; i< countries.length; i++)
            if (countries[i].getName() == name) {
                for (int j = 0; j < countries[i].States.length; j++) {
                    if ((countries[i].States[j].getPopulation() / countries[i].States[j].getSquare()) > max) {
                        max = countries[i].States[j].getPopulation() / countries[i].States[j].getSquare();
                        res = countries[i].States[j].getName();
                    }

                }
            }
        return res;
    }
    public ServiceImpl (CountryImpl [] cont) {
        countries = cont;
    }
}
