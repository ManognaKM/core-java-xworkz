class FoodBurger {
    static String foodName;
    static String type;
    static int price;
    static String ingredients;
    static String size;

    public static void main(String[] args) {
		 foodName = "Burger";
         type = "American";
         price = 8;
         ingredients = "onion,masala, Tomato, Cheese";
         size = "Large";
        System.out.println("Food Name: " + foodName);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Size: " + size);
    }
}
