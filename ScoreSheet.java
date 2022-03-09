import java.util.Arrays;
import static java.lang.System.*;
import java.util.Scanner;

public class ScoreSheet {
	Scanner kb = new Scanner(in);
	String name;
	boolean isAcesFull;
	boolean isTwosFull;
	boolean isThreesFull;
	boolean isFoursFull;
	boolean isFivesFull;
	boolean isSixesFull;
	boolean is3ofKindFull;
	boolean is4ofKindFull;
	boolean isFullHouseFull;
	boolean isSmStraightFull;
	boolean isLgStraightFull;
	boolean isYahtzeeFull;
	boolean isChanceFull;
	int upperScore;
	int lowerScore;
	int aceScore;
	int twoScore;
	int threeScore;
	int fourScore;
	int fiveScore;
	int sixScore;
	int threeOfKindScore;
	int fourOfKindScore;
	int fullHouseScore;
	int smStraightScore;
	int lgStraightScore;
	int yahtzeeScore;
	int chanceScore;
	public ScoreSheet(String na) {
		name = na;
	}
	public void score(int[] dice) {
		int category=0;
		if(!isAcesFull) out.println("1) Score in aces(Will return " + countOnes(dice) + " as your score in that catergory)");
		if(isTwosFull==false) out.println("2) Score in twos(Will return " + (countTwos(dice)*2) + " as your score in that catergory)");
		if(isThreesFull==false) out.println("3) Score in threes(Will return " + (countThrees(dice)*3) + " as your score in that catergory)");
		if(isFoursFull==false) out.println("4) Score in fours(Will return " + (countFours(dice)*4) + " as your score in that catergory)");
		if(isFivesFull==false) out.println("5) Score in fives(Will return " + (countFives(dice)*5) + " as your score in that catergory)");
		if(isSixesFull==false) out.println("6) Score in sixes(Will return " + (countSixes(dice)*6) + " as your score in that catergory)");
		if(is3ofKindFull==false) out.println("7) Score in three of a kind(Will return " + check3OfKind(dice) + " as your score in that catergory)");
		if(is4ofKindFull==false) out.println("8) Score in four of a kind(Will return " + check4OfKind(dice) + " as your score in that catergory)");
		if(isFullHouseFull==false) out.println("9) Score in Full House(Will return " + checkFullHouse(dice) + " as your score in that catergory)");
		if(isSmStraightFull==false) out.println("10) Score in Small Straight(Will return " + checkSmStraight(dice) + " as your score in that catergory)");
		if(isLgStraightFull==false) out.println("11) Score in Large Straight(Will return " + checkLgStraight(dice) + " as your score in that catergory)");
		if(isYahtzeeFull==false) out.println("12) Score in the Yahtzee section(Will return " + checkYahtzee(dice) + " as your score in that catergory)");
		if(isChanceFull==false) out.println("13) Score in chance(Will return " + sumOfDice(dice) + " as your score in that catergory)");
		category = kb.nextInt();
		out.println();
		out.println();
		out.println();
		switch (category) {
			//aces
			case 1: if(isAcesFull) {out.println("Don't go trying to cheat the game.");score(dice);}; aceScore += countOnes(dice); isAcesFull=true; break;
			//twos
			case 2: if(isTwosFull) {out.println("Don't go trying to cheat the game.");score(dice);};twoScore += (countTwos(dice)*2); isTwosFull=true; break;
			//threes
   			case 3: if(isThreesFull) {out.println("Don't go trying to cheat the game.");score(dice);};threeScore += (countThrees(dice)*3); isThreesFull=true; break;
			//fours
  			case 4: if(isFoursFull) {out.println("Don't go trying to cheat the game.");score(dice);};fourScore += (countFours(dice)*4); isFoursFull=true; break;
			//fives
 			case 5: if(isFivesFull) {out.println("Don't go trying to cheat the game.");score(dice);};fiveScore += (countFives(dice)*5); isFivesFull=true; break;
			//sixes
 			case 6: if(isSixesFull) {out.println("Don't go trying to cheat the game.");score(dice);};sixScore += (countSixes(dice)*6); isSixesFull=true; break;
			//three of a kind
			case 7: if(is3ofKindFull) {out.println("Don't go trying to cheat the game.");score(dice);};if(isThreeOfKind(dice)) threeOfKindScore+=sumOfDice(dice); is3ofKindFull=true; break;
			//four of a kind
			case 8: if(is4ofKindFull) {out.println("Don't go trying to cheat the game.");score(dice);};if(isFourOfKind(dice)) fourOfKindScore+=sumOfDice(dice); is4ofKindFull=true; break;
			//full house
			case 9: if(isFullHouseFull) {out.println("Don't go trying to cheat the game.");score(dice);};if(isFullHouse(dice)) fullHouseScore+=25; isFullHouseFull=true; break;
			//small straight
			case 10: if(isSmStraightFull) {out.println("Don't go trying to cheat the game.");score(dice);};if(isSmStraight(dice)) smStraightScore+=30; isSmStraightFull=true; break;
			//large straight
			case 11: if(isYahtzeeFull) {out.println("Don't go trying to cheat the game.");score(dice);};if(isLgStraight(dice)) lgStraightScore+=40; isLgStraightFull=true; break;
			//Yahtzee
			case 12: if(isChanceFull) {out.println("Don't go trying to cheat the game.");score(dice);};if(isYahtzee(dice)) yahtzeeScore+=50; isYahtzeeFull=true; break;
			//Chance
			case 13: chanceScore+=sumOfDice(dice); isChanceFull=true; break;
			default: out.println("I'm pretty sure it was clear you need to choose a valid option...");score(dice); break;
		}
	}
	public String toString() {
	 String out = "";
  	if(isAcesFull)
   	out+="Your score on aces is " + aceScore + "\n";
	 else out+="You have not scored in aces yet.\n";

 	 if(isTwosFull)
  	 out+="Your score on twos is " + twoScore + "\n";
  	else out+="You have not scored in twos yet.\n";

  	if(isThreesFull)
   	out+="Your score on threes is " + threeScore + "\n";
  	else out+="You have not scored in threes yet.\n";

  	if(isFoursFull)
   	out+="Your score on fours is " + fourScore + "\n";
  	else out+="You have not scored in fours yet.\n";

  	if(isFivesFull)
   		out+="Your score on fives is " + fiveScore + "\n";
 	else out+="You have not scored in fives yet.\n";

  	if(isSixesFull)
   		out+="Your score on sixes is " + sixScore + "\n";
  	else out+="You have not scored in sixes yet.\n";

  	if(is3ofKindFull)
   out+="Your score on three of a kind is " + threeOfKindScore + "\n";
  else out+="You have not scored in three of a kind yet.\n";

  if(is4ofKindFull)
   out+="Your score on 4 of a kind is " + fourOfKindScore + "\n";
  else out+="You have not scored in 4 of a kind yet.\n";

  if(isFullHouseFull)
   out+="Your score on full house is " + fullHouseScore + "\n";
  else out+="You have not scored in full house yet.\n";

  if(isSmStraightFull)
   out+="Your score on small straight is " + smStraightScore + "\n";
  else out+="You have not scored in small straight yet.\n";

  if(isLgStraightFull)
   out+="Your score on large straight is " + lgStraightScore + "\n";
  else out+="You have not scored in large straight yet.\n";

  if(isYahtzeeFull)
   out+="You have scored a yahtzee for a score of " + yahtzeeScore + " points.\n";
  else out+="You have not scored a yahtzee yet.\n";

  if(isChanceFull)
   out+="Your score on chance is " + chanceScore + "\n";
  else out+="You have not scored in chance yet.\n";
  
  return out;

	}
 public boolean isTwoOfKind(int[] dice) {
     if(countOnes(dice) == 2) return true;
     if(countTwos(dice) == 2) return true;
     if(countThrees(dice) == 2) return true;
     if(countFours(dice) == 2) return true;
     if(countFives(dice) == 2) return true;
     if(countSixes(dice) == 2) return true;
     return false;
    }
    public boolean isThreeOfKind(int[] dice) {
     if(countOnes(dice) == 3 || isFourOfKind(dice) || isYahtzee(dice)) return true;
     if(countTwos(dice) == 3 || isFourOfKind(dice) || isYahtzee(dice)) return true;
     if(countThrees(dice) == 3 || isFourOfKind(dice) || isYahtzee(dice)) return true;
     if(countFours(dice) == 3 || isFourOfKind(dice) || isYahtzee(dice)) return true;
     if(countFives(dice) == 3 || isFourOfKind(dice) || isYahtzee(dice)) return true;
     if(countSixes(dice) == 3 || isFourOfKind(dice) || isYahtzee(dice)) return true;
     return false;
    }
    public boolean isFourOfKind(int[] dice) {
     if(countOnes(dice) == 4 || isYahtzee(dice)) return true;
     if(countTwos(dice) == 4 || isYahtzee(dice)) return true;
     if(countThrees(dice) == 4 || isYahtzee(dice)) return true;
     if(countFours(dice) == 4 || isYahtzee(dice)) return true;
     if(countFives(dice) == 4 || isYahtzee(dice)) return true;
     if(countSixes(dice) == 4 || isYahtzee(dice)) return true;
     return false;
    }
    public boolean isYahtzee(int[] dice) {
     if(countOnes(dice) == 5) return true;
     if(countTwos(dice) == 5) return true;
     if(countThrees(dice) == 5) return true;
     if(countFours(dice) == 5) return true;
     if(countFives(dice) == 5) return true;
     if(countSixes(dice) == 5) return true;
     return false;
    }

