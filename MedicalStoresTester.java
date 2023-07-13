class MedicalStoresTester{
	public static void main(String args[]){
		MedicalStores.addmedicine("Dolo 650");
		MedicalStores.addmedicine("anasin");
		MedicalStores.addmedicine("crosin");
		MedicalStores.addmedicine("bruphin");
		MedicalStores.addmedicine("viks action 500");
		MedicalStores.addmedicine("olmeA");
		MedicalStores.addmedicine("Geamer2");
		MedicalStores.addmedicine("pantasidD");
		MedicalStores.addmedicine("saridan");
		MedicalStores.getAllMedicines();
		
		System.out.println("----------search-------------");
		MedicalStores.searchMedicine("pani");
		
		
		System.out.println("-----------After Update------------");
		MedicalStores.updateMedicineNames("olmeA","OLME B");
		
		
		
	
		
		
		
		MedicalStores.getAllMedicines();
	}
}