package Menu;

import Demo.Application;
import Factory.IObjectFactory;
import Factory.ObjectFactory;
import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateUserMenu {

    Scanner scanner;
    String name;
    String email;
    int age;

    User user;

    ArrayList<User> users;
    ArrayList<Team> teams;

    ArrayList<Tournament> tournaments;

    IObjectFactory objectFactory;
    public CreateUserMenu() {

        this.scanner = Application.scanner;
        this.users = Application.users;
        this.teams = Application.teams;
        this.tournaments = Application.tournaments;
        objectFactory = new ObjectFactory();
        System.out.println("Create a new user");

        System.out.print("Name : ");
        this.name = scanner.next();

        System.out.print("Email : ");
        this.email = scanner.next();

        System.out.print("Age :");
        this.age = scanner.nextInt();

        this.user = objectFactory.createUser(name,email,age);

        System.out.println("User " + user + " created successfully");

        users.add(user);
        new MainMenu();

    }
}
