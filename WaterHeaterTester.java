class WaterHeaterTester{
	public static void main(String[] args) {
        WaterHeater h1 = new WaterHeater();
        h1.name = "wateroo";
        h1.color = "black";
        h1.price = 5000;      
        h1.forShower();
        System.out.println("type: " + h1.name);
        System.out.println("Color: " + h1.color);
        System.out.println("Price: " + h1.price);
		
		WaterHeater h2 = new WaterHeater();
        h2.name = "lg";
        h2.color = "black";
        h2.price = 4000;      
        h2.forShower();
        System.out.println("type: " + h2.name);
        System.out.println("Color: " + h2.color);
        System.out.println("Price: " + h2.price);
		
		WaterHeater h3 = new WaterHeater();
        h3.name = "vintage";
        h3.color = "white";
        h3.price = 10000;      
        h3.forShower();
        System.out.println("type: " + h3.name);
        System.out.println("Color: " + h3.color);
        System.out.println("Price: " + h3.price);
		
		WaterHeater h4 = new WaterHeater();
        h4.name = "pg";
        h4.color = "black";
        h4.price = 5000;      
        h4.forShower();
        System.out.println("type: " + h4.name);
        System.out.println("Color: " + h4.color);
        System.out.println("Price: " + h4.price);
	}
}