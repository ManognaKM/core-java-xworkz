public class ClockTester {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        clock1.brandName = "Rolex";
        clock1.color = "Silver";
        clock1.price = 1000.0;
        clock1.type = "Analog";
        clock1.showTime();
        System.out.println("Brand Name: " + clock1.brandName);
        System.out.println("Color: " + clock1.color);
        System.out.println("Price: " + clock1.price);
        System.out.println("Type: " + clock1.type);

        Clock clock2 = new Clock();
        clock2.brandName = "Casio";
        clock2.color = "Black";
        clock2.price = 500.0;
        clock2.type = "Digital";
        clock2.showTime();
        System.out.println("Brand Name: " + clock2.brandName);
        System.out.println("Color: " + clock2.color);
        System.out.println("Price: " + clock2.price);
        System.out.println("Type: " + clock2.type);

        Clock clock3 = new Clock();
        clock3.brandName = "Seiko";
        clock3.color = "Gold";
        clock3.price = 800.0;
        clock3.type = "Analog";
        clock3.showTime();
        System.out.println("Brand Name: " + clock3.brandName);
        System.out.println("Color: " + clock3.color);
        System.out.println("Price: " + clock3.price);
        System.out.println("Type: " + clock3.type);

        Clock clock4 = new Clock();
        clock4.brandName = "Timex";
        clock4.color = "White";
        clock4.price = 300.0;
        clock4.type = "Analog";
        clock4.showTime();
        System.out.println("Brand Name: " + clock4.brandName);
        System.out.println("Color: " + clock4.color);
        System.out.println("Price: " + clock4.price);
        System.out.println("Type: " + clock4.type);
    }
}