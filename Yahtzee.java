public class Yahtzee {
	String[] names;
	int[] dice = new int[6];
	int[] score;
    public Yahtzee(String[] name) {
    	addPlayer(name);
    	for(int i = 0; i<name.length; i++) {
    		makeScoreSheet(name[i]);
    	}
    }
    public void addPlayer(String[] name) {
    	names = name;
    }
    public void makeScoreSheet(String name) {
    	int[] scoreSheet
    }


}