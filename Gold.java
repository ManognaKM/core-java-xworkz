class Gold {
    static String type;
    static String purity ;
    static double weight;
    static String color ;
    static double pricePerGram;

    public static void main(String[] args) {
	type = "Necklace";
    purity = "18K";
    weight = 10.5;
    color = "Yellow";
    pricePerGram = 50.0;
        System.out.println("Type: " + type);
        System.out.println("Purity: " + purity);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Color: " + color);
        System.out.println("Price per Gram: $" + pricePerGram);
        double totalPrice = weight * pricePerGram;
        System.out.println("Total Price: $" + totalPrice);
    }
}