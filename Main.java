
import java.util.List;
import java.util.Scanner;
//you can use manudriven program by uncommenting them coommented below
public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // hey service, add the products..

        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));
   
        
         Scanner obj=new Scanner(System.in);
        String inser1,inser2;
        while(true)
        {
            
            System.out.print(
                "Enter your Choise\n1 insert new product \n2 for updating the place \n3 For Getting Whole list of products - (postfix 'D' to see product list in detail 'B to see in short' \n"+
                "4 for Searching\n5To See items out of Warrenty \n6To Find the warrenty of item\n7 To Exit "+
                "\nWating for your Choice"
            );
            inser1=obj.nextLine();
            switch (inser1) {
                case "1":
                    service.insert();
                    break;
                case "2":
                    System.out.print("Enter the name of product");
                    inser1=obj.nextLine();
                    System.out.print("Enter the new place");
                    inser2=obj.nextLine();
                    service.update(inser1,inser2);
                    break;
                case "3":
                    System.out.println("-----------------------------");
                    for(Product a :service.getAllProducts())
                    System.out.print(a);
                    break;
                case "3D":
                System.out.println("-----------------------------");
                    for(Product a :service.getAllProducts())
                        System.out.println(a.Detail());
                    break;
                case "3B":
                System.out.println("-----------------------------");
                    for(Product a :service.getAllProducts())
                            System.out.println(a.sho());
                    break;
                case "5":
                    for(Product a :service.OutOfWarranty())
                        System.out.println(a.Detail());
                    break;
                case "6":
                    System.out.println("Write the name of item");
                    System.out.println("==>"+service.OutOfWarranty(obj.nextLine()));
                    break;
                case "4":
                System.out.println("-----------------------------");
                    System.out.print(
                    "Enter your Choise\n1 Search with text \n2 Search with product name\n"+
                    "3 for Search By Place\n5 To Exit "
                    );
                    inser2=obj.nextLine();
                    switch (inser2) {
                        case "1":
                        System.out.println("-----------------------------");
                            System.out.println("Write the name of item");
                            for(Product a :service.getProductWithText(obj.nextLine()))
                                System.out.println(a.Detail());
                            break;
                        case "2":
                        System.out.println("-----------------------------");
                        System.out.println("Write the name of item");
                            System.out.println(service.getProduct(obj.nextLine()).Detail());
                            break;
                        case "3":
                        System.out.println("Write the name of item");
                        System.out.println("-----------------------------");
                            for(Product a :service.SearchByPlace(obj.nextLine()))
                                System.out.println(a.Detail());
                            break;
                        default:
                        break;
                    }
                
                default:
                    break;
                
            }
            if(inser1.equals("7"))
                        break;
        }
}} 
