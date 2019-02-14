package com.hangapp;

import java.util.Scanner;
import java.util.Random;


public class Hangman{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    // String[] guesses = {"Java", "Oracle", "Sun", "JRE", "Python"};
    String[] guesses = WordLists.wordList();

    boolean weArePlaying = true;
    while (weArePlaying) {
      System.out.println("Welcome to my game.");
      char[] randomWordToGues = guesses[random.nextInt(guesses.length)].toCharArray();
      int lives = 6;
      char[] playerGuesses = new char[randomWordToGues.length]; // _ _ _ _

      for (int i = 0; i < playerGuesses.length; i++){
        playerGuesses[i] = '_';
      }

      boolean wordIsGuessed = false;

      int correctCharsBefore = 0;
      int correctCharsAfter = 0;

      while (!wordIsGuessed && lives != 0){
        System.out.print("Current guesses: ");
        printArray(playerGuesses);
        System.out.printf("You have %d lives left.\n", lives);
        System.out.println("Enter a single character");
        char input = scanner.nextLine().charAt(0);

        System.out.print("\033\143");



        for (int i = 0; i < randomWordToGues.length ; i++){
          if (Character.toLowerCase(randomWordToGues[i]) == Character.toLowerCase(input)) {
            playerGuesses[i] = randomWordToGues[i];

          }
        }
        correctCharsAfter = 0;
        for (int i = 0; i < playerGuesses.length; i++){
          if (playerGuesses[i] != '_') {
            correctCharsAfter +=1;
          }
        }
        if (correctCharsAfter == correctCharsBefore) {
          lives -= 1;
        }
        correctCharsBefore = correctCharsAfter;

        if (isTheWordGuessed(playerGuesses)) {
          wordIsGuessed = true;
          System.out.println("Congratulations you won!");
        }

      }
      if (lives==0) {
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
      System.out.print(array[i] + " ");
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
