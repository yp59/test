package exif;
import java.util.*;

public class dot_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner input=new Scanner(System.in);
	
		
		int sum=0;
		
		for(int x=1;x<=20;x++) {
		
			if(x%2==1) {
				
				if(x%3!=0) {
					
					sum+=x;
					
				}
				
				
			}
			
			
			
		}
		System.out.println(sum);
	}

}
//2의 배수와 3의 배수가 아닌 20까지의 합