class SnacksTester{
	public static void main(String[] args) {
        Snacks s1 = new Snacks("lays","green",5);
         
        s1.forEat();
        System.out.println("type: " + s1.name);
        System.out.println("Color: " + s1.color);
        System.out.println("Price: " + s1.price);
		
		Snacks s2 = new Snacks("bun","brown",10);
            
        s2.forEat();
        System.out.println("type: " + s2.name);
        System.out.println("Color: " + s2.color);
        System.out.println("Price: " + s2.price);
		
		Snacks s3 = new Snacks("kurKure","red",5);
            
        s3.forEat();
        System.out.println("type: " + s3.name);
        System.out.println("Color: " + s3.color);
        System.out.println("Price: " + s3.price);
		
		Snacks s4 = new Snacks("boti","Yellow",15);
            
        s4.forEat();
        System.out.println("type: " + s4.name);
        System.out.println("Color: " + s4.color);
        System.out.println("Price: " + s4.price);
		
		
		
		Snacks s5 = new Snacks("pups","brown",50);
             
        s5.forEat();
        System.out.println("type: " + s5.name);
        System.out.println("Color: " + s5.color);
        System.out.println("Price: " + s5.price);
		
		
		
	}
}