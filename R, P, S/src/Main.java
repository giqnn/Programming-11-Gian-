import java.util.Scanner; //imports the scanner for user interaction

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Lets user interaction
        int random = (int)(Math.random()*100); //This generates a random number between 0-99
        String Rock = "r"; //defines the variable for rock
        String Paper = "p";//defines the variable for paper
        String Scissors = "s"; //defines the variable for scissors
        String Choice; //defines the variable for choice as a string in the console.

        System.out.println("Choose rock, paper or scissors. Pick 'r' for rock, 'p' for paper and 's' for scissors");
        Choice = scan.next(); //Allows user interaction through the console.
        if(Choice.equals(Rock) && random <= 39){
            System.out.println("You win!");
            System.out.println("Computer choice: scissors  Player choice: rock");
        }// All win statements have the condition that'll only run if the number generated is less than or equal to 39 and the choice between rock,paper or scissors.
        else if( (Choice.equals(Rock)) && (random > 39 && random < 59)){
            System.out.println("Draw!");
            System.out.println("Computer choice: rock  Player Choice: rock");
        }// All draw statements have the condition that'll only run if the number generated is between 39-59 and the choice between rock,paper or scissors.
        else if(Choice.equals(Rock) && random >= 59){
            System.out.println("You lost!");
            System.out.println("Computer choice: paper  Player choice: rock");
        }// all lose statements have the condition that'll only run if the number generated is more than or equal to 59 and the choice between rock,paper or scissors.
        else if(Choice.equals(Paper) && random <= 39){
            System.out.println("You win!");
            System.out.println("Computer choice: rock  Player choice: paper");
        }
        else if( (Choice.equals(Paper)) && (random > 39 && random < 59)){
            System.out.println("Draw!");
            System.out.println("Computer choice: paper  Player Choice: paper");
        }
        else if (Choice.equals(Paper) && random >= 59){
            System.out.println("You lost!");
            System.out.println("Computer choice scissors  Player choice: paper");
        }
        else if(Choice.equals(Scissors) && random <= 39){
            System.out.println("You win!");
            System.out.println("Computer choice: paper  Player choice: scissors");
        }
        else if( (Choice.equals(Scissors)) && (random > 39 && random < 59)){
            System.out.println("Draw!");
            System.out.println("Computer choice: scissors  Player Choice: scissors");
        }
        else if (Choice.equals(Scissors) && random >= 59){
            System.out.println("You lost!");
            System.out.println("Computer choice: rock  Player choice: scissors");
        }
        else{
            System.out.println("Invalid selection please play again!"); //if the user tries to print something other than the 3 choices it'll print this out.
        }
        }

    }





