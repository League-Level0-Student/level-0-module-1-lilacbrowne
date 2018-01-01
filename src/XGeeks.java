import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String elisuperpower = "writing code";
String lilasuperpower = "computer hacking";
String iansuperpower = "making games";
String ottosuperpower = "scaring off intruders";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("What is your name?");
		// 3. Show the superpower in a pop-up, depending on the name entered.
if(name.equalsIgnoreCase("Lila")) {
	JOptionPane.showMessageDialog(null, "Lila's superpower is " +lilasuperpower +"!");
} else if(name.equalsIgnoreCase("Ian")) {
	JOptionPane.showMessageDialog(null, "Ian's superpower is " +iansuperpower +"!");
} else if(name.equalsIgnoreCase("Eli")) {
	JOptionPane.showMessageDialog(null, "Eli's superpower is " +elisuperpower +"!");
} else if (name.equalsIgnoreCase("Otto")) {
	JOptionPane.showMessageDialog(null, "Otto's superpower is " + ottosuperpower +"!");
} else {
	JOptionPane.showMessageDialog(null, "Oops, I guess you don't have a superpower!");
}
	}
}
