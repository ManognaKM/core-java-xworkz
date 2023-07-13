class TravelAgencyTester{
	public static void main(String args[]){
		TravelAgency.addTouristPlaces("dolphin nose");
		TravelAgency.addTouristPlaces("ooty");
		TravelAgency.addTouristPlaces("codacanal");
		TravelAgency.addTouristPlaces("kanyakumari");
		TravelAgency.addTouristPlaces("tirupathi");
		TravelAgency.addTouristPlaces("goa");
		TravelAgency.addTouristPlaces("aguada fort");
		TravelAgency.addTouristPlaces("se cathedral");
		TravelAgency.getAllTouristPlaces();
		System.out.println("-----------After Update------------");
		TravelAgency.updateTouristPlaces("goa","GOA BEACH");
	
		
		
		
		TravelAgency.getAllTouristPlaces();
	}
}