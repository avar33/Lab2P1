import java.util.ArrayList;
import java.util.List;

public class Category implements Criteria{
    private final String selectedCategory;
    public Category(String selectedCategory) {
        this.selectedCategory = selectedCategory;
    }
    @Override
    public List<Product> meetCriteria(List<Product> items){
        List<Product> result = new ArrayList<Product>();
        for(Product item : items){
            if (item.getCategory() == this.selectedCategory){
                result.add(item);
            }
        }
        return result;
    }
}
