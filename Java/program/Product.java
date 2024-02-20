// Kelas induk
public class Product{
    
    // Private attributes
    private String id;
    private String name;
    private String brand;
    private String price;
    
    // Konstruktor yang memberi nilai kosong
    public Product() {
        this.id = "";
        this.name = "";
        this.brand = "";
        this.price = "";
    }

    // Konstuktor yang memberi nilai sesuai parameter untuk atributnya
    public Product(String id, String name, String brand, String price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // Getter

    // Get id
    public String get_id() {
        return this.id;
    }

    // Get name
    public String get_name(){
        return this.name;
    }

    // Get brand
    public String get_brand(){
        return this.brand;
    }

    // Get price
    public String get_price(){
        return this.price;
    }

    // Setter

    // Set id
    public void set_id(String id){
        this.id = id;
    }

    // Set name
    public void set_name(String name){
        this.name = name;
    }

    // Set brand
    public void set_brand(String brand){
        this.brand = brand;
    }

    // Set price
    public void set_price(String price){
        this.price = price;
    }
}