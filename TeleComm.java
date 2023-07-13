class TeleComm{
static int index;
static String simcards[]={null,null,null,null,null};
 
 public static boolean addSim(String sim){
	 boolean isAdded=false;
	 if(sim!=null){
		 simcards[index]=sim;
		 index++;
		 isAdded=true;
	
	 }
	 else{
		 System.out.println("we con't add the sim,null is present");
	 }
	 return isAdded;
 }
 public static void getAllSimsavilable(){
	 
	 for(int sim=0;sim<simcards.length;sim++){
		String ref= simcards[sim];
		 System.out.println("the avilable sims are  " +ref);
	 }
}
public static boolean updateSim(String existingSim,String upadtedSim){
	
	boolean isUpdated=false;
	for(int Index=0;Index<simcards.length;Index++){
		if(simcards[Index].equals(existingSim)){
			simcards[Index]=upadtedSim;
			isUpdated=true;
		}
	}return isUpdated;
}
}
			