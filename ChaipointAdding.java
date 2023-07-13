class ChaipointAdding{
static int index;
static String chaiAvailable[]={null,null,null,null,null,null ,null,null,null,null};
 
 public static boolean addchai(String chai){
	 boolean isAdded=false;
	 if(chai!=null){
		 chaiAvailable[index]=chai;
		 index++;
		 isAdded=true;
	
	 }
	 else{
		 System.out.println("we con't add the chai,null is present");
	 }
	 return isAdded;
 }
 public static void getAllChaiAvailable(){
	 
	 for(int chai=0;chai<chaiAvailable.length;chai++){
		String ref= chaiAvailable[chai];
		 System.out.println("the chai available are  " +ref);
	 }
}
}