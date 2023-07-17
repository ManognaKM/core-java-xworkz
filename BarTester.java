 class BarTester {
    public static void main(String[] args) {
        Bar bar1 = new Bar();
        bar1.name = "Cheers Pub";
        bar1.location = "Downtown";
        bar1.capacity = 100;
        bar1.type = "Sports Bar";
        bar1.welcomeCustomers();
        
		System.out.println("Name: " + bar1.name);
        System.out.println("Location: " + bar1.location);
        System.out.println("Capacity: " + bar1.capacity);
        System.out.println("Type: " + bar1.type);

        Bar bar2 = new Bar();
        bar2.name = "The Lounge";
        bar2.location = "City Center";
        bar2.capacity = 80;
        bar2.type = "Cocktail Bar";
        bar2.welcomeCustomers();
        
		System.out.println("Name: " + bar2.name);
        System.out.println("Location: " + bar2.location);
        System.out.println("Capacity: " + bar2.capacity);
        System.out.println("Type: " + bar2.type);

        Bar bar3 = new Bar();
        bar3.name = "Rooftop Vista";
        bar3.location = "Rooftop of a Skyscraper";
        bar3.capacity = 150;
        bar3.type = "Rooftop Bar";
        bar3.welcomeCustomers();
        
		System.out.println("Name: " + bar3.name);
        System.out.println("Location: " + bar3.location);
        System.out.println("Capacity: " + bar3.capacity);
        System.out.println("Type: " + bar3.type);

        Bar bar4 = new Bar();
        bar4.name = "The Rusty Mug";
        bar4.location = "Old Town";
        bar4.capacity = 50;
        bar4.type = "Dive Bar";
        bar4.welcomeCustomers();
        
		System.out.println("Name: " + bar4.name);
        System.out.println("Location: " + bar4.location);
        System.out.println("Capacity: " + bar4.capacity);
        System.out.println("Type: " + bar4.type);
    }
}