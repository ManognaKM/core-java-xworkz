class MetroTester{
	public static void main(String args[]){
		Metro.saveStationName("rajajinagar station");
		Metro.saveStationName("kr puram");
		Metro.saveStationName("lalbagh");
		Metro.saveStationName("national college metro station");
		Metro.saveStationName("sampige road");
		Metro.saveStationName("majestic");
		Metro.saveStationName("bipnalli");
		Metro.getAllStations();
		System.out.println("-----------After Update------------");
		Metro.updatestationName("bipnalli","bipnalli metro station");
		
		Metro.getAllStations();
	}
}