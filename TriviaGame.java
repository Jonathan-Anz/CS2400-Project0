//Jonathan Anz
//CS1400
//Assignment 4
//October 31, 2021

//This comment is for CS2400-Project0

import java.util.Scanner;

public class TriviaGame
{
    public static void main(String[] args)
    {
        int input;
        int player1Points = 0;
        int player2Points = 0;
        Scanner keyboard = new Scanner(System.in);
        Question[] questions = {new Question("How many continents are there?", "6", "7", "5", "8", 2),
                                new Question("How tall is Mount Everest?", "8,848 m", "10,000 m", "7,565 m", "8,450 m", 1),
                                new Question("How many months are in a year?", "10", "9", "12", "14", 3),
                                new Question("What year was Google created?", "1999", "2000", "1995", "1998", 4),
                                new Question("What is the fastest land animal?", "Deer", "Turtle", "Cheetah", "Horse", 3),
                                new Question("Who painted the Mona Lisa?", "Leonardo da Vinci", "Claude Monet", "Pablo Picasso", "Michelangelo", 1),
                                new Question("What year did WWII start?", "1935", "1939", "1942", "1945", 2),
                                new Question("How tall is the Eiffel Tower?", "250 m", "400 m", "385 m", "324 m", 4),
                                new Question("What year did the Titanic sink?", "1910", "1915", "1912", "1918", 3),
                                new Question("What is the biggest ocean in the world?", "Pacific", "Atlantic", "Indian", "Arctic", 1)};

        System.out.println("Welcome to Trivia!");
        System.out.println("Player 1 goes first:");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("");
            System.out.println(questions[i].getQuestion());
            for(int j = 1; j < 5; j++)
            {
                System.out.println(j + ". " + questions[i].getPossibleAnswer(j));
            }
            System.out.print("Answer: ");
            input = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("");
            if(input == questions[i].getCorrectAnswer())
            {
                System.out.println("Correct! You get a point!");
                player1Points++;
            }
            else
            {
                System.out.print("Incorrect. The answer was: ");
                System.out.println(questions[i].getPossibleAnswer(questions[i].getCorrectAnswer()));
            }
        }

        System.out.println("");
        System.out.println("Now Player 2:");
        for(int i = 5; i < 10; i++)
        {
            System.out.println("");
            System.out.println(questions[i].getQuestion());
            for(int j = 1; j < 5; j++)
            {
                System.out.println(j + ". " + questions[i].getPossibleAnswer(j));
            }
            System.out.print("Answer: ");
            input = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("");
            if(input == questions[i].getCorrectAnswer())
            {
                System.out.println("Correct! You get a point!");
                player2Points++;
            }
            else
            {
                System.out.print("Incorrect. The answer was: ");
                System.out.println(questions[i].getPossibleAnswer(questions[i].getCorrectAnswer()));
            }
        }

        System.out.println("");
        System.out.println("Player 1 earned " + player1Points + " points.");
        System.out.println("Player 2 earned " + player2Points + " points.");
        System.out.println("");
        if(player1Points > player2Points)
        {
            System.out.println("Player 1 wins!");
        }
        else if(player1Points < player2Points)
        {
            System.out.println("Player 2 wins!");
        }
        else
        {
            System.out.println("It's a tie!");
        }
    }
}