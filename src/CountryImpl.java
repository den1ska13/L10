

/**
 * Created by Source IT on 16.05.16.
 */
public class CountryImpl implements Country {
    String Name;
    State [] States;
    @Override
    public Double getSquare() {
        Double sq = 0d;
        for (int i = 0; i<States.length; i++){
            sq+=States[i].getSquare();
        }

        return sq;
    }

    @Override
    public Long getPopulation() {
        Long p = 0L;
        for (int i = 0; i< States.length; i++) {
             p+= States[i].getPopulation();
        }
        return p;
    }

    @Override
    public State[] getStates() {
        return States;
    }

    @Override
    public String getName() {
        return Name;
    }
    public CountryImpl(String name, State[] states) {
        Name = name;
        States = states;

    }

}
