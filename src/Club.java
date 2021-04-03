public class Club {

    private String club;
    private int wasFounded;
    private Country country;
    private Ligue ligue;

    public Club(String club, int wasFounded, Country country, Ligue ligue) {
        this.club = club;
        this.wasFounded = wasFounded;
        this.country = country;
        this.ligue = ligue;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getWasFounded() {
        return wasFounded;
    }

    public void setWasFounded(int wasFounded) {
        this.wasFounded = wasFounded;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Ligue getLigue() {
        return ligue;
    }

    public void setLigue(Ligue ligue) {
        this.ligue = ligue;
    }

    @Override
    public String toString() {
        return "Club{" +
                "club='" + club + '\'' +
                ", wasFounded=" + wasFounded +
                ", country=" + country +
                ", ligue=" + ligue +
                '}';
    }
}

