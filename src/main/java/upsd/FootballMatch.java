package upsd;

public class FootballMatch {

    private final int scoreLimit;
    private int homeScore;
    private int awayScore;

    public FootballMatch(int scoreLimit) {
        this.scoreLimit = scoreLimit;
    }

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

    public String status() {
        if (homeScore == scoreLimit) {
            return "Home team has won";
        }

        if (awayScore == scoreLimit) {
            return "Away team has won";
        }

        return "Playing";
    }
}
