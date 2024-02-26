<?php

require ('Shirt.php');

// Membuat objek anggota DPR dan menambahkannya
$Shirt1 = new Shirt("1", "Shirt A", "Golkar", "50k", "S", "Beton", "Laki-laki", "Biru", "Panjang");
$Shirt2 = new Shirt("1", "Shirt B", "PKI", "40k", "S", "Beton", "Laki-laki", "Biru", "Panjang");
$Shirt3 = new Shirt("1", "Shirt C", "PKS", "30k", "L", "Beton", "Perempuan", "Biru", "Panjang");
$Shirt4 = new Shirt("1", "Shirt D", "Golkar", "20k", "S", "Beton", "Laki-laki", "Biru", "Panjang");
$Shirt5 = new Shirt("1", "Shirt E", "PDI", "10k", "M", "Beton", "Laki-laki", "Biru", "Panjang");

// Mendeklarasikan array dan memasukkan object yang telah dibuat
$daftarShirt = [];
array_push($daftarShirt, $Shirt1);
array_push($daftarShirt, $Shirt2);
array_push($daftarShirt, $Shirt3);
array_push($daftarShirt, $Shirt4);
array_push($daftarShirt, $Shirt5);

// Menampilkan hasil tambah data 

echo "Showing list of shirt";

echo "<table border='2'>";
echo "<tr>";
echo "<th>ID</th>";
echo "<th>Name</th>";
echo "<th>Brand</th>";
echo "<th>Price</th>";
echo "<th>Size</th>";
echo "<th>Material</th>";
echo "<th>Gender</th>";
echo "<th>Color</th>";
echo "<th>Sleeve Type</th>";
echo "</tr>";

foreach ($daftarShirt as $anggota) {
    echo "<tr>";
    echo "<td>" . $anggota->get_id() . "</td>";
    echo "<td>" . $anggota->get_name() . "</td>";
    echo "<td>" . $anggota->get_brand() . "</td>";
    echo "<td>" . $anggota->get_price() . "</td>";
    echo "<td>" . $anggota->get_size() . "</td>";
    echo "<td>" . $anggota->get_material() . "</td>";
    echo "<td>" . $anggota->get_gender() . "</td>";
    echo "<td>" . $anggota->get_color() . "</td>";
    echo "<td>" . $anggota->get_sleevetype() . "</td>";
    echo "</tr>";
}
echo "</table>";