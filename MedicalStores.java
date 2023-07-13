class MedicalStores{
	static int index;
	static String medicineNames[]={null,null,null,null,null,null,null,null,null};
	public static boolean addmedicine(String med){
		boolean isAdded=false;
		if(med!=null){
		medicineNames[index]=med;
		index++;
		
		}
		else{
			System.out.println("the medicine name can not be added or saved");
		}
		return isAdded;
	}
	public static void getAllMedicines(){
		for(String med:medicineNames){
			System.out.println("the medicine names are  "+med);
		}
	}
public static boolean updateMedicineNames(String existingMedicineNames,String upadtedMedicineNames){
	
	boolean isUpdated=false;
	for(int Index=0;Index<medicineNames.length;Index++){
		if(medicineNames[Index].equals(existingMedicineNames)){
			medicineNames[Index]=upadtedMedicineNames;
			isUpdated=true;
		}
	}return isUpdated;
}
//searching the name is present or not
public static String searchMedicine(String itemName){
	String mName=null;
	for(String name:medicineNames){
		
		if(name.equals(itemName)){
			mName=name;
			System.out.println("Item name found" +mName);
		}
		else{
			System.out.println("Nan hathra illo....medicinee...");
		}
		
	}return mName;
	
}
}
				
	
			