import static java.lang.System.*;
import java.util.Scanner;
public class dice{
	int[] dice = new int[5];
	Scanner kb = new Scanner(in);
	public dice() {
	}
	public int rollDice(int die) {
    die = (int)(Math.random()*(6-1+1)+1);
	return die;
    }
    public int[] getDice() {
    	return dice;
    }
    public void checkIfReroll(int[] dice) {
    	out.print("Would you like to roll again?(y/n)");
    	String input = kb.next();
    	switch(input.charAt(0)) {
    		case 'y': selectDiceToRoll();break;
    		case 'n': break;
    		case 'Y': selectDiceToRoll();break;
    		case 'N': break;
    		default: out.println("Is typing y or n really that bloody hard?"); checkIfReroll(dice); break;
    	}
    	}
    public void selectDiceToRoll() {
    	out.print("How many dice would you like to roll again? -> ");
    	int num = kb.nextInt();
    	int ind;
    	for(int i = 0; i<num; i++) {
    		out.print("Which dice would you like to roll(1 for the die furthest to the left and 5 for the die furthest to the right and press enter between each index)? -> ");
    		ind = kb.nextInt()-1;
    		dice[ind] = rollDice(dice[ind]);
    }
    }
}