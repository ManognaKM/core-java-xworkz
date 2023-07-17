public class JewelryTester {
    public static void main(String[] args) {
        Jewelry jewelry1 = new Jewelry();
        jewelry1.type = "Ring";
        jewelry1.material = "Gold";
        jewelry1.price = 1000.0;
        jewelry1.displayDetails();
		
		System.out.println("Type: " + jewelry1.type);
        System.out.println("material: " + jewelry1.material);
        System.out.println("Price: " + jewelry1.price);

        Jewelry jewelry2 = new Jewelry();
        jewelry2.type = "Necklace";
        jewelry2.material = "Silver";
        jewelry2.price = 500.0;
        jewelry2.displayDetails();
		
		System.out.println("Type: " + jewelry2.type);
        System.out.println("material: " + jewelry2.material);
        System.out.println("Price: " + jewelry2.price);

        Jewelry jewelry3 = new Jewelry();
        jewelry3.type = "Earrings";
        jewelry3.material = "Diamond";
        jewelry3.price = 2000.0;
        jewelry3.displayDetails();
		
		System.out.println("Type: " + jewelry3.type);
        System.out.println("material: " + jewelry3.material);
        System.out.println("Price: " + jewelry3.price);


        Jewelry jewelry4 = new Jewelry();
        jewelry4.type = "Bracelet";
        jewelry4.material = "Platinum";
        jewelry4.price = 1500.0;
        jewelry4.displayDetails();
		
		System.out.println("Type: " + jewelry4.type);
        System.out.println("material: " + jewelry4.material);
        System.out.println("Price: " + jewelry4.price);

        
    }
}
