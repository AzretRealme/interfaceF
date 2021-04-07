import java.util.List;

public class Club {

    private String club;
    private int wasFounded;
    private Country country;
    private Ligue ligue;
    private List<String> coachingStaff;

    @Override
    public String toString() {
        return "Club{" +
                "club='" + club + '\'' +
                ", wasFounded=" + wasFounded +
                ", country=" + country +
                ", ligue=" + ligue +
                ", coachingStaff=" + coachingStaff +
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

    public List<String> getCoachingStaff() {
        return coachingStaff;
    }

    public Club(String club, int wasFounded, Country country, Ligue ligue, List<String> coachingStaff) {
        this.club = club;
        this.wasFounded = wasFounded;
        this.country = country;
        this.ligue = ligue;
        this.coachingStaff = coachingStaff;
    }
}



