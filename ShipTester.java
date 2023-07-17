class ShipTester{
	public static void main(String[] args) {
        Ship s1 = new Ship();
        s1.name = "titanic";
        s1.color = "black";
        s1.price = 5000000;      
        s1.travel();
        System.out.println("type: " + s1.name);
        System.out.println("Color: " + s1.color);
        System.out.println("Price: " + s1.price);
		
		Ship s2 = new Ship();
        s2.name = "rover";
        s2.color = "brown";
        s2.price = 10000;      
        s2.travel();
        System.out.println("type: " + s2.name);
        System.out.println("Color: " + s2.color);
        System.out.println("Price: " + s2.price);
		
		Ship s3 = new Ship();
        s3.name = "kalin";
        s3.color = "red";
        s3.price = 5000000;      
        s3.travel();
        System.out.println("type: " + s3.name);
        System.out.println("Color: " + s3.color);
        System.out.println("Price: " + s3.price);
		
		Ship s4 = new Ship();
        s4.name = "breeler";
        s4.color = "yellow";
        s4.price = 5000000;      
        s4.travel();
        System.out.println("type: " + s4.name);
        System.out.println("Color: " + s4.color);
        System.out.println("Price: " + s4.price);
		
		
		
		Ship s5 = new Ship();
        s5.name = "Reelers";
        s5.color = "brown";
        s5.price = 60000;      
        s5.travel();
        System.out.println("type: " + s5.name);
        System.out.println("Color: " + s5.color);
        System.out.println("Price: " + s5.price);
		
		
		
	}
}