public class Product {
    private String id;
    private String name;
    private double price;
    private String brand;
    private String category;
    private double customer_rating;

    public Product(String id, String name, double price, String brand, String category, double customer_rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.customer_rating = customer_rating;
    }

    //getters
    public String getId() { return id;}
    public String getName() { return name;}
    public double getPrice(){ return price;}
    public String getBrand() { return brand;}
    public String getCategory() { return category;}
    public double getCustomerRating() { return customer_rating;}
}
