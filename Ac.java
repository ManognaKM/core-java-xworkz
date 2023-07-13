class Ac{
	static String Name="Bajaj";
	static  int minTemperature;
	static int currentTemperature;
	static int maxTemperature=30;
	static boolean isConnected;
	//method
	public static boolean onOrOff(){
		System.out.println("Invoking onOrOff()");
		System.out.println("Parameter"+0);
		
		if(isConnected == false){
			isConnected= true;
			System.out.println("Ac is turned onn enjy");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("Ac  turned off oppsssss...");
		}
		return isConnected;
	}
	//increaseTemperature
	public static void increaseTemperature(){
		if(isConnected = true){
			if(currentTemperature<maxTemperature){
				currentTemperature=currentTemperature+1;
				System.out.println("the current Temperature is"+currentTemperature);
			}
			else{
				System.out.println("Reached max Temperature");
			}
}else{
	System.out.println("gubee AC connect madu first");
}
	}

	public static void decreaseTemperature(){
		if(isConnected = true){
			if(currentTemperature>minTemperature){
				currentTemperature=currentTemperature-1;
				System.out.println("the current temperature is that" +currentTemperature);
			}
			else{
				System.out.println("Reached minimum Temperature");
			}
			
		}
		else{
			System.out.println("gubee AC connect madu first");
		}
	}
}
			
		