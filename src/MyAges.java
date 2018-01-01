import javax.swing.JOptionPane;

public class MyAges {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int x = Integer.parseInt(age);
	for(int i = 0; i <= x; i++) {
		System.out.println(i);
	}
}
}
