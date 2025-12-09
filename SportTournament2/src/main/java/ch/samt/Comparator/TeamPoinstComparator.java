package ch.samt.Comparator;

import ch.samt.models.Team;

import java.util.Comparator;

public class TeamPoinstComparator implements Comparator<Team> {
    @Override
    public int compare(Team t1, Team t2) {
        return Integer.compare(t1.getTotalPoints(), t2.getTotalPoints());
    }
}
