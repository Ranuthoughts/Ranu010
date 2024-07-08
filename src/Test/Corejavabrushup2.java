package Test;

public class Corejavabrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to check that no is multiple of 2
		int[] atr2 = {1,2,4,6,8,122,34,34,34};
		for(int j=0; j<atr2.length; j++) {
			if(atr2[j] % 2 ==0) {
				System.out.println(atr2[j]);
			}
			
			else {
				System.out.println(atr2[j] + "is not an even number");
			}
		}
		

	}

}
