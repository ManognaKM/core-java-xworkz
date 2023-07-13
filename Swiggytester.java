class Swiggytester{
	
	
	public static void main(String foodDelivery[]){
		
		double foodPrice = Swiggy.search("Biryani");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Swiggy.search("Kabab");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Swiggy.search("Egg omlete");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Swiggy.search("Egg masala");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Swiggy.search("Paneer masala");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Swiggy.search("Salad");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Swiggy.search("Chiken rice");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Swiggy.search("Chicken sambar");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Swiggy.search("Burrito");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Swiggy.search("chesseburger");
     System.out.println("the searched food price is" +foodPrice);
	 
	 double priceWithGivenQuantity = Swiggy.search("Biryani",2);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Swiggy.search("Kabab",4);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Swiggy.search("Egg omlete",5);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Swiggy.search("Egg masala",3);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Swiggy.search("Paneer masala",2);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Swiggy.search("Salad",1);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Swiggy.search("Chiken rice",5);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Swiggy.search("Chicken sambar",4);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Swiggy.search("Burrito",3);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Swiggy.search("chesseburger",2);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 
	 	
		
	}		
	
	
	
	
}