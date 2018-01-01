import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog("What is your birthday? Enter it: mm/dd");
	if(birthday.equalsIgnoreCase("12/31")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	} else {
		JOptionPane.showMessageDialog(null, "Have a very merry Unbirthday!");
	}
}
}
