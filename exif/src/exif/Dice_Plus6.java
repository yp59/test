package exif;

public class Dice_Plus6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1 5, 2 4, 3 3, 4 2, 5 1
		
		String dice1="1���ֻ��� ����";
				String dice2="2���ֻ��� ����";
				
		
		for(int i=1;i<=6;i++) {
			
			for(int j=1;j<=6;j++) {
				
				if(i+j==6) {
					
					System.out.println(dice1+" : "+i+" "+dice2+" : "+j);
					
					
				}
				
				
			}
			
		}
		
	    
	}//�� �ֻ����� ���� �� 6�϶� ��� ����� �� ��°�

}
