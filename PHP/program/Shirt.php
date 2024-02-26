
<?php

// Memanggil kembali suatu file untuk mengambil suatu classnya
require ('Clothing.php');

// Deklarasi Class
class Shirt extends Clothing{
    private $color;
    private $sleevetype;

    // Konstruktor
    public function __construct($id, $name, $brand, $price, $size, $material, $gender, $color, $sleevetype) {
        parent::__construct($id, $name, $brand, $price, $size, $material, $gender); // Memanggil konstruktor dari parentnya
        $this->sleevetype = $sleevetype;
        $this->color = $color;
    }

    // Getter dan Setter
    
    // Get sleevetype
    public function get_sleevetype() {
        return $this->sleevetype;
    }

    // Set sleevetype
    public function set_sleevetype($sleevetype) {
        $this->sleevetype = $sleevetype;
    }

    // Get color
    public function get_color() {
        return $this->color;
    }

    // Set color
    public function set_color($color) {
        $this->color = $color;
    }
}