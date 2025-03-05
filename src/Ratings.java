import java.util.ArrayList;
import java.util.List;

public class Ratings implements Criteria{
    private final double minRating;
    private final double maxRating;
    public Ratings(double minRating, double maxRating) {
        this.minRating = minRating;
        this.maxRating = maxRating;
    }
    @Override
    public List<Product> meetCriteria(List<Product> items){
        List<Product> result = new ArrayList<Product>();
        for(Product item : items){
            if(item.getCustomerRating() >= minRating && item.getCustomerRating() <= maxRating){
                result.add(item);
            }
        }
        return result;
    }
}
