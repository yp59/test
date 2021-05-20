package exif;

public class Dice_Plus6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1 5, 2 4, 3 3, 4 2, 5 1
		
		String dice1="1번주사위 눈금";
				String dice2="2번주사위 눈금";
				
		
		for(int i=1;i<=6;i++) {
			
			for(int j=1;j<=6;j++) {
				
				if(i+j==6) {
					
					System.out.println(dice1+" : "+i+" "+dice2+" : "+j);
					
					
				}
				
				
			}
			
		}
		
	    
	}//두 주사위의 눈금 합 6일때 모든 경우의 수 출력값

}
