package upsd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FootballMatchShould {

    @Test
    public void record_score_as_nil_nil_if_no_one_has_scored() {
        FootballMatch match = new FootballMatch(1);


        assertThat(match.score(), is("0-0"));
    }

    @Test
    public void record_when_home_team_scores() {
        FootballMatch match = new FootballMatch(5);


        match.scoreFor("Home");


        assertThat(match.score(), is("1-0"));
    }

    @Test
    public void record_when_away_team_scores() {
        FootballMatch match = new FootballMatch(5);


        match.scoreFor("Away");


        assertThat(match.score(), is("0-1"));
    }

    @Test
    public void report_game_is_being_played_if_no_one_has_won() {
        FootballMatch match = new FootballMatch(5);



        assertThat(match.status(), is("Playing"));
    }

    @Test
    public void report_game_has_been_won_by_home_team() {
        FootballMatch match = new FootballMatch(1);


        match.scoreFor("Home");


        assertThat(match.status(), is("Home team has won"));
    }
}
