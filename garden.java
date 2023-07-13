class Garden{
	static int index;
	static String flowerNames[]={null,null,null,null,null};
	public static boolean addFlowers(String flower){
		boolean isAdded=false;
		if(flower!=null){
		flowerNames[index]=flower;
		index++;
		
		}
		else{
			System.out.println("theFlowers name can not be added or saved");
		}
		return isAdded;
	}
	public static void getAllFlowers(){
		for(String flwr:flowerNames){
			System.out.println("the flower names are  "+flwr);
		}
	}
public static boolean updateFlowers(String existingFlower,String upadtedFlower){

	boolean isUpdated=false;
	for(int Index=0;Index<flowerNames.length;Index++){
		if(flowerNames[Index].equals(existingFlower)){
			flowerNames[Index]=upadtedFlower;
			isUpdated=true;
		}
	}return isUpdated;
}
}
		
			
	
			