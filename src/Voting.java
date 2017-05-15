package for_loops;

import javax.swing.JOptionPane;

public class Voting {
	public static void main(String[] srgs) {
		String vote = JOptionPane.showInputDialog("How many people will enter the election?");
	int ans=Integer.parseInt(vote);
	int billnye = 1;
	int therock = 0;
	
	for (int i=ans;i>0;i--){
		vote = JOptionPane.showInputDialog("Who are you going to vote for?");
	if (vote.equals("Bill Nye")){
			billnye++;
			
	}
	if(vote.equals("The Rock")) {
			therock++;
}
	
			}
		
	if(therock<billnye){
		JOptionPane.showInputDialog("Bill Nye Wins!");
		}
	if(therock>billnye){
		JOptionPane.showInputDialog("The Rock Wins!");
		}
	}
}