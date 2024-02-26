// Library dari induk
#include "Product.cpp"

// Class Clothing, anak dari class Product
class Clothing : public Product
{
    // Atribut private yang dimiliki class Clothing
    private:
        string size, material, gender;

    // Method yang bisa diakses diluar
    public:
        Clothing() {
            this->size = "";
            this->material = "";
            this->gender = "";
        }
        Clothing(string size, string material, string gender) {
            this->size = size;
            this->material = material;
            this->gender = gender;
        }

        // Get size 
        string get_size() {
            return this->size;
        }

        // Set size
        void set_size(string size) {
            this->size = size;
        }

        // Get material 
        string get_material() {
            return this->material;
        }

        // Set material
        void set_material(string material) {
            this->material = material;
        }

        // Get gender 
        string get_gender() {
            return this->gender;
        }

        // Set gender
        void set_gender(string gender) {
            this->gender = gender;
        }

        ~Clothing(){

        }
};