package com.hangapp;

import java.util.Scanner;
import java.util.Random;


public class Hangman{
  /** Classic Hangman Game.*/
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    /** Picks a random choice from the wordlist.*/
    String[] guesses = WordLists.wordList();
    AsciiStrings asciis = new AsciiStrings();
    boolean inMenu = true;
    boolean weArePlaying = false;
    /** Main menu starst here*/
    asciis.mainMenu(0);
    int k= 0;
    while(inMenu){
      System.out.print("Choose menu option(1-2.): ");
      char input = scanner.nextLine().charAt(0);

      if (input == '1') {
        weArePlaying = true;
        inMenu = false;
      } else if (input == '2') {
        weArePlaying = false;
        asciis.mainMenu(0);
        inMenu = false;
      } else {
        asciis.mainMenu(0);
        System.out.println("Invalid input");
      }

    }
    /** Swithc up the '_' charachter with the guessed letter.*/
    while (weArePlaying) {
      asciis.mainMenu(1);
      char[] randomWordToGues = guesses[random.nextInt(guesses.length)].toCharArray();
      int lives = 7;
      char[] playerGuesses = new char[randomWordToGues.length];
      char[] wrongGuesses = new char[65];

      for (int i = 0; i < playerGuesses.length; i++){
        playerGuesses[i] = '_';
      }

      boolean wordIsGuessed = false;

      int correctCharsBefore = 0;
      int correctCharsAfter = 0;

      while (!wordIsGuessed && lives != 0){
        asciis.hangedMan(lives);
        System.out.print("The word: ");
        printArray(playerGuesses);
        System.out.printf("You have %d lives left.\n", lives);
        System.out.print("Enter a single character: ");
        char input = scanner.nextLine().charAt(0);

        asciis.mainMenu(1);

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
          System.out.println("Congratulations you won!\n");
          System.out.print("The solution was: ");
          printArray(playerGuesses);
          System.out.println("");
        }

      }
      if (lives==0) {
        asciis.hangedMan(0);
        System.out.println("You ran out of guesses. :/\n");
      }
      System.out.println("Do you want to play again?");
      System.out.println("Type 'q' to quit");
      System.out.println("or any other character to play again:");
      String anotherGame = scanner.nextLine();
      if (anotherGame.equals("q")){
        weArePlaying = false;
     }
    }

    System.out.println("You coward!");

  }

  public static void printArray(char[] array) {
    for (int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  /** If the word guessed, print the word onto console*/
  public static boolean isTheWordGuessed(char[] array) {
    for (int i = 0; i < array.length; i++){
      if (array[i] == '_') return false;
    }
    return true;
  }
}
