
<?php
// Memanggil file product.php untuk mencomot classnya
require ('Product.php');

// Deklarasi Class Anak dari Product
class Clothing extends Product{
    private $size;
    private $material;
    private $gender;

    // Konstruktor
    public function __construct($id, $name, $brand, $price, $size, $material, $gender) {
        parent::__construct($id, $name, $brand, $price);// Memanggil konstruktor dari parentnya
        $this->material = $material;
        $this->size = $size;
        $this->gender = $gender;
    }

    // Getter dan Setter
    
    // Get material
    public function get_material() {
        return $this->material;
    }

    // Set material
    public function set_material($material) {
        $this->material = $material;
    }

    // Get size
    public function get_size() {
        return $this->size;
    }

    // Set size
    public function set_size($size) {
        $this->size = $size;
    }

    // Get gender
    public function get_gender() {
        return $this->gender;
    }

    // Set gender
    public function set_gender($gender) {
        $this->gender = $gender;
    }
}