import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        //list of products
        products.add(new Product("001", "Shirt", 8.00, "Nike", "Adult Clothing", 4.5));
        products.add(new Product("002", "Pants", 14.00, "Nike", "Adult Clothing", 4.0));
        products.add(new Product("003", "Doll", 24.99, "Mattel", "Toys", 3.2));
        products.add(new Product("004", "Bowl", 3.50, "Kitchen Aid", "Home", 4.8));
        products.add(new Product("005", "Hoodie", 31.99, "Adidas", "Adult Clothing", 4.4));
        products.add(new Product("006", "Big Kids Shirt", 10.00, "Nike", "Children Clothing", 2.9));
        products.add(new Product("007", "Sneaker", 90.00, "Converse", "Adult Clothing", 3.9));
        products.add(new Product("008", "Remote Car", 16.00, "Hot Wheels", "Toys", 1.6));
        products.add(new Product("009", "Blanket", 20.99, "Target", "Home", 3.0));
        products.add(new Product("010", "Blush", 8.50, "Maybelline", "Cosmetics", 4.2));

        //TESTING PRICE RANGE
        //price 0.00-10.00
        PriceRange priceRange = new PriceRange(0.00, 10.00); // initialize price range
        List<Product> criteriaItems = priceRange.meetCriteria(products); //list to hold products (WILL BE REUSED FOR ALL LISTS)
        //output products
        System.out.println("Products in price range $0.00 - $10.00:");
        for (Product criteriaItem : criteriaItems) {
            System.out.println(criteriaItem.getName() + " - $" + criteriaItem.getPrice()+ ", id: " + criteriaItem.getId()+
                    ", brand: " + criteriaItem.getBrand()+ ", category: " + criteriaItem.getCategory()+ ", ratings: "
                    + criteriaItem.getCustomerRating());
        }
        criteriaItems.clear();
        System.out.println();
        //priceRange 50.00-100.00
        priceRange = new PriceRange(50.00, 100.00); // initialize price range
        criteriaItems = priceRange.meetCriteria(products); //list to hold products (WILL BE REUSED FOR ALL LISTS)
        //output products
        System.out.println("Products in price range $50.00 - $100.00:");
        for (Product criteriaItem : criteriaItems) {
            System.out.println(criteriaItem.getName() + " - $" + criteriaItem.getPrice()+ ", id: " + criteriaItem.getId()+
                    ", brand: " + criteriaItem.getBrand()+ ", category: " + criteriaItem.getCategory()+ ", ratings: "
                    + criteriaItem.getCustomerRating());
        }
        criteriaItems.clear();
        System.out.println();

        //TESTING BRAND
        // brand has multiple
        Brand brand = new Brand("Nike");
        criteriaItems = brand.meetCriteria(products); // criteriaItems now used to hold brand
        System.out.println("Nike Brand Items:");
        for (Product criteriaItem : criteriaItems) {
            System.out.println(criteriaItem.getName() + " - $" + criteriaItem.getPrice()+ ", id: " + criteriaItem.getId()+
                    ", brand: " + criteriaItem.getBrand()+ ", category: " + criteriaItem.getCategory()+ ", ratings: "
                    + criteriaItem.getCustomerRating());
        }
        criteriaItems.clear();
        System.out.println();
        // brand has one
        brand = new Brand("Maybelline");
        criteriaItems = brand.meetCriteria(products);
        System.out.println("Maybelline Brand Items:");
        for (Product criteriaItem : criteriaItems) {
            System.out.println(criteriaItem.getName() + " - $" + criteriaItem.getPrice()+ ", id: " + criteriaItem.getId()+
                    ", brand: " + criteriaItem.getBrand()+ ", category: " + criteriaItem.getCategory()+ ", ratings: "
                    + criteriaItem.getCustomerRating());
        }
        criteriaItems.clear();
        System.out.println();

        // TESTING CATEGORY
        //category with multiple items
        // brand has multiple
        Category cat = new Category("Toys");
        criteriaItems = cat.meetCriteria(products);
        System.out.println("Toy Items:");
        for (Product criteriaItem : criteriaItems) {
            System.out.println(criteriaItem.getName() + " - $" + criteriaItem.getPrice()+ ", id: " + criteriaItem.getId()+
                    ", brand: " + criteriaItem.getBrand()+ ", category: " + criteriaItem.getCategory()+ ", ratings: "
                    + criteriaItem.getCustomerRating());
        }
        criteriaItems.clear();
        System.out.println();
        //category with one item
        cat = new Category("Children Clothing");
        criteriaItems = cat.meetCriteria(products);
        System.out.println("Children Clothing Items:");
        for (Product criteriaItem : criteriaItems) {
            System.out.println(criteriaItem.getName() + " - $" + criteriaItem.getPrice()+ ", id: " + criteriaItem.getId()+
                    ", brand: " + criteriaItem.getBrand()+ ", category: " + criteriaItem.getCategory()+ ", ratings: "
                    + criteriaItem.getCustomerRating());
        }
        criteriaItems.clear();
        System.out.println();

        // TESTING RATINGS
        //4.0-5.0 stars
        Ratings ratings = new Ratings(4.0, 5.0);
        criteriaItems = ratings.meetCriteria(products);
        System.out.println("4.0-5.0 Star Items:");
        for (Product criteriaItem : criteriaItems) {
            System.out.println(criteriaItem.getName() + " - $" + criteriaItem.getPrice()+ ", id: " + criteriaItem.getId()+
                    ", brand: " + criteriaItem.getBrand()+ ", category: " + criteriaItem.getCategory()+ ", ratings: "
                    + criteriaItem.getCustomerRating());
        }
        criteriaItems.clear();
        System.out.println();
        //0.0-1.0 stars
        ratings = new Ratings(0.0, 1.0);
        criteriaItems = ratings.meetCriteria(products);
        System.out.println("0.0-1.0 Star Items:");
        if (criteriaItems.size() == 0) {
            System.out.println("No items found");
        } else {
            for (Product criteriaItem : criteriaItems) {
                System.out.println(criteriaItem.getName() + " - $" + criteriaItem.getPrice()+ ", id: " + criteriaItem.getId()+
                        ", brand: " + criteriaItem.getBrand()+ ", category: " + criteriaItem.getCategory()+ ", ratings: "
                        + criteriaItem.getCustomerRating());
            }
        }
        criteriaItems.clear();
        System.out.println();
        //  TESTING MULTIPLE CRITERIAS
        //two filters
        priceRange = new PriceRange(0.00, 10.00);
        ratings = new Ratings(4.0, 5.0);
        List<Criteria> criterias = new ArrayList<>(); // list of crtiterias to be met
        criterias.add(priceRange);
        criterias.add(ratings);
        AndCriteria restrictions = new AndCriteria(criterias);
        criteriaItems = restrictions.meetCriteria(products);
        System.out.println("Items under $10 with 4-5 stars:");
        if (criteriaItems.size() == 0) {
            System.out.println("No items found");
        } else {
            for (Product criteriaItem : criteriaItems) {
                System.out.println(criteriaItem.getName() + " - $" + criteriaItem.getPrice()+ ", id: " + criteriaItem.getId()+
                        ", brand: " + criteriaItem.getBrand()+ ", category: " + criteriaItem.getCategory()+ ", ratings: "
                        + criteriaItem.getCustomerRating());
            }
        }
        criteriaItems.clear();
        System.out.println();
        //three filters
        cat = new Category("Home");
        criterias.add(cat);
        restrictions = new AndCriteria(criterias);
        criteriaItems = restrictions.meetCriteria(products);
        System.out.println("Home Items under $10 with 4-5 stars:");
        if (criteriaItems.size() == 0) {
            System.out.println("No items found");
        } else {
            for (Product criteriaItem : criteriaItems) {
                System.out.println(criteriaItem.getName() + " - $" + criteriaItem.getPrice()+ ", id: " + criteriaItem.getId()+
                        ", brand: " + criteriaItem.getBrand()+ ", category: " + criteriaItem.getCategory()+ ", ratings: "
                        + criteriaItem.getCustomerRating());
            }
        }
    }
}