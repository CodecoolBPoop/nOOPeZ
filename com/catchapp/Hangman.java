// package com.catchapp;

import java.util.Scanner;
import java.util.Random;


public class Hangman{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] guesses = {"Andris", "Laci", "Bence"};

    boolean weArePlaying = true;
    while (weArePlaying) {
      System.out.println("Welcome to my game.");
      char[] randomWordToGues = guesses[random.nextInt(guesses.length)].toCharArray();
      int amountOfGuesses = randomWordToGues.length; //100
      char[] playerGuesses = new char[amountOfGuesses]; // _ _ _ _

      for (int i = 0; i < playerGuesses.length; i++){
        playerGuesses[i] = '_';
      }

      boolean wordIsGuessed = false;
      int tries = 0;

      while (!wordIsGuessed && tries != amountOfGuesses){
        System.out.print("Current guesses");
        printArray(playerGuesses);
        System.out.print("You have %d tries left.\n", amountOfGuesses - tries);
        System.out.println("Enter a single character");
        char input = scanner.nextLine().charAt(0);
        tries++;

        if (input == '-') {
          weArePlaying = false;
          wordIsGuessed = true;
        } else {
          for (int i = 0; i < randomWordToGues.length ; i++){
            if (randomWordToGues[i] == input) {
              playerGuess[i] = input;
            }
          }
          if (isTheWordGuessed(playerGuess)) {
            wordIsGuessed = true;
            System.out.println("Congratulations you won!");
          }
        }
      }
      if (!wordIsGuessed) {
        System.out.println("You ran out of guesses. :/");
      }
      System.out.println("Do you want to play again? (yes/no)");
      String anotherGame = scanner.nextLine();
      if (anotherGame.equals("no")) weArePlaying = false;
    }

    System.out.println("Game over.");

  }

  public static void printArray(char[] array) {
    for (int i = 0; i < array.length; i++){
      System.out.print(array[i + " "]);
    }
    System.out.println();
  }

  public static boolean isTheWordGuessed(char[] array) {
    for (int i = 0; i < array.length; i++){
      if (array[i] == '_') return false;
    }
    return true;
  }
}
