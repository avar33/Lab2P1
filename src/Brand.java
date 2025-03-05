import java.util.ArrayList;
import java.util.List;

public class Brand implements Criteria{
    private final String brandName;
    public Brand(String brandName) {
        this.brandName = brandName;
    }
    @Override
    public List<Product> meetCriteria(List<Product> items){
        List<Product> result = new ArrayList<Product>();
        for(Product item : items){
            if (item.getBrand().equals(this.brandName)){
                result.add(item);
            }
        }
        return result;
    }
}
