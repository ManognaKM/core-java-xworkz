class IceCream{
	static int index;
	static String flavorsName[]={null,null,null,null,null};
	public static boolean saveFlavors(String flavor){
		boolean isSaved=false;
		if(flavor!=null){
		flavorsName[index]=flavor;
		index++;
		
		}
		else{
			System.out.println("the Flavors name can not be added or saved");
		}
		return isSaved;
	}
	public static void getAllFlavors(){
		for(String flwr:flavorsName){
			System.out.println("the flavor names are  "+flwr);
		}
	}
public static boolean updateFlavorsName(String existingFlavorsName,String upadtedFlavour){
	
	boolean isUpdated=false;
	for(int Index=0;Index<flavorsName.length;Index++){
		if(flavorsName[Index].equals(existingFlavorsName)){
			flavorsName[Index]=upadtedFlavour;
			isUpdated=true;
		}
	}return isUpdated;
}
public static int deleteFlavoursName(String existingFlavorsName){
	boolean isDeleted =false;
	int itemIndex;
	int noOfElements=flavorsName.length;
	
	for(itemIndex=0;itemIndex<flavorsName.length;itemIndex++){
		if(flavorsName[itemIndex].equals(existingFlavorsName)){
			break;
		}
	}
	if(itemIndex<noOfElements){
		noOfElements=noOfElements-1;
		for(int newItemIndex=itemIndex;newItemIndex<noOfElements;newItemIndex++){
			flavorsName[newItemIndex]=flavorsName[newItemIndex+1];
		}
	}return noOfElements;
}
	
	
			
			
	public static void getAllFlavorsPostDelete(int newLength){
		for(int itemIndex=0;itemIndex<newLength;itemIndex++){
			System.out.println(flavorsName[itemIndex]);
		}
	}
}