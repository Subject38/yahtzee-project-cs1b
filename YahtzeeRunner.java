import java.util.Arrays;
import static java.lang.System.*;
import java.util.Scanner;
public class YahtzeeRunner {
public static void main(String[] args) {
   	    dice d = new dice();
   	    Scanner kb = new Scanner(in);
        int turns=0;
        //prompt the user for number of players
   	    while(turns < 2 || turns >6) {
   		   out.print("Enter the number of players who are playing(at least two but no more than 6)");
   		   turns = kb.nextInt();
   	   }
   	    //Prompt the users for all of the names
   	    String[] names = new String[6];
   	    int count = 0;
   	    while(count<turns) {
   		   out.print("Enter the names of each of your players ->");
   		   names[count] = kb.next();
   	       count++;
       	}
       	//For instantiating all the scoreSheets
        ScoreSheet player1 = new ScoreSheet(names[0]);
        ScoreSheet player2 = new ScoreSheet(names[1]);
        ScoreSheet player3 = new ScoreSheet(names[2]);
        ScoreSheet player4 = new ScoreSheet(names[3]);
        ScoreSheet player5 = new ScoreSheet(names[4]);
        ScoreSheet player6 = new ScoreSheet(names[5]);
       	//The below code is for the actual playing phase
        for(int i = 0; i<13; i++) {
         for(int c = 0; c<turns; c++) {
         out.print("It is now ");
         if(c == 0) out.print(names[0]);
         if(c == 1) out.print(names[1]);
         if(c == 2) out.print(names[2]);
         if(c == 3) out.print(names[3]);
         if(c == 4) out.print(names[4]);
         if(c == 5) out.print(names[5]);
         out.println("'s turn");
         out.println("Because this is your first roll the dice will automatically be rolled.");
         out.println("ScoreSheet:");
         if(c == 0) out.println(player1);
         if(c == 1) out.println(player2);
         if(c == 2) out.println(player3);
         if(c == 3) out.println(player4);
         if(c == 4) out.println(player5);
         if(c == 5) out.println(player6);
         int[] dice = d.getDice();
         for(int die = 0;die<5;die++) {
         	dice[die] = d.rollDice(dice[die]);
         }
         out.println("These are your dice: " + Arrays.toString(d.getDice()));
         d.checkIfReroll(dice);
         out.println("These are your dice: " + Arrays.toString(d.getDice()));
         d.checkIfReroll(dice);
         out.println("These are your dice: " + Arrays.toString(d.getDice()));
         if(c == 0) {
         	player1.score(dice);
         	out.println(player1);
         }
         if(c == 1) {
         	player2.score(dice);
         	out.println(player2);
         }
         if(c == 2) {
         	player3.score(dice);
         	out.println(player3);
         }
         if(c == 3) {
         	player4.score(dice);
         	out.println(player4);
         }
         if(c == 4) {
         	player5.score(dice);
         	out.println(player5);
         }
         if(c == 5) {
         	player6.score(dice);
         	out.println(player6);
         }
        }
        }
        //ENDGAME
		out.println("The final scoreSheet for " + names[0] + " is:");
		out.println(player1);
		out.println("The upper category score is " + player1.addUpper());
		out.println("The lower category score is " + player1.addLower());
		out.println("The final score for " + names[0] + " is:" + player1.totalScore());
		
		out.println("The final scoreSheet for " + names[1] + " is:");
		out.println(player2);
		out.println("The upper category score is " + player2.addUpper());
		out.println("The lower category score is " + player2.addLower());
		out.println("The final score for " + names[1] + " is:" + player2.totalScore());
		
		if(turns>2){
			out.println("The final scoreSheet for " + names[2] + " is:");
			out.println(player3);
			out.println("The upper category score is " + player3.addUpper());
			out.println("The lower category score is " + player3.addLower());
			out.println("The final score for " + names[2] + " is:" + player3.totalScore());
		}
		
		if(turns>3){
			out.println("The final scoreSheet for " + names[3] + " is:");
			out.println(player4);
			out.println("The upper category score is " + player4.addUpper());
			out.println("The lower category score is " + player4.addLower());
			out.println("The final score for " + names[3] + " is:" + player4.totalScore());
		}
		
		if(turns>4){
			out.println("The final scoreSheet for " + names[4] + " is:");
			out.println(player5);
			out.println("The upper category score is " + player5.addUpper());
			out.println("The lower category score is " + player5.addLower());
			out.println("The final score for " + names[4] + " is:" + player5.totalScore());
		}
		
		if(turns>5){
			out.println("The final scoreSheet for " + names[5] + " is:");
			out.println(player6);
			out.println("The upper category score is " + player6.addUpper());
			out.println("The lower category score is " + player6.addLower());
			out.println("The final score for " + names[5] + " is:" + player6.totalScore());
		}
		int[] scores = {player1.totalScore(), player2.totalScore(), player3.totalScore(), player4.totalScore(), player5.totalScore(), player6.totalScore()};
		Arrays.sort(scores);
		out.print("The winner of this game of Yahtzee is ");
		if(scores[5] == player1.totalScore())
            out.println(names[0]);
		if(scores[5] == player2.totalScore())
            out.println(names[1]);
		if(scores[5] == player3.totalScore())
            out.println(names[2]);
		if(scores[5] == player4.totalScore())
            out.println(names[3]);
		if(scores[5] == player5.totalScore())
            out.println(names[4]);
		if(scores[5] == player6.totalScore())
            out.println(names[5]);
    }

}