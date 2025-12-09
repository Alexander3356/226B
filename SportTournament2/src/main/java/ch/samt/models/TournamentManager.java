package ch.samt.models;

import ch.samt.Comparator.TeamNameComparator;
import ch.samt.Comparator.TeamPoinstComparator;

import java.util.*;

public class TournamentManager {

        private Set<Team> teams = new HashSet<>();
        private HashMap<String, Integer> teamScore = new HashMap<>();

        public void addTeam(Team team) {
            if (teams.add(team)){
                teamScore.put(team.getName(), team.getTotalPoints());
            }
        }

        public void updateScore(String teamName, int delta){
            teamScore.put(teamName, teamScore.get(teamName) + delta);
            for(Team team : teams){
                if(team.getName().equals(teamName)){
                    team.setTotalPoints(team.getTotalPoints() + delta);
                }
            }
        }

        public void printTeamsSortedByNatural(){
            ArrayList<Team> sortedTeams = new ArrayList<>(teams);
            Collections.sort(sortedTeams);
            System.out.println("\n*** Squadre in ordine naturale (punteggio decrescente) ***");
            for(Team team : sortedTeams){
                System.out.println(team);
            }
        }

        public void printTeamsSortedBySport(){
            ArrayList<Team> sortedTeams = new ArrayList<>(teams);
            Collections.sort(sortedTeams, new TeamPoinstComparator());
            System.out.println("\n*** Squadre ordinate per sport ***");
            for(Team team : sortedTeams){
                System.out.println(team);
            }
        }

        public void printTeamsSortedBySchool(){
            ArrayList<Team> sortedTeams = new ArrayList<>(teams);
            Collections.sort(sortedTeams, new TeamNameComparator());
            System.out.println("\n*** Squadre ordinate per scuola ***");
            for(Team team : sortedTeams){
                System.out.println(team);
            }
        }

        public void printScores(){
            for(Team team : teams){
                System.out.println(team);
            }
        }

}
