public class StateImpl implements  State {
    private String Name;
    private Long Population;
    private Double Square;
    @Override
    public String getName() {
        return Name;
    }

    @Override
    public Long getPopulation() {
        return Population;
    }

    @Override
    public Double getSquare() {
        return Square;
    }
    public StateImpl(String name, Long population, Double square) {
        Name = name;
        Population = population;
        Square = square;
    }

}
