# Import class file
from Shirt import Shirt

# Print output untuk meminta banyak data shirt
print("================================================================================")
n = int(input("Input many object of Shirt : "))
print("================================================================================\n")

# Array untuk menampung banyaknya data shirt
listofShirt= []

# Proses pengisian data shirt satu persatu
for i in range(n):
    print("================================================================================")
    print("Data ", i + 1)
    print("================================================================================")

    # Meminta data atributnya 1 1
    id = input("Input ID : ")
    Name = input("Input Name : ")
    Brand = input("Input Brand : ")
    Price = input("Input Price : ")
    Size = input("Input Size : ")
    Material = input("Input Material : ")
    Gender = input("Input Gender : ")
    Color = input("Input Color : ")
    Sleevetypes = input("Input Sleeve types : ")
    
    # Deklarasi object tampungan, dan memasukkannya dari data yang telah diinput sebelumnya
    Temp = Shirt()
    Temp.set_id(id)
    Temp.set_name(Name)
    Temp.set_brand(Brand)
    Temp.set_price(Price)
    Temp.set_size(Size)
    Temp.set_material(Material)
    Temp.set_gender(Gender)
    Temp.set_color(Color)
    Temp.set_sleevetype(Sleevetypes)

    # Memasukkan object sebelumnya ke dalam suatu list/array
    listofShirt.append(Temp)
    
    print("================================================================================\n")

# Proses untuk mengeluarkan data data dari suatu list/array
print("================================================================================")
print("List of shirt :")
print("================================================================================")

# For untuk mengeluarkan data 1 per 1 dari suatu array si listofShirt
for Shirt in listofShirt:
    print("|", Shirt.get_id(), "|", Shirt.get_name(), "|", Shirt.get_brand(), "|", Shirt.get_price(), "|", Shirt.get_size(), "|", Shirt.get_material(), "|", Shirt.get_gender(), "|", Shirt.get_color(), "|", Shirt.get_sleevetype(), "|")                                           

