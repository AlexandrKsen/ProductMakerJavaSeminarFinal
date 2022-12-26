import java.util.ArrayList;
import java.util.List;

public class ProductMaker {
    private List<Product> products;

public ProductMaker(){
    products = new ArrayList<>();
    products.add(new Product());
}
//поиск продукта нпример по цене
    public List<Product> getProductByPrice(double price){
        List<Product> res = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() <= price){
                res.add(products.get(i));
            }
        }
        return res;
    }
}