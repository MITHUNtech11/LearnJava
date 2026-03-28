package Day_13;
import java.util.*;
    class Product{
        int price;
        Product (int price){
            this.price=price;
        }
    }
public class price {
    public static void main(String[] args){
        Supplier<Product> s = ()->new Product(100);
        Product p = s.get();
        System.out.println(p.price);
    }
}

// 6
// 215623
// 10