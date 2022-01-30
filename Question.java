//Jonathan Anz
//CS1400
//Assignment 4
//October 31, 2021

public class Question
{
    String question;
    String possibleAnswer1;
    String possibleAnswer2;
    String possibleAnswer3;
    String possibleAnswer4;
    int correctAnswer;

    public Question(String inputQuestion,
                    String inputAnswer1,
                    String inputAnswer2,
                    String inputAnswer3,
                    String inputAnswer4,
                    int inputCorrectAnswer)
    {
        question = inputQuestion;
        possibleAnswer1 = inputAnswer1;
        possibleAnswer2 = inputAnswer2;
        possibleAnswer3 = inputAnswer3;
        possibleAnswer4 = inputAnswer4;
        correctAnswer = inputCorrectAnswer;
    }

    public String getQuestion()
    {
        return question;
    }

    public String getPossibleAnswer(int num)
    {
        String error = "Enter a value between 1 and 4";

        if(num == 1)
        {
            return possibleAnswer1;
        }
        else if(num == 2)
        {
            return possibleAnswer2;
        }
        else if(num == 3)
        {
            return possibleAnswer3;
        }
        else if(num == 4)
        {
            return possibleAnswer4;
        }
        else
        {
            return error;
        }
    }

    public int getCorrectAnswer()
    {
        return correctAnswer;
    }
}