class KarnatakaUpdateTester{
	public static void main(String args[]){
		KarnatakaUpdate.addCityNames("bangalore");
		KarnatakaUpdate.addCityNames("chikkabalapura");
		KarnatakaUpdate.addCityNames("mysore");
		KarnatakaUpdate.addCityNames("kolar");
		KarnatakaUpdate.addCityNames("mangalore");
		KarnatakaUpdate.addCityNames("mandya");
		KarnatakaUpdate.getAllCitys();
		System.out.println("-----------After Update------------");
        KarnatakaUpdate.updateCityNames("mandya","MANDYA");		
		
		KarnatakaUpdate.getAllCitys();
	}
}