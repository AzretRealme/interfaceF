import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Flatmap Method ---getCoachingStaff, combine All names");

        List<Club> clubs = Arrays.asList(
                (new Club("ManchesterUnited", 1878, Country.ENGLAND, Ligue.PremierLigue,
                        Arrays.asList("Ole Gunnar", "karla"))),
                new Club("RealMadrid", 1902, Country.SPAIN, Ligue.LaLiga,
                        Arrays.asList("Zidane", "karla")),
                new Club("Lion", 1950, Country.FRANCE, Ligue.Ligue1,
                        Arrays.asList("Rudi Garcia", "karla"))
        );

        List<String> getCoachingStaff = clubs.stream()
                .map(Club::getCoachingStaff)
                 .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(getCoachingStaff);

        System.out.println("Filter Method ---namesOfCoach, Find name 'O'");

        List<String> namesOfCoach = Arrays.asList("Ole Gunnar", "Zidane", "Rudi Garcia", "", null);

        namesOfCoach.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty() && name.contains("O"))
                .forEach(System.out::println);


        System.out.println("Map Method ---ChampionsLigue, getClub playOff, quarterfinals, semiFinal");
        ChampionsLigue playOff = new ChampionsLigue("Manchester United 1/8", 9500000);
        ChampionsLigue quarterfinals = new ChampionsLigue("Real Madrid 1/4 ", 10500000);
        ChampionsLigue semiFinal = new ChampionsLigue("Lion 1/2", 12000000);

        List<ChampionsLigue> championsLigue = clubs.stream()
                .map(club -> {
                    if(club.getClub().equalsIgnoreCase("ManchesterUnited")){
                        return playOff;
                    }else if(club.getClub().equalsIgnoreCase("RealMadrid")){
                        return quarterfinals;
                    }else if(club.getClub().equalsIgnoreCase("Lion")){
                        return semiFinal;
                    }else{
                        return null;
                    }
                })
                .collect(Collectors.toList());
championsLigue.forEach(System.out::println);


        //        List<String> namesOfCoach = Arrays.asList("Ole Gunnar", "Zidane", "Rudi Garcia");
//.filter(club -> club.startsWith("A"))
//        long count = namesOfCoach.stream()
//                .filter(i -> i.length() > 4)
//                .count();
//        System.out.println(count);

//        Gift gift1 = new Gift()
//        List<String> gift12 = clubStream()
//                .filter(club -> club.startsWith("Ri"))
//                .collect(Collectors.toList());
//map, flatmap, filter aufgabe
    }
}

//  Searchable wasFounded = club -> club.getWasFounded() >= 1950;
//
//        Searchable club1 = club -> {
//            switch (club.getCountry()){
//                case FRANCE: return true;
//                case ENGLAND:
//                case GERMANY:
//                case SPAIN: return false;
//
//            }
//            return false;
//        };
//        System.out.println("--------Search Club 1950");
//        clubs.forEach(club -> System.out.println(club1.search(club)));
//
//        Searchable ligue = club -> {
//            switch (club.getLigue()){
//                case PremierLigue:
//                case LaLiga:
//                case BundesLiga:
//                case SeriaA: return false;
//                case Ligue1: return true;
//            }
//            return false;
//        };
//        System.out.println("--------Search Club 1950 from Ligue");
//        clubs.forEach(club -> System.out.println(ligue.search(club)));
//        System.out.println("--------Search was founded 1950");
//        clubs.forEach(club -> System.out.println(wasFounded.search(club)));

        //clubs.forEach(club -> System.out.println(ligue.search(club) && club1.search(club) && wasFounded.search(club)));

//    }
//
//}
//        Stream<Club> clubStream = clubs.stream();
//        Stream.of(new Club("ManchesterUnited", 1878, Country.ENGLAND, Ligue.PremierLigue),
//                new Club( "RealMadrid", 1902, Country.SPAIN, Ligue.LaLiga),
//                new Club("BayernMunich", 1900, Country.GERMANY, Ligue.BundesLiga));
//        //clubs.forEach(number -> System.out.println(clubs));
//        Club[] clubArray = {new Club("BayernMunich", 1900, Country.GERMANY, Ligue.BundesLiga),
//                new Club("JUVENTUS", 1897, Country.ITALY, Ligue.SeriaA),
//                new Club("Lion", 1950, Country.FRANCE, Ligue.Ligue1)};
//        Stream<Club> clubStreamArray = Arrays.stream(clubArray);
//        String clubName = "RealMadriddd";
//        IntStream clubsIntstream = clubName.chars();
//        Stream<Object> clubStreamBuilder = Stream
//                .builder()
//                .add(new Club("Dortmund", 1901, Country.GERMANY, Ligue.BundesLiga))
//                .build();
////        long count = clubStream
////                .filter(club -> club.getWasFounded() == 1950)
////                .count();
////        System.out.println(count);
//        List<Club> filteredClubs = clubStream
//                .filter(club -> club.getWasFounded() == 1950 && club.getCountry() == Country.ENGLAND)
//                .collect(Collectors.toList());
//        System.out.println(filteredClubs);
//        System.out.println(clubs.stream()
//        .filter(club -> club.getWasFounded() == 1950 && club.getCountry() == Country.ENGLAND)
//    }
//}
//@FunctionalInterface
//interface Searchable{
//    boolean search(Club club);
//}
