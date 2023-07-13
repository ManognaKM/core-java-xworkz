class KarnatakaUpdate{
	static int index;
	static String cityNames[]={null,null,null,null,null,null};
	public static boolean addCityNames(String city){
		boolean isSaved=false;
		if(cityNames.length>index){

	
		if(city!=null && cityNames.length>0){
		cityNames[index]=city;
		index++;
		isSaved=true;
		}
		else{
			System.out.println("the city name can not be added or saved");
		}
		}
	else{
			System.out.println("length exeeds cant print the data");
		}
		
		return isSaved;
	}
	public static void getAllCitys(){
		for(String cty:cityNames){
			System.out.println("the cityNames are  "+cty);
		}
	}
	
	public static boolean updateCityNames(String existingCityName,String updateCityName){
		boolean isUpdated=false;
		
		for(int Index=0;Index<cityNames.length;Index++){
			if( cityNames[Index].equals(existingCityName)){
				
			cityNames[Index] =updateCityName;
			isUpdated=true;
			}
		}return isUpdated;
}
}
			
	
			