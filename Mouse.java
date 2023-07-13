class Mouse {
    static String brand;
    static String model;
    static int price;
    static String color;
    static String connectivity;

    public static void main(String[] args) {
	brand = "Logitech";
    model = "MX Master 3";
    price = 100;
    color = "Graphite";
    connectivity = "Bluetooth, USB";
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Connectivity: " + connectivity);
    }
}