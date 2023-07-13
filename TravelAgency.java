class TravelAgency{
	static int index;
	static String touristPlaces[]={null,null,null,null,null,null,null,null};
	public static boolean addTouristPlaces(String Places){
		boolean isAdded=false;
		if(Places!=null){
		touristPlaces[index]=Places;
		index++;
		
		}
		else{
			System.out.println("the Places name can not be added or saved");
		}
		return isAdded;
	}
	public static void getAllTouristPlaces(){
		for(String place:touristPlaces){
			System.out.println("the tourist Places are  "+place);
		}
	}
public static boolean updateTouristPlaces(String existingTouristPlaces,String upadtedTouristPlaces){
	
	boolean isUpdated=false;
	for(int Index=0;Index<touristPlaces.length;Index++){
		if(touristPlaces[Index].equals(existingTouristPlaces)){
			touristPlaces[Index]=upadtedTouristPlaces;
			isUpdated=true;
		}
	}return isUpdated;
}
}
			
	
			