    public boolean isFullHouse(int[] dice){
     if(isThreeOfKind(dice) && isTwoOfKind(dice)) return true;
     return false;
    }
    public boolean isLgStraight(int[] dice) {
     Arrays.sort(dice);
     if(dice[0] == 1 && dice[1] == 2 && dice[2] == 3 && dice[3] == 4 && dice[4] == 5)
      return true;
     if(dice[0] == 2 && dice[1] == 3 && dice[2] == 4 && dice[3] == 5 && dice[4] == 6)
      return true;
     return false;
    }
    public boolean isSmStraight(int[] dice) {
     Arrays.sort(dice);
     if(dice[0] == 1 && dice[1] == 2 && dice[2] == 3 && dice[3] == 4)
      return true;
     if(dice[0] == 2 && dice[1] == 3 && dice[2] == 4 && dice[3] == 5)
      return true;
     if(dice[0] == 3 && dice[1] == 4 && dice[2] == 5 && dice[3] == 6)
      return true;
     return false;
    }
    //counting all the types of dice
    public int countOnes(int[] dice) {
     int count = 0;
     for(int i = 0; i<dice.length; i++) {
      if(dice[i] == 1)
       count++;
     }
     return count;
    }

   public int countTwos(int[] dice) {
     int count = 0;
     for(int i = 0; i<dice.length; i++) {
      if(dice[i] == 2)
       count++;
     }
     return count;
    }
    public int countThrees(int[] dice) {
     int count = 0;
     for(int i = 0; i<dice.length; i++) {
      if(dice[i] == 3)
       count++;
     }
     return count;
    }
    public int countFours(int[] dice) {
     int count = 0;
     for(int i = 0; i<dice.length; i++) {
      if(dice[i] == 4)
       count++;
     }
     return count;
    }
    public int countFives(int[] dice) {
     int count = 0;
     for(int i = 0; i<dice.length; i++) {
      if(dice[i] == 5)
       count++;
     }
     return count;
    }
    public int countSixes(int[] dice) {
     int count = 0;
     for(int i = 0; i<dice.length; i++) {
      if(dice[i] == 6)
       count++;
     }
     return count;
    }
    //For returning the possible score in a category
    public int sumOfDice(int[] dice) {
    	int sum=0;
    	for(int i = 0; i < 5; i++) {
    		sum+=dice[i];
    	}
    	return sum;	
    }
    public int check3OfKind(int[] dice) {
    	if(isThreeOfKind(dice)) return sumOfDice(dice);
    	return 0;
    }
    public int check4OfKind(int[] dice) {
    	if(isFourOfKind(dice)) return sumOfDice(dice);
    	return 0;
    }
    public int checkFullHouse(int[] dice) {
    	if(isFullHouse(dice)) return 25;
    	return 0;
    }
    public int checkSmStraight(int[] dice) {
    	if(isSmStraight(dice)) return 30;
    	return 0;
    }
    public int checkLgStraight(int[] dice) {
    	if(isLgStraight(dice)) return 40;
    	return 0;
    }
    public int checkYahtzee(int[] dice) {
    	if(isYahtzee(dice)) return 50;
    	return 0;
    }
    public int addUpper() {
    	upperScore=(aceScore+twoScore+threeScore+fourScore+fiveScore+sixScore);
    	if(upperScore > 63) upperScore+=35;
    	return upperScore;
    }
    public int addLower() {
    	lowerScore=(threeOfKindScore+fourOfKindScore+fullHouseScore+smStraightScore+lgStraightScore+yahtzeeScore+chanceScore);
    	return lowerScore;
    }
    public int totalScore() {
    	int total=0;
    	total+=addUpper();
    	total+=addLower();
    	return total;
    }
}