class Ubereatstester{
	
	
	public static void main(String foodDelivery[]){
		
		
	double foodPrice = Ubereats.search("Chow mein");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Pork");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Spring rolls");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Veg roll");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Gobi");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Dim sum");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Noodles");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Avocado");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Bollilos");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Chauis");
     System.out.println("the searched food price is" +foodPrice);
	
	 double priceWithGivenQuantity = Ubereats.search("Chow mein",3);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	  priceWithGivenQuantity = Ubereats.search("Pork",2);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	  priceWithGivenQuantity = Ubereats.search("Spring rolls",4);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	  priceWithGivenQuantity = Ubereats.search("Veg roll",5);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	  priceWithGivenQuantity = Ubereats.search("Gobi",2);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	  priceWithGivenQuantity = Ubereats.search("Dim sum",1);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	  priceWithGivenQuantity = Ubereats.search("Noodles",6);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	  priceWithGivenQuantity = Ubereats.search("Avocado",5);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	  priceWithGivenQuantity = Ubereats.search("Bollilos",2);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	  priceWithGivenQuantity = Ubereats.search("Chauis",4);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	
}
		
	
	
}