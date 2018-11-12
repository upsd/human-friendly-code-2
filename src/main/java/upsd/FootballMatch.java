package upsd;

import java.util.HashMap;

public class FootballMatch {

    private final int ONE_GOAL = 1;
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
        if (stillPlaying()) {
            scoreGoalFor(team);
        }
    }

    public MatchStatus status() {
        if (hasWon(Team.HOME)) {
            return MatchStatus.HOME_WON;
        }

        if (hasWon(Team.AWAY)) {
            return MatchStatus.AWAY_WON;
        }

        return MatchStatus.PLAYING;
    }

    private boolean stillPlaying() {
        return status() == MatchStatus.PLAYING;
    }

    private void scoreGoalFor(Team team) {
        this.scores.put(team, goalsFor(team) + ONE_GOAL);
    }

    private boolean hasWon(Team home) {
        return goalsFor(home) == scoreLimit;
    }

    private int goalsFor(Team home) {
        return this.scores.get(home);
    }
}
