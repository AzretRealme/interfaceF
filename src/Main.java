import java.util.*;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Flatmap Method ---getCoachingStaff, combine All names");

        List<Club> clubs = Arrays.asList(
                (new Club("ManchesterUnited", 1878, Country.ENGLAND, Ligue.PremierLigue)),
                new Club("RealMadrid", 1902, Country.SPAIN, Ligue.LaLiga),
                new Club("Lion", 1950, Country.FRANCE, Ligue.Ligue1)
        );

  Searchable wasFounded = club -> club.getWasFounded() >= 1950;

        Searchable club1 = club -> {
            switch (club.getCountry()){
                case FRANCE: return true;
                case ENGLAND:
                case GERMANY:
                case SPAIN: return false;

            }
            return false;
        };
        System.out.println("--------Search Club 1950");
        clubs.forEach(club -> System.out.println(club1.search(club)));

        Searchable ligue = club -> {
            switch (club.getLigue()){
                case PremierLigue:
                case LaLiga:
                case BundesLiga:
                case SeriaA: return false;
                case Ligue1: return true;
            }
            return false;
        };
        System.out.println("--------Search Club 1950 from Ligue");
        clubs.forEach(club -> System.out.println(ligue.search(club)));
        System.out.println("--------Search was founded 1950");
        clubs.forEach(club -> System.out.println(wasFounded.search(club)));

        clubs.forEach(club -> System.out.println(ligue.search(club) && club1.search(club) && wasFounded.search(club)));

    }

}

@FunctionalInterface
interface Searchable{
    boolean search(Club club);
}
