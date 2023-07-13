class Karnataka{
	static int index;
	static String cityNames[]={null,null,null,null,null};
	public static boolean addCityNames(String city){
		boolean isSaved=false;
		if(city!=null){
		cityNames[index]=city;
		index++;
		isSaved=true;
		}
		else{
			System.out.println("the city name can not be added or saved");
		}
		return isSaved;
	}
	public static void getAllCitys(){
		for(String cty:cityNames){
			System.out.println("the cityNames are  "+cty);
		}
	}
}
			
	
			