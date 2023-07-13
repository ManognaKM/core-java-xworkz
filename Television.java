class Television{
	static String Name="LG";
	static  int minBrightness;
	static int currentBrightness;
	static int maxBrightness=30;
	static boolean isConnected;
	//method
	public static boolean onOrOff(){
		System.out.println("Invoking onOrOff()");
		System.out.println("Parameter"+0);
		
		if(isConnected == false){
			isConnected= true;
			System.out.println("TV is turned onn enjy");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("TV  turned off oppsssss...");
		}
		return isConnected;
	}
	//increaseTemperature
	public static void increaseBrightness(){
		if(isConnected = true){
			if(currentBrightness<maxBrightness){
				currentBrightness=currentBrightness+1;
				System.out.println("the current Brightness is"+currentBrightness);
			}
			else{
				System.out.println("Reached max Brightness");
			}
}else{
	System.out.println("gubee TV connect madu first");
}
	}

	public static void decreaseBrightness(){
		if(isConnected = true){
			if(currentBrightness>minBrightness){
				currentBrightness=currentBrightness-1;
				System.out.println("the current Brightness is that" +currentBrightness);
			}
			else{
				System.out.println("Reached minimum Brightness");
			}
			
		}
		else{
			System.out.println("gubee TV connect madu first");
		}
	}
}
			
		