package SnakeAndLadder;

import java.util.Scanner;

public class SnakeAndLadderTest {
    public static void main(String[] args) {

        int player1position = 0;
        int player2position = 0;
        int Dice = 0;


        while (player1position != 100 && player2position != 100) {
            //to get random number using Math.random
            Dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Enter the Dice:" + Dice);
            if ((player1position + Dice) <= 100)

                player1position = Dice + player1position;
            System.out.println("player1 : " + Dice);
            if (player1position == 2) {  // for ladder
                System.out.println("player1position moves to 23");
            } else if (player1position == 8) {
                System.out.println("player1position climb to 34");
            } else if (player1position == 20) {
                System.out.println("player1position climb to 77");
            } else if (player1position == 32) {
                System.out.println("player1position climb to 68");
            } else if (player1position == 41) {
                System.out.println("player1position climb to 79");
            } else if (player1position == 74) {
                System.out.println("player1position climb to 88");
            } else {
                System.out.println("No ladder to move");
            }

            //for snakes moves for player1
            if (player1position == 12) {
                System.out.println("player1position goes down to 9");
            } else if (player1position == 38) {
                System.out.println(" player1position goes down to 15");
            } else if (player1position == 43) {
                System.out.println(" player1position goes down to 5");
            } else if (player1position == 53) {
                System.out.println(" player1position goes down to 33");
            } else if (player1position == 61) {
                System.out.println(" player1position goes down to 37");
            } else if (player1position == 97) {
                System.out.println(" player1position goes down to 25");
            } else {
                System.out.println(" No snakes byte ");
            }


            Dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Enter the Dice:" + Dice);
            if ((player2position + Dice) <= 100)

                player1position = Dice + player1position;
            if ((player2position + Dice) <= 100)

                player2position = Dice + player2position;
            System.out.println("player1 : " + Dice);
            if (player2position == 2) {  // for ladder
                System.out.println("player2position moves to 23");
            } else if (player2position == 8) {
                System.out.println("player2position climb to 34");
            } else if (player2position == 20) {
                System.out.println("player2position climb to 77");
            } else if (player2position == 32) {
                System.out.println("player2position climb to 68");
            } else if (player2position == 41) {
                System.out.println("player2position climb to 79");
            } else if (player2position == 74) {
                System.out.println("player2position climb to 88");
            } else {
                System.out.println("No ladder to move");
            }

            //for snakes moves for player2
            if (player2position == 12) {
                System.out.println("player2position goes down to 9");
            } else if (player2position == 38) {
                System.out.println(" player2position goes down to 15");
            } else if (player2position == 43) {
                System.out.println(" player2position goes down to 5");
            } else if (player2position == 53) {
                System.out.println(" player2position goes down to 33");
            } else if (player2position == 61) {
                System.out.println(" player2position goes down to 37");
            } else if (player2position == 97) {
                System.out.println(" player2position goes down to 25");
            } else {
                System.out.println(" No snakes byte ");
            }

            if (player1position == 100) {
                System.out.println(" Mohan is  winner");
            }
            if (player2position == 100) {
                System.out.println(" Praveen is winner");
            }
        }
    }
}




















