class ZomatoTest{
	public static void main(String args[]){
	
	double foodPrice = Zomato.search("Pizza");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Zomato.search("vegBiriyani");
     System.out.println("the searched food price is" +foodPrice);
	  foodPrice = Zomato.search("fried rice");
     System.out.println("the searched food price is" +foodPrice);
	  foodPrice = Zomato.search("Roti curry");
     System.out.println("the searched food price is" +foodPrice);
	  foodPrice = Zomato.search("iceCream");
     System.out.println("the searched food price is" +foodPrice);
	  foodPrice = Zomato.search("Lemon rice");
     System.out.println("the searched food price is" +foodPrice);
	  foodPrice = Zomato.search("Gobi");
     System.out.println("the searched food price is" +foodPrice);
	  foodPrice = Zomato.search("masala vada");
     System.out.println("the searched food price is" +foodPrice);
	  foodPrice = Zomato.search("palaw");
     System.out.println("the searched food price is" +foodPrice);
	  foodPrice = Zomato.search("puri");
     System.out.println("the searched food price is" +foodPrice);
	 
	double priceWithGivenQuantity = Zomato.search("Pizza",5);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Zomato.search("vegBiriyani",4);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Zomato.search("fried rice",2);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Zomato.search("Roti curry",3);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Zomato.search("iceCream",6);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Zomato.search("Lemon rice",2);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Zomato.search("Gobi",5);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Zomato.search("masala vada",3);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Zomato.search("palaw",2);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	 priceWithGivenQuantity = Zomato.search("puri",4);
     System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	
	}
}