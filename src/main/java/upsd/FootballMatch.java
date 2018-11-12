package upsd;

public class FootballMatch {

    private final int scoreLimit;
    private int homeScore;
    private int awayScore;

    public FootballMatch(int scoreLimit) {
        this.scoreLimit = scoreLimit;
    }

    public FootballMatch(int scoreLimit, int homeScore, int awayScore) {
        this.scoreLimit = scoreLimit;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String score() {
        return homeScore + "-" + awayScore;
    }

    public void scoreFor(String team) {
        if (!status().contains("won")) {
            if (team.equals("Home")) {
                homeScore += 1;
            } else {
                awayScore += 1;
            }
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
