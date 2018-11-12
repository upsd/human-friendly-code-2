package upsd;

import java.util.HashMap;

public class FootballMatch {

    private final int scoreLimit;
    private HashMap<Team, Integer> scores = new HashMap<>();

    public FootballMatch(int scoreLimit) {
        this.scoreLimit = scoreLimit;
        scores.put(Team.HOME, 0);
        scores.put(Team.AWAY, 0);
    }

    public FootballMatch(int scoreLimit, int homeScore, int awayScore) {
        this.scoreLimit = scoreLimit;
        scores.put(Team.HOME, homeScore);
        scores.put(Team.AWAY, awayScore);
    }

    public String score() {
        return this.scores.get(Team.HOME) + "-" + this.scores.get(Team.AWAY);
    }

    public void scoreFor(Team team) {
        if (!status().contains("won")) {
            int score = this.scores.get(team);

            this.scores.put(team, score + 1);
        }
    }

    public String status() {
        if (this.scores.get(Team.HOME) == scoreLimit) {
            return "Home team has won";
        }

        if (this.scores.get(Team.AWAY) == scoreLimit) {
            return "Away team has won";
        }

        return "Playing";
    }
}
