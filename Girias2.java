class Girias2{
	public static void main(String args[]){
		String electronicDevices[]={"refregerator","washing Machine","Telivision","Led","Grinder","Ac","microwave"};
		
		double priceOfElectronicDevices[]={50000.0,40000.0,75000.50,15000.89,80000.60,0.0,7788.0};
//New for loop ie, Foreach
for(String electronicDevice: electronicDevices){
	System.out.println(electronicDevice);

}
for(double priceOfElectronicDevice:priceOfElectronicDevices){
	System.out.println(priceOfElectronicDevice);
}


	}
}