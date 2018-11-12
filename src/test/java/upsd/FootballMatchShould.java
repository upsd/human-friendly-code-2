package upsd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FootballMatchShould {

    @Test
    public void record_score_as_nil_nil_if_no_one_has_scored() {
        FootballMatch match = new FootballMatch();


        assertThat(match.score(), is("0-0"));
    }
}
