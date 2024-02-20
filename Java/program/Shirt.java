public class Shirt extends Clothing{
    // Private attributes
    private String color;
    private String sleeve_type;

    // Konstruktor untuk memberikan nilai kosong pada attribute
    public Shirt(){
        this.color = "";
        this.sleeve_type = "";
    }

    // Konstuktor dengan parameter untuk memberikan nilai sesuai masukan pada atribute
    public Shirt(String color, String sleeve_type){
        this.color = color;
        this.sleeve_type = sleeve_type;
    }

    // Setter

    public void set_color(String color){
        this.color = color;
    }

    public void set_sleeve_type(String sleeve_type){
        this.sleeve_type = sleeve_type;
    }

    // Getter

    public String get_color(){
        return this.color;
    }

    public String get_sleeve_type(){
        return this.sleeve_type;
    }
}
