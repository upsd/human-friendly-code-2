package upsd;

public class FootballMatch {

    private int homeScore;

    public String score() {
        return homeScore + "-0";
    }

    public void scoreFor(String team) {
        if (team.equals("Home")) {
            homeScore += 1;
        }
    }
}
