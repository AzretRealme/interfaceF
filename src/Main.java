import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Club> clubs = new ArrayList<>();
        clubs.add(new Club("ManchesterUnited", 1878, Country.ENGLAND, Ligue.PremierLigue));
        clubs.add(new Club("RealMadrid", 1902, Country.SPAIN, Ligue.LaLiga));
        clubs.add(new Club("BayernMunich", 1900, Country.GERMANY, Ligue.BundesLiga));
        clubs.add(new Club("JUVENTUS", 1897, Country.ITALY, Ligue.SeriaA));
        clubs.add(new Club("Lion", 1950, Country.FRANCE, Ligue.Ligue1));

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

        //clubs.forEach(club -> System.out.println(ligue.search(club) && club1.search(club) && wasFounded.search(club)));

    }

}
@FunctionalInterface
interface Searchable{
    boolean search(Club club);
}
