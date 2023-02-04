package SnakeAndLadder;

import java.util.Scanner;

public class SnakeAndLadderTest {
    public static void main(String[] args) {
        Scanner inputnumber = new Scanner(System.in);
        System.out.println("Enter the names of player");
        String player1 = inputnumber.next();
        String player2 = inputnumber.next();
        int player1position = 0;
        int player2position = 0;
        int Dice = 0;


        while (player1position != 100 && player2position != 100) {
            //to get random number using Math.random
            Dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Enter the Dice:" + Dice);
            if ((player1position + Dice) <= 100)

                player1position = Dice + player1position;
            if (player1position == 9) {  // for ladder
                System.out.println("player1position moves to 30");
            } else if (player1position == 25) {
                System.out.println("player1position climb to 44");
            } else if (player1position == 41) {
                System.out.println("player1position climb to 62");
            } else if (player1position == 74) {
                System.out.println("player1position climb to 95");
            } else {
                System.out.println("No ladder to move");
            }

            //for snakes moves for player1
            if (player1position == 37) {
                System.out.println("player1position goes down to 18");
            } else if (player1position == 65) {
                System.out.println(" player1position goes down to 36");
            } else if (player1position == 70) {
                System.out.println(" player1position goes down to 54");
            } else if (player1position == 81) {
                System.out.println(" player1position goes down to 77");
            } else {
                System.out.println(" No snakes byte ");
            }


            Dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Enter the Dice:" + Dice);
            if ((player2position + Dice) <= 100)

                player1position = Dice + player1position;
            if ((player2position + Dice) <= 100)

                player2position = Dice + player2position;
            if (player2position == 9) {  // for ladder moves for player2
                System.out.println("player2position climb to 30");
            } else if (player2position == 25) {
                System.out.println("player2position climb to 44");
            } else if (player2position == 41) {
                System.out.println("player2position climb to 62");
            } else if (player2position == 74) {
                System.out.println("player2position climb to 95");
            } else {
                System.out.println("No ladder to move");
            }

            //for snakes moves for player2
            if (player2position == 37) {
                System.out.println("player1position goes down to 18");
            } else if (player2position == 65) {
                System.out.println(" player1position goes down to 36");
            } else if (player2position == 70) {
                System.out.println(" player1position goes down to 54");
            } else if (player2position == 81) {
                System.out.println(" player1position goes down to 77");
            } else {
                System.out.println(" No snakes to goes down ");
            }
        }

        if (player1position >= 100) {
            System.out.println(" player1 is  winner");
        } else {
            System.out.println("player2 is loser");
        }
    }
}



















