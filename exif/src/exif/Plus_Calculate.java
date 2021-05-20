package exif;

public class Plus_Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int Sum=0;
		int SumPlus=0;
		
		for(int i=1;i<=10;i++) {
			
			Sum+=i;	
			
			SumPlus+=Sum;
		}
			
			System.out.println(SumPlus);
		
		
	}

}
//1+(1+2)+(1+2+3)+(1+2+3+4)+....+(1+...+10)=220