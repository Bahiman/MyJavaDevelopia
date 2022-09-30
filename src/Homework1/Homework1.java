package Homework1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> answers = new ArrayList<>();

        int points = 0;

        System.out.println("What is the unit of gravity?");

        String unit = scanner.next();

        if(unit.toLowerCase(Locale.ROOT).equals("g")){
            System.out.println("Correct!");
            points+=10;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println("What is the most visited city in the world");

        String city = scanner.next();

        if(city.toLowerCase(Locale.ROOT).equals("bangkok")){
            System.out.println("Correct");

            points += 10;
        } else{
            System.out.println("Incorrect");
        }

        System.out.println("Which language has the more native speakers");

        String language = scanner.next();

        if(language.toLowerCase(Locale.ROOT).equals("spanish")){
            System.out.println("Correct");

            points += 10;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println("What country has the highest life expectancy?");

        String life = scanner.next();

        if(life.toLowerCase(Locale.ROOT).equals("hong kong")){
            System.out.println("Correct!");
            points +=10;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println("How many minutes are in a full week?");

        int minutes = scanner.nextInt();

    }
}
