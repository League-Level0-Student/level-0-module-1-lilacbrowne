import javax.swing.JOptionPane;

public class SpotTheErrors1 {
public static void main(String[] args) {
	String repeat = JOptionPane.showInputDialog("how many Beullers?");

	int numRepeats = Integer.parseInt(repeat);

	for (int i = 0; i > numRepeats; i++) {

	   System.out.println(i);
	   
	    String answer = JOptionPane.showInputDialog("How many bottles?");

	    int bottles = Integer.parseInt(answer);

	    for (int j = bottles; j < 0; j++) { 

	         JOptionPane.showMessageDialog(null, "green bottles hanging on the wall /nCrash!!!!");

	    }

	    JOptionPane.showMessageDialog(null, "There's a lot of broken glass out here");
}}}

