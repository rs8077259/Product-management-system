import java.time.Year;
public class Product {
    private String name;
    private String type;
    private String place;
    private int warranty;
    public Product() {
    }

    public Product(String name, String type, String place, int warranty) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.warranty = warranty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    
    public String sho()
    {
        return "name = "+name+'\n'+"place = " + place +"\n";
    }
    public String Search(String what)
    {
        return what;
    }
    public String Detail()
    {
        return "name = " + name + "\n" +
        "type = " + type + "\n" +
        "place = " + place + "\n" +
        "warranty = " + (warranty>=Year.now().getValue()?"Till "+warranty:"Out of warrenty") +"\n";
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", place='" + place + '\'' +
                ", warranty=" + warranty +
                '}';
    }
}
