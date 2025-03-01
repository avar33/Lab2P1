import java.util.ArrayList;
import java.util.List;

public class PriceRange implements Criteria{
    private final double minPrice, maxPrice;

    // sets the price rage for filter
    public PriceRange(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    //filter
    @Override
    public List<Product> meetCriteria(List<Product> items){
        List<Product> result = new ArrayList<Product>();
        for (Product item : items) {
            if (item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
                result.add(item);
            }
        }
        return result;
    }
}
