
public class Main {

    public static void main(String[] args) {
        StateImpl [] statesUkr = {
                new StateImpl("Kiev", 14256L, 1235D),
                new StateImpl("Kharhiv", 45672L, 1678D),
                new StateImpl("Lviv", 15232L, 12351D)

        };
        StateImpl [] statesUSA = {
                new StateImpl("Vegas", 14151L, 215141D),
                new StateImpl("NY", 141513L, 4141411D),
                new StateImpl("Alaska", 1441L, 115141D)

        };




        CountryImpl [] Countryes = {
                new CountryImpl("Ukraine", statesUkr),
                new CountryImpl("USA", statesUSA)
        };
        ServiceImpl serv = new ServiceImpl(Countryes);

        System.out.println(serv.getCountryPopulation("Ukraine"));
        System.out.println(serv.getBiggestState("USA"));
        System.out.println(serv.getOvercrowdedState("Ukraine"));
        System.out.println(serv.getAverageDensityOfPeopleByStates("USA"));
        System.out.println(serv.getTotalDensityOfPeople("Ukraine"));
        System.out.println(serv.getCountrySquare("USA"));
        System.out.println(serv.getTotalDensityOfPeople("Ukraine"));

    }
}
