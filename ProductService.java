import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.time.Year;
import java.util.Scanner;

public class ProductService {

    List<Product> products = new ArrayList<>();
    public void insert()
    {
        Scanner ob=new Scanner(System.in);
        Product a=new Product();
        System.out.print("Enter Product Name :");
        a.setName(ob.nextLine());
        System.out.print("Enter Product Type :");
        a.setType(ob.nextLine());
        System.out.print("Enter Product Where it will be kept :");
        a.setPlace(ob.nextLine());
        System.out.print("Enter Product Warrenty :");
        a.setWarranty(ob.nextInt());
        addProduct(a);
    }
    public void update(String product,String place)
    {
        for(Product a : products)
        {
            if(a.getName().equals(product))
            a.setPlace(place);
        }
    }
    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String name){
        try{
        return products.stream().
            filter(n -> n.getName().equals(name)).toList().get(0);
        }
        catch(IndexOutOfBoundsException e)
        {
            return new Product();
        }
    }

    public List<Product> getProductWithText(String text) {
        System.out.println(text);
        String str = text.toLowerCase();
        return products.stream()
            .filter(p -> p.getName().toLowerCase().contains(str)||p.getType().toLowerCase().contains(str)||p.getPlace().toLowerCase().contains(str))
            .toList();
    }
    public List<Product> SearchByPlace(String where)
    {
        String w=where.toLowerCase();
        return products.stream().filter(p -> p.getPlace().toLowerCase().contains(w))
            .toList();
    }
    public List<Product> OutOfWarranty()
    {
        return products.stream().filter(p-> p.getWarranty()<Year.now().getValue()).toList();
    }
    public Boolean OutOfWarranty(String item)
    {
        return getProduct(item).getWarranty()<Year.now().getValue();
    }
}
