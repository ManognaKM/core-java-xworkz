class Chaipoint{

 static String tea1= "lemon tea";
 static String tea2 ="green tea";
 static String tea3= "Cold coffee";
 static String tea4 ="ginger tea";
 static String tea5= "Elacichi tea";
 static String tea6 ="Cothas coffee";
 static String tea7= "Bru coffee";
 static String tea8 ="bullet coffee";
 static String tea9= "masala coffee";
 static String tea10="protien tea";
 
 
 
 
 
 
 
static String chaiAvailable[]={tea1,tea2,tea3,tea4,tea5,tea6,tea7,tea8,tea9,tea10};
 public static void getAllChaiAvailable(){
	 
	 for(int chai=0;chai<chaiAvailable.length;chai++){
		String ref= chaiAvailable[chai];
		 System.out.println("the chai available are  " +ref);
	 }
	 
	 
 }
}