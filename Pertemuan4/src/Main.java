import com.polban.jtk.sales.*;
import com.polban.jtk.inventory.*;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Handphone", 5000000, 10);

        Sales sales = new Sales(product);

        sales.sellProduct(5);

        sales.restockProduct(10);

        sales.updateProductPrice(1.4E7);
        sales.updateProductPrice(-4500000);
    }
}