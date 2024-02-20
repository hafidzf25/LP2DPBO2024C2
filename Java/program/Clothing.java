// Kelas Anak
public class Clothing extends Product{
    // Private attributes
    private String size;
    private String material;
    private String gender;

    // Konstruktor untuk nilai default pada attribut
    public Clothing(){
        this.size = "";
        this.material = "";
        this.gender = "";
    }

    // Konstruktor untuk nilai yang disesuaikan parameter pada attribut
    public Clothing(String size, String material, String gender){
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    // Get size
    public String get_size(){
        return this.size;
    }

    // Get material
    public String get_material(){
        return this.material;
    }

    // Get gender
    public String get_gender(){
        return this.gender;
    }

    // Set size
    public void set_size(String size){
        this.size = size;
    }

    // Set material
    public void set_material(String material){
        this.material = material;
    }

    // Set gender
    public void set_gender(String gender){
        this.gender = gender;
    }
}
