package Menu;

import Demo.Application;
import Factory.IObjectFactory;
import Factory.ObjectFactory;
import Team.Team;
import Tournament.FootballTournament;
import Tournament.BasketballTournament;
import Tournament.VolleyballTournament;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateTournamentMenu {

    Scanner scanner;
    ArrayList<User> users;
    ArrayList<Team> teams;

    ArrayList<Tournament> tournaments;

    String name;
    String type;
    int size;

    ArrayList<Team> members;
    Tournament tournament;

    IObjectFactory objectFactory;

    public CreateTournamentMenu(){

        this.scanner = Application.scanner;
        this.users = Application.users;
        this.teams = Application.teams;
        this.tournaments = Application.tournaments;
        this.members = new ArrayList<>();
        objectFactory = new ObjectFactory();


        System.out.println("Create a new tournament");

        System.out.println("1) Football Team");
        System.out.println("2) Basketball Team");
        System.out.println("3) Volleyball Team");

        this.type = scanner.next();

        System.out.print("Name : ");
        this.name = scanner.next();

        System.out.println("Size : ");
        this.size = scanner.nextInt();

        objectFactory.createTournament(type,name,size,members);


        if ( tournament != null) {
            System.out.println("Tournament " + tournament + " created successfully");
            tournaments.add(tournament);
        }


        new MainMenu();
    }
}
