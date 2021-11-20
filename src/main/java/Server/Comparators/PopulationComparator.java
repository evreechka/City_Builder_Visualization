package Server.Comparators;

import Server.Model.City;

import java.util.Comparator;

public class PopulationComparator implements Comparator<City> {
    @Override
    public int compare(City city1, City city2) {
        return city1.getPopulation().compareTo(city2.getPopulation());
    }
}
