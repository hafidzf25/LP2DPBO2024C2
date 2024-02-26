// Import Library
#include <iostream>
#include <string>

// Using standard namespace
using namespace std;

// Deklarasi Class, di C++ tidak perlu kapital, tetapi lebih baik menggunakannya.
class Product
{
    // Private attribut untuk Product
    private:
        string id, name, brand, price;
    public:
        Product() {
            this->id = "";
            this->name = "";
            this->brand = "";
            this->price = "";
        }
        Product(string id, string name, string brand, string price) {
            this->id = id;
            this->name = name;
            this->brand = brand;
            this->price = price;    
        }

        // Get id 
        string get_id() {
            return this->id;
        }

        // Set id
        void set_id(string id) {
            this->id = id;
        }

        // Get name 
        string get_name() {
            return this->name;
        }

        // Set name
        void set_name(string name) {
            this->name = name;
        }

        // Get brand 
        string get_brand() {
            return this->brand;
        }

        // Set brand
        void set_brand(string brand) {
            this->brand = brand;
        }

        // Get price 
        string get_price() {
            return this->price;
        }

        // Set price
        void set_price(string price) {
            this->price = price;
        }
        
        ~Product() {

        }
};