// Library
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scan yang akan digunakan
        int i, n = 0;

        // Another useful data structure u can use
        ArrayList<Shirt> list = new ArrayList<>();

        System.out.println("================================================================================");
        System.err.print("Many object of shirt : ");
        
        try {
            n = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("The input is not an integer");
        }
        System.out.println("================================================================================\n");
        
        for (i = 0; i < n; i++) {
            String id, name, brand, price, size, material, gender, color, sleevetype;
            Shirt temp = new Shirt();

            System.out.println("================================================================================");
            System.out.println("Data " + (i + 1) + ":");
            System.out.println("================================================================================");
            System.out.print("Input ID : ");
            id = sc.nextLine();
            System.out.print("Input Name : ");
            name = sc.nextLine();
            System.out.print("Input Brand : ");
            brand = sc.nextLine();
            System.out.print("Input Price : ");
            price = sc.nextLine();
            System.out.print("Input Size : ");
            size = sc.nextLine();
            System.out.print("Input Material : ");
            material = sc.nextLine();
            System.out.print("Input Gender : ");
            gender = sc.nextLine();
            System.out.print("Input Color : ");
            color = sc.nextLine();
            System.out.print("Input Sleeve Type : ");
            sleevetype = sc.nextLine();
            
            temp.set_id(id);
            temp.set_name(name);
            temp.set_brand(brand);
            temp.set_price(price);
            temp.set_size(size);
            temp.set_material(material);
            temp.set_gender(gender);
            temp.set_color(color);
            temp.set_sleeve_type(sleevetype);
            list.add(temp);
            
            System.out.println("================================================================================\n");
        }

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