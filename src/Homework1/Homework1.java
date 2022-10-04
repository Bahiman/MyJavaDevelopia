package Homework1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<String> answers = new ArrayList<>();
//
//        int points = 0;
//
//        System.out.println("What is the unit of gravity?");
//
//        String unit = scanner.next();
//
//        if(unit.toLowerCase(Locale.ROOT).equals("g")){
//            System.out.println("Correct!");
//            points+=10;
//        } else {
//            System.out.println("Incorrect");
//        }
//
//        System.out.println("What is the most visited city in the world");
//
//        String city = scanner.next();
//
//        if(city.toLowerCase(Locale.ROOT).equals("bangkok")){
//            System.out.println("Correct");
//
//            points += 10;
//        } else{
//            System.out.println("Incorrect");
//        }
//
//        System.out.println("Which language has the more native speakers");
//
//        String language = scanner.next();
//
//        if(language.toLowerCase(Locale.ROOT).equals("spanish")){
//            System.out.println("Correct");
//
//            points += 10;
//        } else {
//            System.out.println("Incorrect");
//        }
//
//        System.out.println("What country has the highest life expectancy?");
//
//        String life = scanner.next();
//
//        if(life.toLowerCase(Locale.ROOT).equals("hong_kong")){
//            System.out.println("Correct!");
//            points +=10;
//        } else {
//            System.out.println("Incorrect");
//        }
//
//        System.out.println("How many minutes are in a full week?");
//
//        int minutes = scanner.nextInt();
//
//        if(minutes == 10080){
//            System.out.println("Correct");
//
//            points += 10;
//        }  else{
//            System.out.println("Incorrect");
//        }
//
//        if(points < 30){
//            System.out.println("To my dismay, u have only earned: " + points + " points");
//        } else{
//            System.out.println("Congratulations, you have earned: " + points + " points");
//        }

        // HOMEWORK2

        ArrayList<Integer> integers = new ArrayList<Integer>();

        for(int i = 0; i <= 100; i++) integers.add(randomNumber());

        for(final Integer f : integers){
            System.out.println(f);
            if(f%3 == 0 && f%5 == 0) System.out.println("The number is divisible by 3 and by 5");
            else if(f%2 == 0) System.out.println("The number is even");
            else if(f%3 == 0) System.out.println("Divisible by 3");
            else if (f%5 == 0) System.out.println("Divisible by 5");
            else System.out.println("What the hell is ur number then?");
        }

    }



     static int randomNumber(){

        int return_number = 0;

        return_number = (int) (Math.random() * 50 + 10);

        return return_number;
    }
}
