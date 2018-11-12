package upsd;

public class FootballMatch {

    private int homeScore;
    private int awayScore;

    public String score() {
        return homeScore + "-" + awayScore;
    }

    public void scoreFor(String team) {
        if (team.equals("Home")) {
            homeScore += 1;
        } else {
            awayScore += 1;
        }
    }
}
