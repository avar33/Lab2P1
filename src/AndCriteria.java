import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {
    private List<Criteria> criterias;
    public AndCriteria(List<Criteria> criterias) {
        this.criterias = criterias;
    }
    @Override
    public List<Product> meetCriteria(List<Product> items){
        List<Product> result = new ArrayList<Product>(items); // copy of items
        for (Criteria criteria : criterias) {
            result = criteria.meetCriteria(result);
        }
        return result;
    }
}
