class Washingmachine{
    static String name = "RR";

	static int minrotspeed;
    static int currentrotspeed;
    static int maxrotspeed = 30;
	static boolean isConnected;
	
		
	public static void increaserotspeed(){
		if(isConnected == false){
			if(currentrotspeed < maxrotspeed){
				currentrotspeed = currentrotspeed+1;
			System.out.println("The currentrotspeed is"+currentrotspeed);
			}
			else{
				System.out.println("Reached Max rotspeed");
			}
		
		}else{
		System.out.println("Turnon the Washingmachine first");
	}		
			}
		
		public static void decreaserotspeed(){
		if(isConnected == true){
		if(currentrotspeed > minrotspeed){
		currentrotspeed = currentrotspeed-1;
		System.out.println("The currentrotspeed is "+ currentrotspeed);
		}else{
	           System.out.println("Minimum rotspeed is reached");
			   }
			   
		}
		else{
		      System.out.println("Washingmachine is tuned off... can't decrease the rotspeed");
				
		}
	}
		
}