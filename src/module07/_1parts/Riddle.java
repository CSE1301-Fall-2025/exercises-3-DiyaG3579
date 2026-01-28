package module07._1parts;

public class Riddle
{
   private String question;
   private String answer;
   
   
   // constructor
   public Riddle(String initQuestion, String initAnswer){
      // set the instance variables to the init parameter variables
      question = initQuestion;
      answer = initAnswer;
   }
   
   // Print riddle question
   public void printQuestion(){
     System.out.println("Question: " + question);
   }
   
   // Print riddle answer
   public void printAnswer(){
     // print out the riddle answer with System.out.println
     System.out.println("Answer: " + answer);
   }
   
   // main method for testing
   public static void main(String[] args){
      // call the constructor to create 2 new Riddle objects
      Riddle r1 = new Riddle("What is something no one wants, but also something no one wants to lose", "A Lawsuit");
      Riddle r2 = new Riddle("What is the best type of monster to scam", "Vampires, because they're suckers");
      // call their printQuestion() and printAnswer methods
      r1.printQuestion();
      r1.printAnswer();
      r2.printQuestion();
   }
}
