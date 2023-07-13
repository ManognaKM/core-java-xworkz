class IceCreamTester{
	public static void main(String args[]){
		IceCream.saveFlavors("orange");
		IceCream.saveFlavors("mango");
		IceCream.saveFlavors("srawberry");
		IceCream.saveFlavors("lime");
		IceCream.saveFlavors("pine Apple");
		IceCream.getAllFlavors();
		System.out.println("-----------After Update------------");
		IceCream.updateFlavorsName("lime","lemon");
		IceCream.getAllFlavors();
		System.out.println("-----------After Delete------------");
	int newLength=	IceCream.deleteFlavoursName("mango");
		IceCream.getAllFlavorsPostDelete(newLength);
	}
}