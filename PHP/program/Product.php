<?php

// Deklarasi Class
class Product {
    private $id;
    private $name;
    private $brand;
    private $price;

    // Konstruktor
    public function __construct($name, $id, $brand, $price) {
        $this->name = $name;
        $this->id = $id;
        $this->brand = $brand;
        $this->price = $price;
    }

    // Getter dan Setter
    
    // Get name
    public function get_name() {
        return $this->name;
    }

    // Set name
    public function set_name($name) {
        $this->name = $name;
    }

    // Get id
    public function get_id() {
        return $this->id;
    }

    // Set id
    public function set_id($id) {
        $this->id = $id;
    }

    // Get brand
    public function get_brand() {
        return $this->brand;
    }

    // Set brand
    public function set_brand($brand) {
        $this->brand = $brand;
    }

    // Get price
    public function get_price() {
        return $this->price;
    }

    // Set price
    public function set_price($price) {
        $this->price = $price;
    }
}