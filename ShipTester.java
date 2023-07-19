class ShipTester{
	public static void main(String[] args) {
        Ship s1 = new Ship("titanic","black",5000000);
             
        s1.travel();
        System.out.println("type: " + s1.name);
        System.out.println("Color: " + s1.color);
        System.out.println("Price: " + s1.price);
		
		Ship s2 = new Ship("rover","brown",20000000);
              
        s2.travel();
        System.out.println("type: " + s2.name);
        System.out.println("Color: " + s2.color);
        System.out.println("Price: " + s2.price);
		
		Ship s3 = new Ship("kalin","red",5000000);
             
        s3.travel();
        System.out.println("type: " + s3.name);
        System.out.println("Color: " + s3.color);
        System.out.println("Price: " + s3.price);
		
		Ship s4 = new Ship("breeler","yellow",6000000);
             
        s4.travel();
        System.out.println("type: " + s4.name);
        System.out.println("Color: " + s4.color);
        System.out.println("Price: " + s4.price);
		
		
		
		Ship s5 = new Ship("Reelers","brown",900000);
            
        s5.travel();
        System.out.println("type: " + s5.name);
        System.out.println("Color: " + s5.color);
        System.out.println("Price: " + s5.price);
		
		
		
	}
}