package ch.samt.models;

import java.util.Objects;

public class Team implements Comparable<Team> {

    private String name;
    private String school;
    private String sport;
    private int totalPoints;

    public Team(String name, String school, String sport, int totalPoints) {
        this.name = name;
        this.school = school;
        this.sport = sport;
        this.totalPoints = totalPoints;
    }

    @Override
    public int compareTo(Team o) {
        if (this.totalPoints != o.totalPoints) {
            return Integer.compare(this.totalPoints, o.totalPoints);
        } else {
            return this.name.compareTo(o.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(school, team.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, school);
    }

    @Override
    public String toString() {
        return name + "(" + school + ')' + " - Sport: " + sport + " - Punti: " + totalPoints;
    }
}
