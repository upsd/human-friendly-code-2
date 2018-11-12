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
        return goalsFor(Team.HOME) + "-" + goalsFor(Team.AWAY);
    }

    public void scoreFor(Team team) {
        if (!status().contains("won")) {
            int score = goalsFor(team);

            this.scores.put(team, score + 1);
        }
    }

    public String status() {
        if (hasWon(Team.HOME)) {
            return "Home team has won";
        }

        if (hasWon(Team.AWAY)) {
            return "Away team has won";
        }

        return "Playing";
    }

    private boolean hasWon(Team home) {
        return goalsFor(home) == scoreLimit;
    }

    private int goalsFor(Team home) {
        return this.scores.get(home);
    }
}
