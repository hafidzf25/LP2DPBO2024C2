// Import library and files
#include <bits/stdc++.h>
#include "Shirt.cpp"

// Using standard namespace
using namespace std;

int main() {
    
    // Deklarasi list untuk data Shirt
    list<Shirt> llist;

    // Instansiasi objek untuk penyimpanan sementara
    Shirt temp;

    // String yang akan digunakan untuk menampung atribut sebelum dimasukkan ke dalam object
    string id, name, brand, price, size, material, gender, color, sleevetype;

    // i untuk loop, n untuk penanda berapa banyak shirt dalam data list
    int i = 0, n;

    // output minta banyak data shirt
    cout << "================================================================================" << endl;
    cout << "= Input many object of shirt : ";
    cin >> n; // input banyaknya
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cout << "================================================================================"<< endl << endl;

    // Loop untuk mengisi data shirt satu persatu sebanyak n baju
    for (i = 0; i < n; i++)
    {
        cout << "================================================================================" << endl;
        cout << "Data " << i + 1 << endl;
        cout << "================================================================================" << endl;
        cout << "Input ID : "; 
        getline(cin, id); // input id
        cout << "Input Name : ";
        getline(cin, name); // input nama
        cout << "Input Brand : ";
        getline(cin, brand); // input brand
        cout << "Input Price : ";
        getline(cin, price); // input price
        cout << "Input Size : ";
        getline(cin, size); // input size
        cout << "Input Material : ";
        getline(cin, material); // input material
        cout << "Input Gender : ";
        getline(cin, gender); // input gender
        cout << "Input Color : ";
        getline(cin, color); // input color
        cout << "Input Sleeve Type : ";
        getline(cin, sleevetype); // input sleeve types

        // Proses pemasukkan data tampungan ke dalam object tampungan sebelum dimasukkan ke dalam list
        temp.set_id(id);
        temp.set_name(name);
        temp.set_brand(brand);
        temp.set_price(price);
        temp.set_size(size);
        temp.set_material(material);
        temp.set_gender(gender);
        temp.set_color(color);
        temp.set_sleevetype(sleevetype);

        // Push ke dalam list
        llist.push_back(temp);

        cout << "================================================================================" << endl << endl;
    }

    // Output untuk mengeluarkan hasil akhir
    cout << "================================================================================" << endl;
    cout << "List of shirt :" << endl;
    cout << "================================================================================" << endl;

    // Looping sebanyak banyaknya data list shirt
    for (list<Shirt>::iterator it = llist.begin(); it != llist.end(); it++) {
        cout << "| " << it->get_id() << " | " << it->get_name() << " | " << it->get_brand() << " | " << it->get_price() << " | " << it->get_size()
        << " | " << it->get_material() << " | " << it->get_gender() << " | " << it->get_color() << " | " << it->get_sleevetype() << " |" << endl;
        cout << "================================================================================" << endl;
    }

    return 0;
}