class GardenTester{
	public static void main(String args[]){
		Garden.addFlowers("jasmin");
		Garden.addFlowers("lilly");
		Garden.addFlowers("rose");
		Garden.addFlowers("lotus");
		Garden.addFlowers("sun flower");
		Garden.getAllFlowers();
		System.out.println("-----------After Update------------");
		Garden.updateFlowers("lotus","white lotus");
		
		Garden.getAllFlowers();
	}
}