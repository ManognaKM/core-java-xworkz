class Metro{
	static int index;
	static String stationName[]={null,null,null,null,null,null,null};
	public static boolean saveStationName(String station){
		boolean isSaved=false;
		if(station!=null){
		stationName[index]=station;
		index++;
		
		}
		else{
			System.out.println("the station name can not be added or saved");
		}
		return isSaved;
	}
	public static void getAllStations(){
		for(String s:stationName){
			System.out.println("the station names are  "+s);
		}
	}
public static boolean updatestationName(String existingStationName,String upadtedStationName){
	
	boolean isUpdated=false;
	for(int Index=0;Index<stationName.length;Index++){
		if(stationName[Index].equals(existingStationName)){
			stationName[Index]=upadtedStationName;
			isUpdated=true;
		}
	}return isUpdated;
}
}
	
			
	
			