// Library
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scan yang akan digunakan
        int i, n = 0;

        // Another useful data structure u can use
        ArrayList<Shirt> list = new ArrayList<>();

        // 
        System.out.println("================================================================================");
        System.err.print("Many object of shirt : ");
        
        // Input untuk meminta banyak object untuk shirt
        try {
            n = sc.nextInt(); // meminta banyak object untuk shift
            sc.nextLine(); 
        } catch (Exception e) { // Apabila yang dimasukkan bukan int / angka
            // TODO: handle exception
            System.out.println("The input is not an integer");
        }
        System.out.println("================================================================================\n");
        
        // Perulangan atau proses untuk meminta data/nilai atribut untuk object di list
        for (i = 0; i < n; i++) {
            String id, name, brand, price, size, material, gender, color, sleevetype; // Variabel untuk atribut shirt
            Shirt temp = new Shirt(); // Temp untuk menyimpan object shirt sementara

            // Meminta inputan per data object
            System.out.println("================================================================================");
            System.out.println("Data " + (i + 1) + ":");
            System.out.println("================================================================================");
            System.out.print("Input ID : ");
            id = sc.nextLine(); // Inputan ID
            System.out.print("Input Name : ");
            name = sc.nextLine(); // Inputan Nama
            System.out.print("Input Brand : ");
            brand = sc.nextLine(); // Inputan Brand
            System.out.print("Input Price : ");
            price = sc.nextLine(); // Inputan Price
            System.out.print("Input Size : ");
            size = sc.nextLine(); // Inputan size
            System.out.print("Input Material : ");
            material = sc.nextLine(); // Inputan material 
            System.out.print("Input Gender : ");
            gender = sc.nextLine(); // Inputan gender
            System.out.print("Input Color : ");
            color = sc.nextLine(); // Inputan color
            System.out.print("Input Sleeve Type : ");
            sleevetype = sc.nextLine(); // Inputan sleeve types
            
            // Memasukkan nilai atribut ke dalam object
            temp.set_id(id);
            temp.set_name(name);
            temp.set_brand(brand);
            temp.set_price(price);
            temp.set_size(size);
            temp.set_material(material);
            temp.set_gender(gender);
            temp.set_color(color);
            temp.set_sleeve_type(sleevetype);

            // Menambahkan object tersebut ke dalam list
            list.add(temp);
            
            System.out.println("================================================================================\n");
        }

        // Proses untuk melakukan print isi dalam list object of shirt
        System.out.println("================================================================================");
        System.out.println("List of shirt : ");
        System.out.println("================================================================================");

        for (i = 0; i < list.size(); i++) {
            
            System.out.println(("| ") + list.get(i).get_id() + (" | ") + list.get(i).get_name() + (" | ") + list.get(i).get_brand()
            + (" | ") + list.get(i).get_price() + (" | ") + list.get(i).get_size() + (" | ") + list.get(i).get_material()
            + (" | ") + list.get(i).get_gender() + (" | ") + list.get(i).get_color() + (" | ") + list.get(i).get_sleeve_type());
        }
        System.out.println("================================================================================");
    }
}