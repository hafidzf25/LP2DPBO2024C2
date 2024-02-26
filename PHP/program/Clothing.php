
<?php
require ('Product.php');

// Deklarasi Class
class Clothing extends Product{
    private $size;
    private $material;
    private $gender;

    // Konstruktor
    public function __construct($material, $size, $gender) {
        parent::__construct($idProduct, $name, $brand, $price); // Call the constructor of the parent class
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