import java.util.List;

public class Club {

    private String club;
    private int wasFounded;
    private Country country;
    private Ligue ligue;

    @Override
    public String toString() {
        return "Club{" +
                "club='" + club + '\'' +
                ", wasFounded=" + wasFounded +
                ", country=" + country +
                ", ligue=" + ligue +
                '}';
    }

    public String getClub() {
        return club;
    }

    public int getWasFounded() {
        return wasFounded;
    }

    public Country getCountry() {
        return country;
    }

    public Ligue getLigue() {
        return ligue;
    }

    public Club(String club, int wasFounded, Country country, Ligue ligue) {
        this.club = club;
        this.wasFounded = wasFounded;
        this.country = country;
        this.ligue = ligue;
    }
}



