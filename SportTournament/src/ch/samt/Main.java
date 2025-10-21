package ch.samt;

import ch.samt.Models.Team;
import ch.samt.Models.TournamentManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Team> teams = new ArrayList<>();

        teams.add(new Team("Falcons", "Liceo Galileo", "Calcio", 30));
        teams.add(new Team("Tigers", "Istituto Marconi", "Basket", 25));
        teams.add(new Team("Wolves", "Liceo Einstein", "Pallavolo", 25));
        teams.add(new Team("Eagles", "Istituto Newton", "Calcio", 32));
        teams.add(new Team("Sharks", "Liceo Fermi", "Basket", 27));

        teams.add(new Team("Lupi Verdi", "Scuola Alfa", "Calcio", 14));
        boolean added = teams.add(new Team("Lupi Verdi", "Scuola Alfa", "Basket", 18));

        TournamentManager tournament = new TournamentManager();
        for(Team team : teams){
            tournament.addTeam(team);
        }

        tournament.printTeamsSortedByNatural();
        tournament.printTeamsSortedBySchool();
        tournament.printTeamsSortedBySport();

        tournament.updateScore("Sharks",3);

        tournament.printTeamsSortedByNatural();

    }
}