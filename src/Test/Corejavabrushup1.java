package Test;

public class Corejavabrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int mynum = 5;
		  char test = 'r';
		  double decimal = 0.09;
		  boolean  TF = true;
		  String website = "http://demoecms.s3-website.ap-south-1.amazonaws.com/#/login";
		  
		  System.out.println(mynum);
		  System.out.println(test);
		  System.out.println(decimal);
		  System.out.println(TF);
		  System.out.println(website);
		  System.out.println(" Happy Basant panchami  " +    mynum);
	
		  //arrays
		  int[] atr =  new int[5];   // represents how many values are we storing in one variable.
		   atr[0] = 11;
		   atr[1] = 12;
		   atr[2] = 13;
		   atr[3]= 14;
		   atr[4]= 15;
		   
		   int[] atr2 = {1,3,5,6};    // another method of defining an array
		   System.out.println(atr2[3]);  //printing atr2 array
		   System.out.println(atr[1]);   // printing atr array
		   
		   //for loop
		   for( int j = 0;  j < atr.length; j++) {
			   System.out.println(atr[j]);}
		  
		  for (int j= 0; j <atr2.length; j++) {
			  System.out.println(atr2[j]); }
		 
		  
		  String[] name = {"ECMS" , "Fleet" , "VKYC" , "iConnect" , "Omnicard" , "Android" , "IOS"};
		    for(int j=0; j<name.length; j++) {
		    	System.out.println(name[j]); }
		    
		    
		    // Enhanced version of for loop
		   for( String s : name) {
			   System.out.println(s);}
		   
		   
		  
		    
		    
	}

}
