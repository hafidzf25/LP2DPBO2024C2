// Import library dari induk
#include "Clothing.cpp"

// Class Shirt, yang merupakan anak dari Class Clothing
class Shirt : public Clothing
{
    // Atribut private yang dimiliki shirt
    private:
        string color, sleevetype;

    // Method yang bisa dilakukan oleh class Shirt
    public:
        Shirt() {
            this->color = "";
            this->sleevetype = "";
        }
        Shirt(string color, string sleevetype, string gender) {
            this->color = color;
            this->sleevetype = sleevetype;
        }

        // Get color 
        string get_color() {
            return this->color;
        }

        // Set color
        void set_color(string color) {
            this->color = color;
        }

        // Get sleevetype 
        string get_sleevetype() {
            return this->sleevetype;
        }

        // Set sleevetype
        void set_sleevetype(string sleevetype) {
            this->sleevetype = sleevetype;
        }

        ~Shirt(){

        }
};