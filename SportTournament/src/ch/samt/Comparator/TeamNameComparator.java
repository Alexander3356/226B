package ch.samt.Comparator;

import ch.samt.Models.Team;

import java.util.Comparator;

public class TeamNameComparator implements Comparator<Team> {

    @Override
    public int compare(Team t1, Team t2) {
        return t1.getName().compareTo(t2.getName());
    }

}
