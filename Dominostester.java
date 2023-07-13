class Dominostester{
	
	
	public static void main(String foodDelivery[]){
		double foodPrice = Dominos.search("Veg pizza");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Dominos.search("Chicken pizza");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Dominos.search("Pasta");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Dominos.search("Chicken wings");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Dominos.search("Cheese burger");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Dominos.search("Nuggets");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Dominos.search("Chicken roll");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Dominos.search("Pacific pizza");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Dominos.search("Taco indiana");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Dominos.search("Paneer pizza");
     System.out.println("the searched food price is" +foodPrice);
		
	double priceWithGivenQuantity = Dominos.search("Veg pizza",3);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Dominos.search("Chicken pizza",2);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Dominos.search("Pasta",1);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Dominos.search("Cheese burger",6);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Dominos.search("Cheese burger",4);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Dominos.search("Nuggets",2);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Dominos.search("Chicken roll",1);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Dominos.search("Pacific pizza",5);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Dominos.search("Taco indiana",7);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Dominos.search("Paneer pizza",4);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
		
		
		
		
	}			
	
}