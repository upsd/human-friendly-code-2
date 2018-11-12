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
        if (goalsFor(Team.HOME) == scoreLimit) {
            return "Home team has won";
        }

        if (goalsFor(Team.AWAY) == scoreLimit) {
            return "Away team has won";
        }

        return "Playing";
    }

    private int goalsFor(Team home) {
        return this.scores.get(home);
    }
}
