# Deklarasi Class

class Product:

    # Privat (__), Protected (_), Public Atributes
    __id = ""
    __name = ""
    __brand = ""
    __price = ""

    # Konstruktor
    def __init__(self, name = "", id = "", brand = "", price = ""):
        self.__name = name
        self.__id = id
        self.__brand = brand
        self.__price = price

    # Getter dan Setter
        
    # Get Name
    def get_name(self):
        return self.__name
    
    # Set Name
    def set_name(self, name):
        self.__name = name

    # Get Id
    def get_id(self):
        return self.__id
    
    # Set Id
    def set_id(self, id):
        self.__id = id

    # Get brand
    def get_brand(self):
        return self.__brand
    
    # Set brand
    def set_brand(self, brand):
        self.__brand = brand

    # Get price
    def get_price(self):
        return self.__price
    
    # Set price
    def set_price(self, price):
        self.__price = price