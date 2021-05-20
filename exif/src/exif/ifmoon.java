package exif;
import javax.swing.*;
public class ifmoon {

	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("x°ª");
		int x = Integer.parseInt(input);

		if(x>10) {
			
			if(x<20) {
				
				System.out.println(true);
				
			}
			else {
				System.out.println(false);
				
			}
		}
		else {
			System.out.println(false);
			
		}
		
	}
}
